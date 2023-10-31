package seleniumInterview;

import org.testng.annotations.Test;

public class dependsOnFails {
	
	@Test(timeOut=2000)
	public void test1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("yes");
		
	}

	@Test(dependsOnMethods="test1" ,alwaysRun=true )
	public void test2() {
		
		
	}
}
