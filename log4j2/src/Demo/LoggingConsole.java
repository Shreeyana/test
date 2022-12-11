package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggingConsole {
	private static final Logger um =LogManager.getLogger(LoggingConsole.class.getName());
	public static void main(String[] args) {
		        um.error("Error Message iss here");
				um.debug("Debug Log iss here");
				um.fatal("Fatal Log iss here");
			


	}

}
