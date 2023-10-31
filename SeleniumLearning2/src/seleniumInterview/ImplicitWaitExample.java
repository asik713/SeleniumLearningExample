package seleniumInterview;



import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitWaitExample {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/AutoComplete.html");

		WebElement enterBox = driver.findElement(By.id("searchbox"));
		enterBox.sendKeys("s");

	//	Thread.sleep(3000);
		
		List< WebElement > nameList = 	driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));

		System.out.println(nameList.size());

		for (WebElement allName : nameList) {

			if(allName.getText().equals("The Bahamas")) {
				allName.click();
				System.out.println("Name is entered");
				break;
			}

			else {

				System.out.println("not enter");
			}

	}

		driver.quit();
	}
}

		

