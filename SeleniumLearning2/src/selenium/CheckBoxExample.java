package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/select.xhtml");
		
		//normal click
		//is selected
		
		//deselect
		
//		WebElement first = fe
//				
//		if(first.isSelected() ) {
//			first.click();
//			
//		}
//		
//		here we use else or we do second also..

	}

}
