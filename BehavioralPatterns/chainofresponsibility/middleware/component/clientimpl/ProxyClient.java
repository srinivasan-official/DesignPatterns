package chainofresponsibility.middleware.component.clientimpl;

import chainofresponsibility.middleware.RequestHandler;
import chainofresponsibility.middleware.bean.Request;
import chainofresponsibility.middleware.component.Client;

public class ProxyClient implements Client {
	private RequestHandler requestHandler;
	private ClientImpl client;

	public ProxyClient(RequestHandler requestHandler) {
		this.requestHandler = requestHandler;
		this.client = new ClientImpl();
	}

	@Override
	public boolean logIn(Request request) {
		if(requestHandler.validate(request)) {
			System.out.println("Authentication and Authorization successfull");
			return client.logIn(request);
		}
		return false;
	}

	@Override
	public void register(Request request) {
		if(requestHandler.validate(request)) {
			client.register(request);
			System.out.println("Successfully registered email : " + request.getEmail());
		}
	}

}
