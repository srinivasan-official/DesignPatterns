package factory.constants;

public enum SupportedNotificationServices {
	SMS_NOTIFICATION("SMS Notification"), EMAIL_NOTIFICATION("Email Notification"), PUSH_NOTIFICATION("Push Notification"), 
	UNSUPPORTED_NOTIFICATION("Unsupported Notification Type");
	
	private String description;
	
	private SupportedNotificationServices(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
