package decorator.component;

import java.util.List;

public interface Reader {
	public void read(List<String> str) throws Exception;
	public void write(List<String> str) throws Exception;
}
