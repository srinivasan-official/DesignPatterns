package abstractfactory.factory;

import abstractfactory.constants.SupportedOS;
import abstractfactory.factory.concretefactoryimpl.LinuxGUIFactory;
import abstractfactory.factory.concretefactoryimpl.MacGUIFactory;
import abstractfactory.factory.concretefactoryimpl.WindowsGUIFactory;
import abstractfactory.products.producta.Button;
import abstractfactory.products.productb.CheckBox;

public interface GUIFactory {
	Button createButton();
	CheckBox createCheckBox();
	
	public static GUIFactory getInstance(SupportedOS os) throws Exception {
		if(SupportedOS.MAC_OS.equals(os)) {
			return new MacGUIFactory();
		} else if(SupportedOS.LINUX_OS.equals(os)) {
			return new LinuxGUIFactory();
		} else if(SupportedOS.WINDOWS_OS.equals(os)) {
			return new WindowsGUIFactory();
		}
		throw new Exception("Unsupported OS Platform");
	}
}
