package proxy.demo;

import proxy.implementation.Internet;
import proxy.implementation.proxy.ProxyGateway;

public class ClientCode {

	public static void main(String[] args) throws Exception {
		Internet internet = new ProxyGateway();
		internet.connectTo("GeeksForGeeks.com");
		internet.connectTo("abc.com");
	}

}
