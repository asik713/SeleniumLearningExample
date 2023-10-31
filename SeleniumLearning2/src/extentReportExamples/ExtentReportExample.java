package extentReportExamples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReportExample {































































































	//	WebDriver driver;
	//	ExtentReports extentReport;
	//	ExtentHtmlReporter htmlReporter;
	//	ExtentTest testCase;
	//
	//
	//	@BeforeSuite
	//	public void launchBrowser() {
	//		driver = new ChromeDriver();
	//		extentReport = new ExtentReports();
	//		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
	//		extentReport.attachReporter(htmlReporter);
	//	}
	//
	//
	//
	//	@Test
	//	public void openGoogle() throws IOException {
	//		testCase = extentReport.createTest("Verify google test");
	//		testCase.log(Status.INFO, "Navigate to google");
	//		driver.get("https://www.google.com/");
	//		String title = driver.getTitle();
	//		testCase.log(Status.INFO, "Actual Title :" + title );
	//		testCase.log(Status.INFO, "Expected Title :" + "Google" );
	//		testCase.log(Status.INFO, "Verification of actual and expected title" );
	//		if(title.equals("Google")) {
	//			testCase.log(Status.PASS, "Actual title and expected title are equal");
	//		}
	//		else {
	//			testCase.log(Status.FAIL, "Actual title and expected title are not equal");
	//			TakesScreenshot screenshot = (TakesScreenshot) driver;
	//			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
	//			File destinationFile = new File("google.png");
	//			FileHandler.copy(sourceFile, destinationFile);
	//			testCase.addScreenCaptureFromPath("google.png");
	//		
	//
	//
	//		}
	//
	//	}
	//	@Test
	//	public void openBing() throws IOException {
	//		testCase = extentReport.createTest("Verify bing test");
	//		testCase.log(Status.INFO, "Navigate to bing");
	//		driver.get("https://www.bing.com/?toWww=1&redig=539B0DA94E94496DB0EA6A35BA6A4BA7");
	//		String title = driver.getTitle();
	//		testCase.log(Status.INFO, "Actual Title :" + title );
	//		testCase.log(Status.INFO, "Expected Title :" + "bing" );
	//		testCase.log(Status.INFO, "Verification of actual and expected title" );
	//		if(title.equals("bing")) {
	//			testCase.log(Status.PASS, "Actual title and expected title are equal");
	//		}
	//		else {
	//
	//			testCase.log(Status.FAIL, "Actual title and expected title are not equal");
	//			TakesScreenshot screenshot = (TakesScreenshot) driver;
	//			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
	//			File destinationFile = new File("bing.png");
	//			FileHandler.copy(sourceFile, destinationFile);
	//			testCase.addScreenCaptureFromPath("bing.png");
	//		}
	//	}
	//
	//	@Test
	//	public void openWikipedia() throws IOException {
	//		testCase = extentReport.createTest("Verify Wikipedia test");
	//		testCase.log(Status.INFO, "Navigate to Wikipedia");
	//		driver.get("https://www.wikipedia.org/");
	//		String title = driver.getTitle();
	//		testCase.log(Status.INFO, "Actual Title :" + title );
	//		testCase.log(Status.INFO, "Expected Title :" + "Wikipedia" );
	//		testCase.log(Status.INFO, "Verification of actual and expected title" );
	//		if(title.equals("Wikipedia")) {
	//			testCase.log(Status.PASS, "Actual title and expected title are equal");
	//		}
	//		else {
	//			testCase.log(Status.FAIL, "Actual title and expected title are not equal");
	//			TakesScreenshot screenshot = (TakesScreenshot) driver;
	//			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
	//			File destinationFile = new File("wikipedia.png");
	//			FileHandler.copy(sourceFile, destinationFile);
	//			testCase.addScreenCaptureFromPath("wikipedia.png");
	//		}
	//
	//	}
	//
	//	@AfterSuite
	//	public void closeBrowser() {
	//
	//		driver.quit();
	//		extentReport.flush();
	//
	//	}

}
