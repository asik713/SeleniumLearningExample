package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement fromTarget = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
		
				WebElement toTarget = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]"));
				
				Actions actions = new Actions(driver);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		WebElement fromTarget = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
//
//		WebElement toTarget = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]"));
//		
//		Actions actions = new Actions(driver);
//		
//		actions.clickAndHold(fromTarget).moveToElement(toTarget).release(toTarget).build().perform();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//
//		Actions action = new Actions(driver);
//
//		//simplest method
//		//action.dragAndDrop(fromTarget, toTarget).build().perform();
//
//		//normal method
//		action.clickAndHold(fromTarget).moveToElement(toTarget).release(toTarget).build().perform();



























	}

}
