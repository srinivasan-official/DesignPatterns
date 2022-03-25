package proxy.implementation.proxy;

import proxy.implementation.Internet;

class RealInternet implements Internet {

	@Override
	public void connectTo(String domain) throws Exception {
		System.out.println("Successfully connected to " + domain);
	}

}
