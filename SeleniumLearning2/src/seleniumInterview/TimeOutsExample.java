package seleniumInterview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOutsExample {
	
	@Test(timeOut=2000,expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void tests() throws InterruptedException {
		System.out.println("before");
		Thread.sleep(3000);
		System.out.println("after");
		
	}

}
