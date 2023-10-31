package log4jOperations;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExamples {
	
	static Logger logger = Logger.getLogger(BasicConfiguratorExamples.class);
	
	public static void main(String[] args) {
		
		
		BasicConfigurator.configure();
		
		logger.debug("This is debug");
		logger.info("this is info");
		logger.warn("This is warn");
		logger.error("This is error");
		logger.fatal("This is fatal");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static Logger logger = Logger.getLogger(BasicConfiguratorExamples.class);
//	
//	public static void main(String[] args) {
//		
//		
//		BasicConfigurator.configure();
//		
//		logger.debug("this is debug");
//		logger.info("this is info");
//		logger.warn("this is warn");
//		logger.error("this is error");
//		logger.fatal("this is fatal");
//		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 static Logger logger = 	Logger.getLogger(BasicConfiguratorExamples.class);
//	
//	public static void main(String[] args) {
//		
//		BasicConfigurator.configure();
//		
//		logger.debug("this is an debug");
//		logger.info("this is an info");
//		logger.warn("this is an warn");
//		logger.error("this is an error");
//		logger.fatal("this is an fatal");
//		
//		
		
	


