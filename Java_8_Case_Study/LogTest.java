package java8_casestudy;

import java.util.function.Consumer;
import java.util.function.Predicate;

public final class LogTest {

	public static void main(String[] args) {
		Logger logger = new Logger();
		Predicate<String> errorFilter = msg -> msg.contains("ERROR");
		Consumer<String> printAction = msg -> System.out.println("LOG: " + msg);
	
		logger.log("INFO: System started",errorFilter,printAction);
        logger.log("ERROR: Disk full",errorFilter,printAction);
	}

}
