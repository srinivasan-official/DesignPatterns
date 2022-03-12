package abstractfactory.products.productb.impl;

import abstractfactory.products.productb.CheckBox;

public class WindowsOSCheckBoxImpl implements CheckBox {

	@Override
	public void renderCheckBox() {
		System.out.println("Check Box created via JRE running on Windows OS");
	}

}
