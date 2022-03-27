package command.implementation.command.impl;

import command.implementation.command.Command;
import command.implementation.component.Editor;

public class PasteCommand extends Command {

	public PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if(editor.isClipBoardEmpty()) return false;
		backup();
		editor.getTextBox().setText(editor.getClipBoard());
		return false;
	}

}
