package seleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

public class ScrollingExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://echoecho.com/tools.htm");
		
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//up down scroll
//		
//		//down
//		executor.executeScript("window.scroll(0,450)","");//scrollBy
//		Thread.sleep(3000);
//		//up
//		executor.executeScript("window.scrollBy(0,-450)", "");//scroll
		
//		//bottom and top scroll
//		//bottom
//		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)" , "");//scroll
//		Thread.sleep(3000);
//		//up
//		executor.executeScript("window.scrollTo(0,0)", "");//scroll
		
//		//particular position element present...
//		
//	WebElement link = 	driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/a[13]/span"));
//	executor.executeScript("arguments[0].scrollIntoView(true);", link);
//	
		
//		//robot class....
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_PAGE_UP);
//		robot.keyRelease(KeyEvent.VK_PAGE_UP);
//		
	}

}
