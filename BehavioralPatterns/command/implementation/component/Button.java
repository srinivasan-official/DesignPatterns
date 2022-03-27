package command.implementation.component;

public class Button {
	private String buttonName;
	private ButtonAction buttonAction;
	
	public Button(String buttonName, ButtonAction buttonAction) {
		this.buttonName = buttonName;
		this.buttonAction = buttonAction;
	}
	
	public void execute() {
		System.out.println(buttonName + " Triggered");
		buttonAction.execute();
	}
}
