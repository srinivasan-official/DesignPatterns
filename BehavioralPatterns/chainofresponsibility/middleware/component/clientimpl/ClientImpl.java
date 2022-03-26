package chainofresponsibility.middleware.component.clientimpl;

import chainofresponsibility.middleware.bean.Request;
import chainofresponsibility.middleware.component.Cache;
import chainofresponsibility.middleware.component.Client;

class ClientImpl implements Client {

	@Override
	public boolean logIn(Request request) {
		System.out.println("Logged in to server");
		return true;
	}

	@Override
	public void register(Request request) {
		Cache.getInstance().put(request.getEmail(), request.getPassword());
	}

}
