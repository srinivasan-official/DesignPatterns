package chainofresponsibility.middleware.component;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	private volatile Map<String, String> map;
	private static Cache cache;
	
	private Cache() {
		this.map = new HashMap<>();
	}
	
	public static Cache getInstance() {
		if(cache == null) cache = new Cache();
		return cache;
	}
	
	public void put(String email, String password) {
		map.put(email, password);
	}
	
	public boolean isEmailExists(String email) {
		return map.containsKey(email);
	}
	
	public boolean isPasswordMatch(String email, String password) {
		return password.equals(map.get(email));
	}
}
