package seleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestMultipleTimes {
	WebDriver driver = new ChromeDriver();
	
	@Test(invocationCount=3)
	public void test() {
		
		System.out.println("yes");
		
	}
	
	
	

}
