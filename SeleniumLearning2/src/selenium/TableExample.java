package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://letcode.in/table");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> table = driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table//td[2]"));
//		
//		List<Integer> lists = new ArrayList();
//		
//		for (WebElement webElement : table) {
//			String text = webElement.getText();
//			
//			lists.add(Integer.parseInt(text));
//		}
//		
//		System.out.println(lists);
//		
//		Integer small = Collections.min(lists);
//		System.out.println(small);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


//		//columncount
//		WebElement  table = driver.findElement(By.id("simpletable"));
//
//		List<WebElement> columnCount = table.findElements(By.tagName("th"));
//
//		int columnCounts = columnCount.size();
//
//		System.out.println("No of columns : " + columnCounts);
//
//		//row count...
//
//		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
//
//		int rowCounts = columnCount.size();
//
//		System.out.println("No of rows : " + rowCounts);
//
//		//get calorie value of eclair
//
//		WebElement table1 = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table"));
//		WebElement calorieValue =     table1.findElement(By.xpath("//td[.='Eclair']//following::td[1]"));
//		String eclairCalorie = calorieValue.getText();
//		System.out.println("Eclair Calorie is : " + eclairCalorie);
//
//		//get all calorie values and add in list
//
//		List<WebElement> allCalories = 	driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table//td[2]"));
//
//		List<Integer> numberlist = new ArrayList<Integer> ();
//
//		for (WebElement webElement : allCalories) {
//
//			String individualValue = webElement.getText();
//			numberlist.add(Integer.parseInt(individualValue));
//
//
//		}
//
//		System.out.println("Final list : " + numberlist);
//
//		//clicking checkbox
//
//		WebElement table3 = driver.findElement(By.id("simpletable"));
//		WebElement clickBox = table3.findElement(By.id("third"));
//		clickBox.click();



	}
}

//lao...4th

//List<WebElement> allProgress= driver.findElements(By.xpath("//td[2]"));
//		
//		List<Integer> numberList= new ArrayList<Integer>();
//		
//		for (WebElement webElement : allProgress) {
//			String individualValue=webElement.getText().replace("%","");	
//			numberList.add(Integer.parseInt(individualValue));
//		}
//		
//		System.out.println("Final list"+numberList);
//		
//		int smallValue=Collections.min(numberList);
//		System.out.println(smallValue);
//		
//	String smallValueString=Integer.toString(smallValue)+"%";
//		
//		String finalXpath="//td[normalize-space()="+"\""+ smallValueString + "\""+"]"+"//following::td[1]";
//		
//		System.out.println(finalXpath);
//		
//		//td[normalize-space()='20%']//following::td[1]
//		
//		WebElement check=driver.findElement(By.xpath(finalXpath));
//		check.click();


