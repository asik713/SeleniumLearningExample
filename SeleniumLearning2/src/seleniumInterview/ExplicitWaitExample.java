package seleniumInterview;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));

	
				
				





























		//		//Alert 
		//		driver.get("https://letcode.in/waits");
		//		driver.findElement(By.id("accept")).click();
		//		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		//		System.out.println(until.getText());
		//		until.accept();

		//invisibility
		//driver.get("https://letcode.in/signin");
		//driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Pass123$");
		//driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		//WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		//wait.until(ExpectedConditions.visibilityOf(toast));
		//System.out.println(toast.getText());
		//wait.until(ExpectedConditions.invisibilityOf(toast));
		//driver.findElement(By.linkText("Sign out")).click();















	}

}
