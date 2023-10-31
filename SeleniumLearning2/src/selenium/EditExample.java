package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml");

		






























		//		WebElement nameBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		//
		//		nameBox.sendKeys("ASIK");
		//
		//		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		//
		//		appendBox.sendKeys(" India");
		//
		//		WebElement getTextBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		//
		//		String getText = getTextBox.getAttribute("value");
		//
		//		System.out.println(getText);
		//
		//		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		//		clearBox.clear();
		//
		//		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		//
		//		boolean enabled = disabledBox.isEnabled();
		//		System.out.println(enabled);



















	}

}
