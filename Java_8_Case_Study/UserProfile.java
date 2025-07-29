package java8_casestudy;

import java.util.Optional;

public class UserProfile {
	private String name;
	private Optional<String> email;
	
	public UserProfile(String name, String email) {
		this.name = name;
		this.email = Optional.ofNullable(email);
	}
	
	public String getName() {
		return name;
	}
	public Optional<String> getEmail(){
		return email;
	}
}
