package seleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SoftHardAssert {


//	@Test
//	public void test() {
//		//hard assertion
//		System.out.println("before assert");
//		Assert.fail(); //Assert.assertequals(true , false);
//		System.out.println("after assert");
//	}

	@Test
	public void verify() {
		//soft asserton
		
		SoftAssert assert1 = new SoftAssert();
		System.out.println("before soft assert");
		assert1.fail();
		System.out.println("after soft assert");
	}
}


