package command.implementation.component;

import java.util.HashMap;
import java.util.Map;

import command.implementation.command.Command;
import command.implementation.command.impl.CopyCommand;
import command.implementation.command.impl.CutCommand;
import command.implementation.command.impl.PasteCommand;

public class Editor {
	private TextBox textBox;
	private CommandHistory commandHistory;
	private Map<String, Button> buttons;
	private String clipBoard;
	
	public Editor() {
		this.textBox = new TextBox();
		this.commandHistory = new CommandHistory();
		this.buttons = new HashMap<>();
		initButtons();
	}
	
	private void initButtons() {
		buttons.put("CopyButton", new Button("CopyButton", () -> executeCommand(new CopyCommand(this))));
		buttons.put("CutButton", new Button("CutButton", () -> executeCommand(new CutCommand(this))));
		buttons.put("PasteButton", new Button("PasteButton", () -> executeCommand(new PasteCommand(this))));
	}
	
	private void executeCommand(Command command) {
		if(command.execute()) {
			commandHistory.push(command);
		}
	}
	
	public void executeButton(String buttonName) {
		buttons.get(buttonName).execute();
	}
	
	public String getClipBoard() {
		return this.clipBoard;
	}
	
	public void setClipBoard(String clipBoard) {
		this.clipBoard = clipBoard;
	}
	
	public void setText(String text) {
		this.textBox.setText(text);
	}
	
	public TextBox getTextBox() {
		return this.textBox;
	}
	
	public boolean isClipBoardEmpty() {
		return clipBoard==null || clipBoard.isEmpty();
	}
}
