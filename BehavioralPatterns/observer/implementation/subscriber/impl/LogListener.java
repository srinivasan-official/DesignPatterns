package observer.implementation.subscriber.impl;

import java.io.File;

import observer.constants.EventTypes;
import observer.implementation.subscriber.EventListener;

public class LogListener implements EventListener {
	private File log;
	
	public LogListener(String fileName) {
		this.log = new File(fileName);
	}
	
	@Override
	public void update(EventTypes eventType, File file) {
		System.out.println("Save to log " + log + ": someone has performed " +  eventType
				+ " operation in the following file " + file.getName());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof LogListener))
			return false;
		LogListener logListener = (LogListener) obj;
		return this.log.getName().equals(logListener.log.getName());
	}

}
