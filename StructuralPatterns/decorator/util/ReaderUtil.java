package decorator.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReaderUtil {
	private static BufferedReader reader;
	
	public static BufferedReader getReader() {
		if(reader == null) {
			reader = new BufferedReader(new InputStreamReader(System.in));
		}
		return reader;
	}
	
	public static void clearBuffer() throws Exception {
		reader.close();
	}
}
