package decorator.component.decorator.impl;

import java.util.List;

import decorator.component.Reader;
import decorator.component.decorator.AbstractReader;

public class Scramble extends AbstractReader implements Reader {

	public Scramble(Reader reader) {
		super(reader);
	}

	@Override
	public void read(List<String> str) throws Exception {
		super.read(str);
		String encryptedString = encryptString(str.iterator().next());
		System.out.println("Encrypted String : " + encryptedString);
		str.set(0, encryptedString);
	}

	@Override
	public void write(List<String> str) throws Exception {
		System.out.print("Decrypted String : ");
		String decryptedString = decryptString(str.iterator().next());
		str.set(0, decryptedString);
		super.write(str);
	}
	
	private String encryptString(String inputString) {
		StringBuffer sb = new StringBuffer(inputString);
		for (int i=0; i<sb.length(); i++)
	        sb.setCharAt(i, (char)(sb.charAt(i) - 5));
		return sb.toString();
	}
	
	private String decryptString(String encryptedString) {
		StringBuffer sb = new StringBuffer(encryptedString);
		for (int i=0; i<sb.length(); i++)
	        sb.setCharAt(i, (char)(sb.charAt(i) + 5));
		return sb.toString();
	}
	
}
