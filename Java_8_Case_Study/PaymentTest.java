package java8_casestudy;

public class PaymentTest {

	public static void main(String[] args) {
		Payment paypal = new PayPal();
		Payment upi = new UPI();
		
		paypal.pay();
		upi.pay();
	}
}