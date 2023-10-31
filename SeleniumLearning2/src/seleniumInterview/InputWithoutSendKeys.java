package seleniumInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.css.model.Value;
import org.openqa.selenium.JavascriptExecutor;

public class InputWithoutSendKeys {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//javascript executor...2
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		
//		//executor.executeScript("document.getElementsByName('q')[0].value='Duckling'", "");
//		executor.executeScript("arguments[0].value='chinag'", searchBox);
		
		//Robot
//		
//		driver.switchTo().activeElement();
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_D);
//		robot.keyRelease(KeyEvent.VK_D);
//		robot.keyPress(KeyEvent.VK_E);
//		robot.keyRelease(KeyEvent.VK_E);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
	}

}
