package seleniumInterview;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchWay {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		WebElement searchBox =  driver.findElement(By.name("q"));

     




























		//sendKeys

		//searchBox.sendKeys("leo" +Keys.ENTER);

		//	searchBox.sendKeys("Asik \n");


		//using submit and robot..
		//		searchBox.sendKeys("leo");
		//		//        searchBox.submit();
		//		Robot robot = new Robot();
		//
		//		robot.keyPress(KeyEvent.VK_ENTER);
		//		robot.keyRelease(KeyEvent.VK_ENTER);




	}

}
