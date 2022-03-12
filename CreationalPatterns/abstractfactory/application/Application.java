package abstractfactory.application;

import abstractfactory.factory.GUIFactory;
import abstractfactory.products.producta.Button;
import abstractfactory.products.productb.CheckBox;

public class Application {
	Button button;
	CheckBox checkBox;
	
	public Application(GUIFactory factory) {
		this.button = factory.createButton();
		this.checkBox = factory.createCheckBox();
	}
	
	public void renderUI() {
		button.renderButton();
		checkBox.renderCheckBox();
	}
}
