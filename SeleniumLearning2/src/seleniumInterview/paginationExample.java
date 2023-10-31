package seleniumInterview;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		driver.manage().window().maximize();

	}

}





























//		List<String> namesList = new ArrayList<String>();
//		List<WebElement> listOfNames;
//		WebElement nextButton;
//
//		int sizeOfPagination =   driver.findElements(By.xpath("//ul[@class='pagination']//a")).size();
//		System.out.println(sizeOfPagination);
//		
//		if(sizeOfPagination>0) {
//			
//			do {
//		listOfNames = 	driver.findElements(By.xpath("//td[@class='sorting_1']"));
//		
//		for (WebElement names : listOfNames) {
//			namesList.add(names.getText());
//			
//		}
//		
//		nextButton = driver.findElement(By.id("dtBasicExample_next"));
//		nextClassName = nextButton.getAttribute("class");
//		
//		if(!nextClassName.contains("disabled")) {
//			nextButton.click();
//		}
//		else {
//			break;
//		}
//			}
//			while(true);
//		}
//		
//		else {
//			System.out.println("No pagination in this page");
//		}
//		
//		for (String allNames : namesList) {
//			System.out.println(allNames);
//		}

	
