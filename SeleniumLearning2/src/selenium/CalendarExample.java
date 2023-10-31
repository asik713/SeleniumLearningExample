package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebElement selectDate = driver.findElement(By.id("datepicker"));
		//selectDate.sendKeys("10/10/2023"+Keys.ENTER);
		
		selectDate.click();
		
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		nextButton.click();
		
		WebElement dataToBeGiven = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a"));
		dataToBeGiven.click();

	}

}
