package command.implementation.command.impl;

import command.implementation.command.Command;
import command.implementation.component.Editor;

public class CutCommand extends Command {

	public CutCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if(editor.getTextBox().isEmpty()) return false;
		backup();
		editor.setClipBoard(editor.getTextBox().getText());
		editor.getTextBox().setText(null);
		return false;
	}

}
