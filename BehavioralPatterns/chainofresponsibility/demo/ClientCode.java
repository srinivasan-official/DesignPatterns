package chainofresponsibility.demo;

import chainofresponsibility.middleware.RequestHandler;
import chainofresponsibility.middleware.bean.Request;
import chainofresponsibility.middleware.component.Client;
import chainofresponsibility.middleware.component.clientimpl.ProxyClient;
import chainofresponsibility.middleware.impl.NewUserHandler;
import chainofresponsibility.middleware.impl.RequestThrottlingHandler;
import chainofresponsibility.middleware.impl.RoleCheckHandler;
import chainofresponsibility.middleware.impl.UserExistsHandler;

public class ClientCode {

	public static void main(String[] args) {
		ClientCode clientCode = new ClientCode();
		clientCode.login(new Request("admin@example.com", "admin_pass", "10.2.0.154"));
		clientCode.registerClient(new Request("admin@example.com", "admin_pass", "10.2.0.154"));
		clientCode.registerClient(new Request("user@example.com", "user_pass", "10.2.0.156"));
		clientCode.registerClient(new Request("admin@example.com", "admin_pass", "10.2.0.155"));
		clientCode.login(new Request("admin@example.com", "admin_pass", "10.2.0.154"));
	}

	private void registerClient(Request request) {
		RequestHandler handler = new NewUserHandler();
		Client client = new ProxyClient(handler);
		client.register(request);
		System.out.println();
	}
	
	private void login(Request request) {
		RequestHandler handler = new RequestThrottlingHandler(5);
		handler.linkHandler(new UserExistsHandler())
				.linkHandler(new RoleCheckHandler());
		Client client = new ProxyClient(handler);
		client.logIn(request);
		System.out.println();
	}
}
