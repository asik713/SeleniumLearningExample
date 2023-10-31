package seleniumInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElementExample {

	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//method 1
//		
//		driver.switchTo().activeElement().sendKeys("Asik \n");
		
		//method 2
		
		PageFactory.initElements(driver, ActiveElementExample.class);
		
		q.sendKeys("asik \n");

	}

}
