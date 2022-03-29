package observer.implementation.publisher;

import java.io.File;

import observer.constants.EventTypes;
import observer.implementation.subscriber.EventListener;

public class Editor {
	private EventManager eventManager;
	private File file;
	
	public Editor() {
		this.eventManager = new EventManager(EventTypes.getSupportedEvents());
	}
	
	public void addSubscriber(EventTypes eventType, EventListener eventListener) {
		boolean status = eventManager.subscribe(eventType, eventListener);
		if(status) {
			System.out.println("Successfully subscribed");
		}
	}
	
	public void removeSubscriber(EventTypes eventType, EventListener eventListener) {
		boolean status = eventManager.unsubscribe(eventType, eventListener);
		if(status) {
			System.out.println("Successfully unsubscribed");
		}
	}
	
	public void openFile(String filePath) {
		file = new File(filePath);
		eventManager.notify(EventTypes.OPEN, file);
	}
	
	public void saveFile() throws Exception {
		if(file == null) new Exception("Open the file first");
		eventManager.notify(EventTypes.SAVE, file);
	}
}
