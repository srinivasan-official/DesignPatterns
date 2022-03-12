package factory.service.impl;

import factory.service.Notification;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("SMS Notification send");
	}

}
