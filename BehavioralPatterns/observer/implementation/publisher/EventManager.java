package observer.implementation.publisher;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import observer.constants.EventTypes;
import observer.implementation.subscriber.EventListener;

public class EventManager {
	private Map<EventTypes, List<EventListener>> listeners;
	
	public EventManager(List<EventTypes> eventTypes) {
		listeners = new HashMap<>();
		for(EventTypes eventType : eventTypes) {
			listeners.put(eventType, new ArrayList<>());
		}
	}
	
	public boolean subscribe(EventTypes eventType, EventListener subscriber) {
		listeners.get(eventType).add(subscriber);
		return true;
	}
	
	public boolean unsubscribe(EventTypes eventType, EventListener subscriber) {
		listeners.get(eventType).remove(subscriber);
		return true;
	}
	
	public void notify(EventTypes eventType, File file) {
		listeners.get(eventType)
			.forEach(subscriber -> {
				subscriber.update(eventType, file);
			});
	}
}
