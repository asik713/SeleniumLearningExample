package selenium;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");
		
		
	List<WebElement> list = 	driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


//		List<WebElement> selectionList = driver.findElements(By.xpath("//*[@id='selectable']/li"));
//
//		Actions action = new Actions(driver);
//
//		//	action.keyDown(Keys.CONTROL).click(selectionList.get(0)).click(selectionList.get(1)).click(selectionList.get(2)).click(selectionList.get(3)).buid().perform();
//
//		action.clickAndHold(selectionList.get(0));
//		action.clickAndHold(selectionList.get(1));
//		action.clickAndHold(selectionList.get(2));
//
//		action.build().perform();

	}

}
