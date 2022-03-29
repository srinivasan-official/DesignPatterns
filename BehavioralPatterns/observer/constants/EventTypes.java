package observer.constants;

import java.util.Arrays;
import java.util.List;

public enum EventTypes {
	OPEN("open"), SAVE("save");
	
	private String eventType;
	
	private EventTypes(String eventType) {
		this.eventType = eventType;
	}
	
	public String getEventType() {
		return this.eventType;
	}
	
	public static List<EventTypes> getSupportedEvents() {
		return Arrays.asList(EventTypes.OPEN, EventTypes.SAVE);
	}
}
