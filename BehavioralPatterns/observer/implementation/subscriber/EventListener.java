package observer.implementation.subscriber;

import java.io.File;

import observer.constants.EventTypes;

public interface EventListener {
	public void update(EventTypes eventType, File fileName);
}
