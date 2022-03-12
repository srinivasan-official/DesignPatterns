package abstractfactory.factory.concretefactoryimpl;

import abstractfactory.factory.GUIFactory;
import abstractfactory.products.producta.Button;
import abstractfactory.products.producta.impl.WindowsOSButtonImpl;
import abstractfactory.products.productb.CheckBox;
import abstractfactory.products.productb.impl.WindowsOSCheckBoxImpl;

public class WindowsGUIFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsOSButtonImpl();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindowsOSCheckBoxImpl();
	}

}
