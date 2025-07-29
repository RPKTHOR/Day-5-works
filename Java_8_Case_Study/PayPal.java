package java8_casestudy;

public class PayPal implements Payment{

	@Override
	public void pay() {
		System.out.println("Paid using PayPal");
		logTransaction();
	}
}
