package singleton.implementation;

import singleton.product.Singleton;

public class ClientCode {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance("FOO");
		Singleton instance2 = Singleton.getInstance("BAR");
		System.out.println(instance1.getValue());
		System.out.println(instance2.getValue());
	}

}
