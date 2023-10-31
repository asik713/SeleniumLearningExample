package seleniumInterview;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int failedCount=0;
	int limit = 3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(limit>failedCount) {
			failedCount++;
			return true;
		}
		return false;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	int failedCount=0;
//	int limit=3;
//	@Override
//	public boolean retry(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//		if(failedCount<limit) {
//			failedCount++;
//			return true;
//		}
//		return false;
	}


