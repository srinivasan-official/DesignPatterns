package factory.servicefactory;

import factory.constants.SupportedNotificationServices;
import factory.service.Notification;
import factory.service.impl.EmailNotification;
import factory.service.impl.PushNotification;
import factory.service.impl.SMSNotification;

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
