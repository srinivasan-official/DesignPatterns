package chainofresponsibility.middleware;

import chainofresponsibility.middleware.bean.Request;

public abstract class RequestHandler {
	private RequestHandler chainHandler;
	
	public RequestHandler linkHandler(RequestHandler chainHandler) {
		this.chainHandler = chainHandler;
		return chainHandler;
	}
	
	public abstract boolean validate(Request request);
	
	protected boolean validateChainHandler(Request request) {
		if(chainHandler == null) return true;
		return this.chainHandler.validate(request);
	}
	
}
