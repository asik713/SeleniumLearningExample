package seleniumInterview;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RerunFailedTestCase {
	
	
	@Test
	public void test1() {
		
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test2() {
		
		Assert.assertEquals(true, false);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//normal

//	@Test
//	public void testCase1() {
//		Assert.assertEquals(true, false);
//
//	}
//
//	@Test
//	public void testcase2() {
//		Assert.assertEquals(true, true);
//
//	}

//	//retryAnalyzer...
//	
//	@Test(retryAnalyzer=RetryAnalyzer.class)
//	public void testcase1() {
//		
//		Assert.assertEquals(true, false);
//		
//	}
//	
//	@Test
//	public void testcase2() {
//		Assert.assertEquals(true, false);
//	}

	
//	//annotation transformer
//	@Test
//	public void testcase1() {
//		
//		Assert.assertEquals(true, true);
//		
//	}
//	
//	@Test
//	public void testcase2() {
//		Assert.assertEquals(true, false);
//	}

}
