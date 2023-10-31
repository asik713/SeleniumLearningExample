package seleniumInterview;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class TakesScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		Robot robot = new Robot();
//
//		Dimension dimension = 	Toolkit.getDefaultToolkit().getScreenSize();
//		Rectangle rectangle = new Rectangle(dimension);
//
//		BufferedImage source = robot.createScreenCapture(rectangle);
//		File destination = new File(".//sibu.png");
//
//		ImageIO.write(source, "png", destination);
//
//
//		driver.quit();
//
//
//
//
//		






























		//		driver.findElement(By.
		//				xpath("//*[@id=\"j_idt88:j_idt91\"]")).click();
		//
		//
		//
		//		//		TakesScreenshot screenshot = (TakesScreenshot) driver;
		//		//		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		//		//		File destinationFile = new File(".//snope.png");
		//		//		
		//		//		FileHandler.copy(sourceFile, destinationFile);
		//
		//		Robot robot = new Robot();
		//
		//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//		Rectangle rectangle = new Rectangle(screenSize);
		//		BufferedImage source = robot.createScreenCapture(rectangle);
		//		File destinationFile = new File(".//snopes.png");
		//		ImageIO.write(source, "png" , destinationFile);
	}

}
