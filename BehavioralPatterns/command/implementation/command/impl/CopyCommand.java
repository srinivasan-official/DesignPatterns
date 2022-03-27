package command.implementation.command.impl;

import command.implementation.command.Command;
import command.implementation.component.Editor;

public class CopyCommand extends Command {

	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if(editor.getTextBox().isEmpty()) return false;
		editor.setClipBoard(editor.getTextBox().getSelectedText());
		return true;
	}

}
