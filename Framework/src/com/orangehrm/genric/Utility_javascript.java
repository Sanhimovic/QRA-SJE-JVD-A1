package com.orangehrm.genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_javascript {

	public static void pass_data(WebDriver driver,String data,WebElement element) {
		Utility_Objects.javascript_reference(driver)
		.executeScript("arguments[0].value='"+data+"'", element);
	}
	
	public static void click_element(WebDriver driver,WebElement element) {
		Utility_Objects.javascript_reference(driver)
		.executeScript("arguments[0].click();", element);
	}
	
	public static void scroll_to_element(WebDriver driver,WebElement element) {
		Utility_Objects.javascript_reference(driver)
		.executeScript("arguments[0].scrollIntoView();", element);
	}
}
