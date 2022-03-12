package factory.service.impl;

import factory.service.Notification;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Email Notification send");
	}

}
