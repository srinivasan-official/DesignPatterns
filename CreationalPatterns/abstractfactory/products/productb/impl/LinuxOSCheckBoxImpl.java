package abstractfactory.products.productb.impl;

import abstractfactory.products.productb.CheckBox;

public class LinuxOSCheckBoxImpl implements CheckBox {

	@Override
	public void renderCheckBox() {
		System.out.println("Check Box created via JRE running on Linux OS");
	}

}
