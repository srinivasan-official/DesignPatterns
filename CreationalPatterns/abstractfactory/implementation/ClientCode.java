package abstractfactory.implementation;

import abstractfactory.application.Application;
import abstractfactory.constants.SupportedOS;
import abstractfactory.factory.GUIFactory;

public class ClientCode {

	public static void main(String[] args) {
		ClientCode clientCode = new ClientCode();
		clientCode.startApplication(SupportedOS.MAC_OS);
		clientCode.startApplication(SupportedOS.LINUX_OS);
		clientCode.startApplication(SupportedOS.WINDOWS_OS);
		clientCode.startApplication(SupportedOS.UNIX_OS);
	}
	
	public void startApplication(SupportedOS os) {
		try {
			GUIFactory factory = GUIFactory.getInstance(os);
			Application application = new Application(factory);
			application.renderUI();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
