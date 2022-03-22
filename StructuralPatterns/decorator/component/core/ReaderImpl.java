package decorator.component.core;

import java.io.BufferedReader;
import java.util.List;

import decorator.component.Reader;
import decorator.util.ReaderUtil;

public class ReaderImpl implements Reader {

	@Override
	public void read(List<String> str) throws Exception {
		BufferedReader reader = ReaderUtil.getReader();
		System.out.println("Enter Input Text : ");
		str.add(reader.readLine());
	}

	@Override
	public void write(List<String> str) throws Exception {
		System.out.println(str.iterator().next());
	}

}
