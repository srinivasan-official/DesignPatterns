package decorator.component.decorator.impl;

import java.io.BufferedReader;
import java.util.List;

import decorator.component.Reader;
import decorator.component.decorator.AbstractReader;
import decorator.util.ReaderUtil;

public class Authentication extends AbstractReader implements Reader {
	private String password;
	
	public Authentication(Reader reader) {
		super(reader);
	}
	
	@Override
	public void read(List<String> str) throws Exception {
		System.out.println("Enter Password : ");
		BufferedReader reader = ReaderUtil.getReader();
		this.password = reader.readLine();
		super.read(str);
	}

	@Override
	public void write(List<String> str) throws Exception {
		System.out.println("Enter Password : ");
		BufferedReader reader = ReaderUtil.getReader();
		if(!password.equals(reader.readLine()))
			throw new Exception("Password Mismatch");
		super.write(str);
	}

}
