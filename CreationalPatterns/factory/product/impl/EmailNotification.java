package factory.product.impl;

import factory.product.Notification;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Email Notification send");
	}

}
