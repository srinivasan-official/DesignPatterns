package decorator.implementation;

import java.util.ArrayList;
import java.util.List;

import decorator.component.Reader;
import decorator.component.core.ReaderImpl;
import decorator.component.decorator.impl.Authentication;
import decorator.component.decorator.impl.Scramble;

public class ClientCode {

	//TODO: need to add more example
	public static void main(String[] args) throws Exception {
		ClientCode clientCode = new ClientCode();
		clientCode.buildReader();
		clientCode.buildReaderWithAuth();
		clientCode.buildReaderWithEncryption();
		clientCode.buildReaderWithAuthAndEncryption();
	}
	
	public void buildReaderWithAuthAndEncryption() throws Exception {
		Reader reader = new Authentication(new Scramble(new ReaderImpl()));
		List<String> str = new ArrayList<>();
		reader.read(str);
		reader.write(str);
	}
	
	public void buildReaderWithAuth() throws Exception {
		Reader reader = new Authentication(new ReaderImpl());
		List<String> str = new ArrayList<>();
		reader.read(str);
		reader.write(str);
	}
	
	public void buildReaderWithEncryption() throws Exception {
		Reader reader = new Scramble(new ReaderImpl());
		List<String> str = new ArrayList<>();
		reader.read(str);
		reader.write(str);
	}
	
	public void buildReader() throws Exception {
		Reader reader = new ReaderImpl();
		List<String> str = new ArrayList<>();
		reader.read(str);
		reader.write(str);
	}

}
