package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		
		
	//	broken link
//		driver.findElement(By.linkText("Broken?")).click();
//		String title = driver.getTitle();
//		if(title.contains("404")) {
//			System.out.println("broken");
//			
//		}
//		else {
//			System.out.println("not broken");
//		}
//	
//		
//		
		
		
		
		
		
		
		
		
		//		
//		//driver.findElement(By.linkText("Go to Dashboard")).click();
//		
//		driver.findElement(By.partialLinkText("Go to")).click();
		
		//get link without click..
		
//		String link = 	driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
//			
//			System.out.println(link);
//			
			
			

	}

}
