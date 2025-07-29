package java8_casestudy;


public class UserProfileTest {
		public static void main(String[] args) {
			UserProfile user1 = new UserProfile("rana","ranad@gmail.com");
			UserProfile user2 = new UserProfile("riti",null);
			
		// print email if present	
		user1.getEmail().ifPresent(email -> 
				System.out.println(user1.getName()+"'s email: "+email));
				
		// provide default email is missing
		String email2 = user2.getEmail().orElse("no-email@default.com");
		System.out.println(user2.getName()+"'s email: "+ email2);
			}
	}

