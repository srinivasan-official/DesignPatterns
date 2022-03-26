package chainofresponsibility.middleware.impl;

import chainofresponsibility.middleware.RequestHandler;
import chainofresponsibility.middleware.bean.Request;
import chainofresponsibility.middleware.component.Cache;

public class UserExistsHandler extends RequestHandler {

	@Override
	public boolean validate(Request request) {
		Cache cache = Cache.getInstance();
		if(!cache.isEmailExists(request.getEmail())) {
			System.err.println("Email doesn't exists");
			return false;
		}
		if(!cache.isPasswordMatch(request.getEmail(), request.getPassword())) {
			System.err.println("Wrong password");
			return false;
		}
		return super.validateChainHandler(request);
	}

}
