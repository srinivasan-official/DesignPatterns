package factory.implementation;

import factory.constants.SupportedNotificationServices;
import factory.product.Notification;
import factory.servicefactory.NotificationFactory;

public class NotificationService {

	public static void main(String[] args) {
		try {
			Notification notification = NotificationFactory.getInstance(SupportedNotificationServices.SMS_NOTIFICATION);
			notification.notifyUser();
			
			notification = NotificationFactory.getInstance(SupportedNotificationServices.EMAIL_NOTIFICATION);
			notification.notifyUser();
			
			notification = NotificationFactory.getInstance(SupportedNotificationServices.PUSH_NOTIFICATION);
			notification.notifyUser();
			
			notification = NotificationFactory.getInstance(SupportedNotificationServices.UNSUPPORTED_NOTIFICATION);
			notification.notifyUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
