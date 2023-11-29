package com.orangehrm.genric;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listeners extends Base_class implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case pass "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case failed "+ result.getName());
		Generic_Screenshot.getPhoto(driver, result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test case skipped "+ result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		test.log(Status.FAIL, "Test case failed due to time out "+ result.getName());
	}

}
