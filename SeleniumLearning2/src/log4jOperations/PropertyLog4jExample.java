package log4jOperations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {
	
	static Logger logger = Logger.getLogger(PropertyLog4jExample.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.debug("this is an debug");
		logger.info("this is an info");
		logger.warn("this is an warn");
		logger.error("this is an error");
		logger.fatal("this is an fatal");
		
	}

}
