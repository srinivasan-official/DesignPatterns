package chainofresponsibility.middleware.component;

import chainofresponsibility.middleware.bean.Request;

public interface Client {
	public boolean logIn(Request request);
	public void register(Request request);
}
