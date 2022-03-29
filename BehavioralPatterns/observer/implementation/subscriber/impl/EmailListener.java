package observer.implementation.subscriber.impl;

import java.io.File;

import observer.constants.EventTypes;
import observer.implementation.subscriber.EventListener;

public class EmailListener implements EventListener {
	private String email;
	
	public EmailListener(String email) {
		this.email = email;
	}

	@Override
	public void update(EventTypes eventType, File fileName) {
		System.out.println("Email send to " + email + " : Someone has performed " + eventType 
				+ " operation in the following file " + fileName.getName());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof EmailListener))
			return false;
		EmailListener emailListener = (EmailListener) obj;
		return this.email.equals(emailListener.email);
	}

}
