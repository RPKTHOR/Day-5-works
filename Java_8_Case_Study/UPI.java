package java8_casestudy;

public class UPI implements Payment{
	@Override
	public void pay() {
		System.out.println("Paid using UPI");
		logTransaction();
	}

}
