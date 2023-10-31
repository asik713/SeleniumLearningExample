package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

public class ParllelExample {



	@Test
	public void openGoogle() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@Test
	public void openBing() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.bing.com");

	}

}
