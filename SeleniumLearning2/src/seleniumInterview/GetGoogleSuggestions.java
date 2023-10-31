package seleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		WebElement searchBox =  driver.findElement(By.name("q"));
		searchBox.sendKeys("Game of thrones");

		Thread.sleep(4000);
		List<WebElement> searchSuggestions = 	driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
		
		

		for (WebElement webElement : searchSuggestions) {
		String text = 	webElement.getText();
		
		if(text.contains("cast")) {
			webElement.click();
		}
			
		
			
		}
	
		
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//print all suggestion
		//		for (WebElement webElement : searchSuggestions) {
		//
		//			System.out.println(webElement.getText());
		//
		//		}
		//

		//print suggestion position

		//		int position=0;
		//		for (WebElement webElement : searchSuggestions) {
		//			System.out.println(webElement.getText());
		//			position++;
		//			
		//			if(position==3) {
		//				webElement.click();
		//				break;
		//			}
		//		}
		//		

		//click particular text from suggestion..

//		for (WebElement webElement : searchSuggestions) {
//
//			String text = webElement.getText();
//			System.out.println(text);
//
//			if(text.contains("cast")) {
//				webElement.click();
//				break;
//
//			}
//		}

	}


