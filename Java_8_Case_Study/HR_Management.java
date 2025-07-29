package java8_casestudy;

import java.util.Arrays;
import java.util.List;

public class HR_Management {

	public static void main(String[] args) {
		List<Employee> employees  = Arrays.asList(
			new Employee("Pavan",60000),
			new Employee("Ravi",45000),
			new Employee("Nikki",55000),
			new Employee("Arjun",34000) );
		
		// sort by name using lambda
		employees.sort((e1,e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println(" Sorted by Name: ");
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		// SORT BY THRESHOLD SALARY
		System.out.println("\n Salary>50k: ");
		for(Employee e: employees) {
			if (e.getSalary()>50000) {
			System.out.println(e);
			}
		}
	}

}
