package seleniumInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class RefreshingWays {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Agni");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		driver.findElement(By.name("q")).sendKeys(Keys.F5);
//		
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		
//		executor.executeScript("history.go(0)");
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		//refresh command
//		//driver.navigate().refresh();
//		
//		//get current url
//		//driver.get(driver.getCurrentUrl());
//		
//		//JavaScriptExecutor
//		
////		JavascriptExecutor execute = (JavascriptExecutor) driver;
////		
////		execute.executeScript("location.reload()");//history.go(0)
//		
//		
//		//by robot class
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_F5);
//		robot.keyRelease(KeyEvent.VK_F5);

	}

}
