package abstractfactory.products.producta.impl;

import abstractfactory.products.producta.Button;

public class MacOSButtonImpl implements Button {

	@Override
	public void renderButton() {
		System.out.println("Button created via JRE running on Mac OS");
	}

}
