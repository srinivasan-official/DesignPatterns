package factory.service.impl;

import factory.service.Notification;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Push Notification send");
	}

}
