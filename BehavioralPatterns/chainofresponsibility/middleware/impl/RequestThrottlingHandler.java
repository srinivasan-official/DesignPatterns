package chainofresponsibility.middleware.impl;

import chainofresponsibility.middleware.RequestHandler;
import chainofresponsibility.middleware.bean.Request;

public class RequestThrottlingHandler extends RequestHandler {
	private int maxReqPerMin;
	private int noOfReq;
	private long time;
	
	public RequestThrottlingHandler(int maxReqPerMin) {
		this.maxReqPerMin = maxReqPerMin;
		this.time = System.currentTimeMillis();
	}
	
	@Override
	public boolean validate(Request request) {
		if(time + 60000 <= System.currentTimeMillis()) {
			time = System.currentTimeMillis();
			noOfReq = 0;
		}
		if(noOfReq > maxReqPerMin) {
			System.err.println("Request limit exceeded");
			return false;
		}
		noOfReq++;
		return super.validateChainHandler(request);
	}

}
