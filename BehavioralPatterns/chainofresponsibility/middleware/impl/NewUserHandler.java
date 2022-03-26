package chainofresponsibility.middleware.impl;

import chainofresponsibility.middleware.RequestHandler;
import chainofresponsibility.middleware.bean.Request;
import chainofresponsibility.middleware.component.Cache;

public class NewUserHandler extends RequestHandler {

	@Override
	public boolean validate(Request request) {
		Cache cache = Cache.getInstance();
		if(cache.isEmailExists(request.getEmail())) {
			System.err.println("Email : " + request.getEmail() + " already exists");
			return false;
		}
		return super.validateChainHandler(request);
	}

}
