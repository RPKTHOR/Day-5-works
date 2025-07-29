package java8_casestudy;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " - ₹"+salary;
	}
	
}
