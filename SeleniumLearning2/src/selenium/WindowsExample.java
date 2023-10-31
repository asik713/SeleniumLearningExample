package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");

		




























		//
		//		//open new window from parent and perform action
		//
		//		String oldWindow = driver.getWindowHandle();
		//
		//		WebElement homeButton = driver.findElement(By.id("home"));
		//
		//		homeButton.click();
		//
		//		Set<String> handles = driver.getWindowHandles();
		//
		//		for (String newWindow : handles) {
		//
		//			driver.switchTo().window(newWindow);
		//
		//		}
		//
		//		WebElement button = driver.findElement(By.linkText("Click"));
		//		button.click();
		//
		//		driver.close();
		//		driver.switchTo().window(oldWindow);
		//
		//
		//		//multiple window count
		//
		//		WebElement multiButton = driver.findElement(By.id("multi"));
		//		multiButton.click();
		//
		//		int windowsCount = driver.getWindowHandles().size();
		//		System.out.println("No of windows : " + windowsCount);
		//
		//
		//
		//		//close other rhan parent window
		//
		//
		//		WebElement multiButton1 = driver.findElement(By.id("multi"));
		//		multiButton1.click();
		//
		//		Set<String> newHandles = driver.getWindowHandles();
		//
		//		for (String allWindows : newHandles) {
		//
		//			if(!allWindows.equals(oldWindow)) {
		//
		//				driver.switchTo().window(allWindows);
		//				driver.close();
		//			}
		//
		//		}
		//
		//		driver.quit();}

	}
}
