package singleton.product;

public class Singleton {
	private static Singleton instance;
	private String value;
	
	private Singleton(String value) {
		this.value = value;
	}
	
	public static synchronized Singleton getInstance(String value) {
		if(instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}
	
	public String getValue() {
		return this.value;
	}
}
