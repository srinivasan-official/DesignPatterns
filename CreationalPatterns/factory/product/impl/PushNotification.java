package factory.product.impl;

import factory.product.Notification;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Push Notification send");
	}

}
