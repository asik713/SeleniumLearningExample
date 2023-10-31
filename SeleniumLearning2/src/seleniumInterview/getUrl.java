package seleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		WebElement searchBox = 	driver.findElement(By.name("q"));
		searchBox.sendKeys("leo" +Keys.ENTER);

		List<WebElement> linkCount = driver.findElements(By.xpath("//a"));//tagname

		for (WebElement webElement : linkCount) {

			System.out.println(webElement.getAttribute("href"));

		}

	}

}
