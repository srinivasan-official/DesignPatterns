package abstractfactory.products.productb.impl;

import abstractfactory.products.productb.CheckBox;

public class MacOSCheckBoxImpl implements CheckBox {

	@Override
	public void renderCheckBox() {
		System.out.println("Check Box created via JRE running on Mac OS");
	}

}
