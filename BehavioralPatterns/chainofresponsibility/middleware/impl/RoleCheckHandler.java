package chainofresponsibility.middleware.impl;

import chainofresponsibility.middleware.RequestHandler;
import chainofresponsibility.middleware.bean.Request;

public class RoleCheckHandler extends RequestHandler {

	@Override
	public boolean validate(Request request) {
		if(request.getEmail().equals("admin@example.com")) {
			System.out.println("Hello, admin");
			return true;
		}
		System.out.println("Hello, user");
		return super.validateChainHandler(request);
	}

}
