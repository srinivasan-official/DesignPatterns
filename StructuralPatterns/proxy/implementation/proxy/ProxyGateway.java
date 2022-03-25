package proxy.implementation.proxy;

import java.util.Arrays;
import java.util.List;

import proxy.implementation.Internet;

public class ProxyGateway implements Internet {
	private static final List<String> BLOCKED_SITES = init();
	private Internet internet;
	
	public ProxyGateway() {
		this.internet = new RealInternet();
	}
	
	@Override
	public void connectTo(String domain) throws Exception {
		if(BLOCKED_SITES.contains(domain))
			throw new Exception("Access Denied");
		internet.connectTo(domain);
	}

	private static final List<String> init() {
		return Arrays.asList("abc.com", "def.com", "hij.com");
	}
}
