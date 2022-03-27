package command.implementation.command;

import command.implementation.component.Editor;

public abstract class Command {
	protected Editor editor;
	private String backup;
	
	public Command(Editor editor) {
		this.editor = editor;
	}
	
	public abstract boolean execute();
	
	public void backup() {
		backup = editor.getTextBox().getText();
	}
	
	public void restore() {
		editor.getTextBox().setText(backup);
	}
}
