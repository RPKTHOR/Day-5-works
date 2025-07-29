package java8_casestudy;

public class Order {
	String customer;
	String category;
	double amount;
	
	public Order(String customer, String category, double amount) {
		this.customer = customer;
		this.category = category;
		this.amount = amount;
	
	}
	
	public String getCustomer() {
		return customer;
	}
	public String getCategory() {
		return category;
	}
	public double getAmount() {
		return amount;
	}
	public String toString() {
		return customer + " ordered "+category+" worth ₹"+ amount;
	}

}
