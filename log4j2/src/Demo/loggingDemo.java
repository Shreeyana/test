package Demo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loggingDemo {
	private static final Logger um =LogManager.getLogger(loggingDemo.class.getName());

	public static void main(String[] args) {
		um.error("Error Message is here");
		um.debug("Debug Log is here");
	}

}
