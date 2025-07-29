package java8_casestudy;

public interface Payment {
	void pay();
	default void logTransaction() {
		System.out.println("transaction logged succesfuly");
	}

}
