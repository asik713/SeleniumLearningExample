package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		

		







































































































		//		//homepage
		//
		//		WebElement homeButton = 	driver.findElement(By.linkText("Go to Dashboard"));
		//		homeButton.click();
		//
		//		driver.navigate().back();
		//
		//		//without clicking find link location
		//
		//		WebElement linkLocation = driver.findElement(By.partialLinkText("Find the URL"));
		//		String location = linkLocation.getAttribute("href");
		//		System.out.println("Link location is : " + location);
		//
		//		//broken link..
		//
		//		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		//		brokenLink.click();
		//
		//		String title =   driver.getTitle();
		//		if(title.contains("404")) {
		//
		//			System.out.println("Link is broken");
		//
		//
		//		}
		//
		//		else {
		//			System.out.println("not broken");
		//
		//
		//		}
		//
		//		driver.navigate().back();
		//
		//		//stale element refrence exception...
		//
		//		WebElement homepage1 = driver.findElement(By.linkText("Go to Dashboard"));
		//
		//		homepage1.click();
		//
		//		driver.navigate().back();
		//
		//		//link count..
		//
		//		List<WebElement> totalLink = 	driver.findElements(By.tagName("a"));
		//		int linkCount = totalLink.size();
		//
		//		System.out.println("No of links : " + linkCount);

	}


}













































//		//homepage click
//
//		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
//
//		WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
//		homeLink.click();
//
//		driver.navigate().back();
//
//		//find link without touch
//
//		WebElement wheretogo = driver.findElement(By.partialLinkText("Find the URL"));
//		String where = wheretogo.getAttribute("href");
//		System.out.println(where);
//
//		//broken link
//
//		WebElement brokenLink =  driver.findElement(By.linkText("Broken?"));
//		brokenLink.click();
//
//		String title = driver.getTitle();
//
//		if(title.contains("404")) {
//
//			System.out.println("Link is broken");
//
//		}
//		else {
//			System.out.println("not broken");
//
//
//		}
//
//		driver.navigate().back();
//
//		//stale element refrence exception...
//
//		WebElement homepage1 = driver.findElement(By.linkText("Go to Dashboard"));
//
//		homepage1.click();
//
//		driver.navigate().back();
//
//		//link count..
//
//		List<WebElement> totalLink = 	driver.findElements(By.tagName("a"));
//		int linkCount = totalLink.size();
//
//		System.out.println("No of links : " + linkCount);


