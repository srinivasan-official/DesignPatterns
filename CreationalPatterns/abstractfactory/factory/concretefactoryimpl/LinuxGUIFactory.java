package abstractfactory.factory.concretefactoryimpl;

import abstractfactory.factory.GUIFactory;
import abstractfactory.products.producta.Button;
import abstractfactory.products.producta.impl.LinuxOSButtonImpl;
import abstractfactory.products.productb.CheckBox;
import abstractfactory.products.productb.impl.LinuxOSCheckBoxImpl;

public class LinuxGUIFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new LinuxOSButtonImpl();
	}

	@Override
	public CheckBox createCheckBox() {
		return new LinuxOSCheckBoxImpl();
	}

}
