package java8_casestudy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderProcessingSystem {

	public static void main(String[] args) {
		
		List<Order> orders = Arrays.asList(
			new Order("Abhi","Grocery",1200),
			new Order("Sneha","Clothing",3450.9),
			new Order("rajesh","electronics",2000),
			new Order("pooja","beautycare",1000), 
			new Order("Sneha","Grocery",750));

	// filter orders > 1000
		System.out.println("Orders above 1000");
		orders.stream().filter(o -> o.getAmount() >= 1000)
					   .forEach(System.out::println);
		
	// count orders per customer
		System.out.println("Orders count per customer: ");
		Map<String, Long> orderCount = orders.stream()
		.collect(Collectors.groupingBy(Order::getCustomer, Collectors.counting()));
		orderCount.forEach((customer, count) -> 
	      System.out.println(customer + ": " + count + " orders"));
	
	// group orders by category
		System.out.println("Orders group by category: ");
		Map<String, List<Order>> grouped = orders.stream()
				.collect(Collectors.groupingBy(Order::getCategory));
		grouped.forEach((category,list) ->{
			System.out.println(category+":");
			list.forEach(System.out::println);
		});
		
	}

}
