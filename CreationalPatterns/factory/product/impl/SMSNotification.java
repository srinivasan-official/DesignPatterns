package factory.product.impl;

import factory.product.Notification;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("SMS Notification send");
	}

}
