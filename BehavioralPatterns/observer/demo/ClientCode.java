package observer.demo;

import observer.constants.EventTypes;
import observer.implementation.publisher.Editor;
import observer.implementation.subscriber.impl.EmailListener;
import observer.implementation.subscriber.impl.LogListener;

public class ClientCode {

	public static void main(String[] args) throws Exception {
		Editor editor = new Editor();
		editor.addSubscriber(EventTypes.OPEN, new EmailListener("abc@domain.com"));
		editor.addSubscriber(EventTypes.SAVE, new EmailListener("efg@domain.com"));
		editor.addSubscriber(EventTypes.SAVE, new LogListener("logs.txt"));
		
		editor.openFile("test.txt");
		editor.saveFile();
		
		editor.removeSubscriber(EventTypes.SAVE, new EmailListener("efg@domain.com"));
		editor.saveFile();
	}

}
