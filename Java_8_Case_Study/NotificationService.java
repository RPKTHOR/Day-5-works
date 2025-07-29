package java8_casestudy;

public class NotificationService {
	public static void sendEmail(String message) {
		System.out.println("Email Sent: "+message);
	}
	public void sendSMS(String message) {
		System.out.println("SMS sent: "+message);
	}
	public void sendPush(String message) {
		System.out.println("Push Notifications: "+message);
	}

}
