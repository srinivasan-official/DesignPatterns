package abstractfactory.factory.concretefactoryimpl;

import abstractfactory.factory.GUIFactory;
import abstractfactory.products.producta.Button;
import abstractfactory.products.producta.impl.MacOSButtonImpl;
import abstractfactory.products.productb.CheckBox;
import abstractfactory.products.productb.impl.MacOSCheckBoxImpl;

public class MacGUIFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButtonImpl();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacOSCheckBoxImpl();
	}

}
