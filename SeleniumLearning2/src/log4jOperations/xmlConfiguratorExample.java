package log4jOperations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class xmlConfiguratorExample {
	
static Logger logger = Logger.getLogger(xmlConfiguratorExample.class);
	
	public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("this is an debug");
		logger.info("this is an info");
		logger.warn("this is an warn");
		logger.error("this is an error");
		logger.fatal("this is an fatal");

}
}