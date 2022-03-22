package decorator.component.decorator;

import java.util.List;

import decorator.component.Reader;

public abstract class AbstractReader implements Reader {
	private Reader reader;
	
	public AbstractReader(Reader reader) {
		this.reader = reader;
	}

	@Override
	public void read(List<String> str) throws Exception {
		reader.read(str);
	}

	@Override
	public void write(List<String> str) throws Exception {
		reader.write(str);
	}

}
