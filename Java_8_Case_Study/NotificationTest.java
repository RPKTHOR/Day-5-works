package java8_casestudy;

import java.util.function.Consumer;

public class NotificationTest {

	public static void main(String[] args) {
		Consumer<String> emailsender = NotificationService::sendEmail;
		emailsender.accept("Welcome to eclipse");
		
		NotificationService service = new NotificationService();
		Consumer<String> smsSender = service::sendSMS;
		Consumer<String> pushSender = service::sendPush;
		
		smsSender.accept("Your otp is 234244");
		pushSender.accept("buy eclipse premium edition");
	}

}
