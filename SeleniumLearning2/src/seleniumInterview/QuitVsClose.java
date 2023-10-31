package seleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/window.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");

		WebElement firstWindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]"));
		firstWindow.click();



		Thread.sleep(3000);
		driver.close();
		//driver.quit();

	}

}
