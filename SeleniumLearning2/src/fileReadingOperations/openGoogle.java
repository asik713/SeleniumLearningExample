package fileReadingOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openGoogle {

	static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		FileInputStream stream = new FileInputStream("config.properties");

		Properties properties = new Properties();
		properties.load(stream);




		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("DriverLocation");

        if(browser.equals("firefox")) {
        	
        	
        	driver = new FirefoxDriver();
        }
        
        else if(browser.equals("chrome")) {
        	
        	
        	driver = new ChromeDriver();
        } 
        driver.get("https://www.google.com");
	}
        	
        





































		//		WebDriver driver = null;
		//        FileInputStream stream = new FileInputStream("config.properties");
		//        
		//        Properties properties = new Properties();
		//        properties.load(stream);
		//        
		//      String browser =   properties.getProperty("browser");
		//String driverLocation = properties.getProperty("DriverLocation");
		//
		//if(browser.equals("chrome")) {
		//	
		//	System.setProperty("webdriver.chrome.driver", driverLocation);
		//	driver = new ChromeDriver();
		//
		//}
		//
		//else if (browser.equals("firefox")) {
		//	System.setProperty("webdriver.gecko.driver", driverLocation);
		//	driver = new FirefoxDriver();
		//
		//}
		//
		//driver.get("https://www.google.com");
	




































	//		FileInputStream stream = new FileInputStream("config.properties");
	//		Properties properties = new Properties();
	//		properties.load(stream);
	//
	//		String browser = properties.getProperty("browser");
	//		String driverLocation = properties.getProperty("DriverLocation");
	//
	//		if(browser.equals("chrome")) {
	//
	//			System.setProperty("webdriver.chrome.driver", driverLocation);
	//
	//			driver = new ChromeDriver();
	//		}
	//		else if(browser.equalsIgnoreCase("firefox")) {
	//
	//			System.setProperty("webdriver.gecko.driver", driverLocation);
	//
	//			driver = new FirefoxDriver();
	//
	//		}
	//
	//		driver.get("https://www.google.com");
	//	}

}
