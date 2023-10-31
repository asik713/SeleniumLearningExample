package lognTestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class logins {

	String[][] data = null;
	WebDriver driver;

	@DataProvider(name = "login")
	public String[][] dataProviding() throws BiffException, IOException {

		data=getExcel();

		return data;
	}

	public String[][] getExcel() throws BiffException, IOException {

		FileInputStream excel = new FileInputStream("C:\\\\Users\\\\akrahu\\\\dataslogin.xls");
		Workbook workBook =	Workbook.getWorkbook(excel);
		Sheet sheet = workBook.getSheet(0);	
		int column = sheet.getColumns();
		int row =	sheet.getRows();

		String [][]testData = new String [row-1][column];

		for(int i=1 ; i<row ; i++) {

			for(int j=0 ; j<column ; j++) {

				testData[i-1][j]= sheet.getCell(j,i).getContents();
			}
		}
		return testData;


	}

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterTest
	public void aftertest() {

		driver.quit();
	}

	@Test(dataProvider="login")
	public void loginUsingBothCorrect (String uname , String pwd) {

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();

	}






























































































































	//	String [][] data = null;
	//	WebDriver driver;
	//
	//	@DataProvider(name="loginData")
	//	public String[][] loginDataProvider() throws BiffException, IOException {
	//		data = getExcelData();
	//		return data;
	//
	//	}
	//
	//
	//	public String[][] getExcelData() throws BiffException, IOException {
	//
	//		FileInputStream excel = new FileInputStream("C:\\Users\\akrahu\\dataslogin.xls");
	//		Workbook workbook = Workbook.getWorkbook(excel);
	//		Sheet sheet = workbook.getSheet(0);
	//
	//		int rowCount = sheet.getRows();
	//		int columnCount = 	sheet.getColumns();
	//
	//		String testData[][] = new String[rowCount-1][columnCount];
	//
	//		for(int i=1;i<rowCount;i++) {
	//
	//			for(int j=0;j<columnCount;j++) {
	//
	//				testData[i-1][j]=sheet.getCell(j,i).getContents();
	//			}
	//		}
	//
	//		return testData;
	//
	//	}
	//
	//
	//	@BeforeTest
	//	public void beforetest() {
	//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//		driver = new ChromeDriver();
	//
	//	}
	//
	//	@AfterTest
	//	public void aftertest() {
	//
	//		driver.quit();
	//	}
	//
	//	@Test(dataProvider="loginData")
	//	public void loginUsingBothCorrect (String uname , String pwd) {
	//
	//		driver.get("https://www.facebook.com/");
	//		driver.findElement(By.id("email")).sendKeys(uname);
	//		driver.findElement(By.id("pass")).sendKeys(pwd);
	//		driver.findElement(By.name("login")).click();

}


