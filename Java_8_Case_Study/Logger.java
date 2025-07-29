package java8_casestudy;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Logger {
	public void log(String message, Predicate<String> filter, Consumer<String> action) {
		if (filter.test(message)) {
			action.accept(message);
		}
	}

}
