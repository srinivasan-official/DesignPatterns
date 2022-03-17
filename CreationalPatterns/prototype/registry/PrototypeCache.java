package prototype.registry;

import java.util.HashMap;
import java.util.Map;

import prototype.product.Shape;

public class PrototypeCache {
	private static Map<String, Shape> cache = new HashMap<>();
	
	public static void put(String key, Shape shape) {
		cache.put(key, shape);
	}
	
	public static Shape get(String key) {
		return cache.get(key);
	}
}
