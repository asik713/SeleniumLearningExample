package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");

		WebElement downloadButton = driver.findElement(By.xpath("//button[@id='j_idt93:j_idt95']"));
		downloadButton.click();

		

	}}












































































		







































































//		WebElement downloadLink = driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]"));
//
//		downloadLink.click();
//
//		File filelocation = new File("C:\\Users\\akrah");
//
//		File[] allfiles = filelocation.listFiles();
//
//		for (File file : allfiles) {
//
//			if(file.getName().equals("TestLeaf Logo.png")) {
//
//				System.out.println("File is downloaded");
//				break;
//			}
//
//
//		}




