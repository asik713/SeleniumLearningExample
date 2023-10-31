package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");

		

























//		//default select......
//
//		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div/div[2]"));
//
//		WebElement checked = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:2\"]"));
//
//		boolean status1 = unchecked.isSelected();
//
//		boolean status2 = checked.isSelected();
//
//		System.out.println(status1);
//		System.out.println(status2);
//
//
//		WebElement below20 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
//
//		below20.click();


	}

}
