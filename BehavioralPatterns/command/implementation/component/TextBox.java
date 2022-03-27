package command.implementation.component;

public class TextBox {
	private String text;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getSelectedText() {
		return this.text;
	}
	
	public boolean isEmpty() {
		return text==null || text.isEmpty();
	}
}
