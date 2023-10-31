package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/select.xhtml");

		WebElement selectable = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));

	
     





























		//		WebElement selectBox = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		//
		//		Select selection = new Select(selectBox);
		//
		//		selection.selectByIndex(2);
		//
		//		selection.selectByVisibleText("Selenium");
		//
		//		selectBox.sendKeys("Cypress");
		//
		//		List<WebElement> optionsList = selection.getOptions();
		//		int size = optionsList.size();
		//		System.out.println("no of options : " + size);


		//
		//		//multiselect
		//		//coding is same as normal selection..main(html structure itself it is multiselected
		//		//so we give all selection types to multi select and this we use to get all selected options		
		//		//method also	

	}

}
