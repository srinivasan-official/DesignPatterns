package factory.servicefactory;

import factory.constants.SupportedNotificationServices;
import factory.product.Notification;
import factory.product.impl.EmailNotification;
import factory.product.impl.PushNotification;
import factory.product.impl.SMSNotification;

public class NotificationFactory {
	public static Notification getInstance(SupportedNotificationServices notificationType) throws Exception {
		if(SupportedNotificationServices.SMS_NOTIFICATION.equals(notificationType)) {
			return new SMSNotification();
		} else if(SupportedNotificationServices.EMAIL_NOTIFICATION.equals(notificationType)) {
			return new EmailNotification();
		} else if(SupportedNotificationServices.PUSH_NOTIFICATION.equals(notificationType)){
			return new PushNotification();
		} 
		throw new Exception(SupportedNotificationServices.UNSUPPORTED_NOTIFICATION.getDescription());
	}
}
