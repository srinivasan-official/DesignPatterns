package command.implementation.component;

import java.util.Stack;
import command.implementation.command.Command;

public class CommandHistory {
	private Stack<Command> commandHistory;
	
	public CommandHistory() {
		this.commandHistory = new Stack<>();
	}
	
	public void push(Command command) {
		commandHistory.push(command);
	}
	
	public void pop(Command command) {
		commandHistory.pop();
	}
	
	public boolean isEmpty() {
		return commandHistory.isEmpty();
	}
}
