package com.orangehrm.businesslogic;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.orangehrm.elementrepo.EndtoEnd_repo;
import com.orangehrm.genric.Base_class;
import com.orangehrm.genric.TestData;

public class EndToEndTestScript extends Base_class{

	@Test(dataProvider = "endtoend", dataProviderClass = TestData.class)
	public void test_script(String fn,String mn,String ln) {
		
		EndtoEnd_repo erp=new EndtoEnd_repo(driver);
		
		wait.until(ExpectedConditions.visibilityOf(erp.getpim())).click();
		test.log(Status.INFO, "Interacted with the element");
		
		wait.until(ExpectedConditions.visibilityOf(erp.getadd_emp())).click();
		
		//wait.until(ExpectedConditions.visibilityOf(erp.getUpload_btn())).sendKeys(path);
		
		erp.getFirst_name().sendKeys(fn);
		erp.getMiddle_name().sendKeys(mn);
		erp.getLastName().sendKeys(ln);
		erp.getSubmit().click();
		test.log(Status.INFO, "Employee is added successfully");
	}
}
