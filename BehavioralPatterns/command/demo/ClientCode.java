package command.demo;

import command.implementation.component.Editor;

public class ClientCode {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.setText("Hi, There");
		editor.executeButton("CopyButton");
		editor.executeButton("CutButton");
		editor.executeButton("PasteButton");
	}

}
