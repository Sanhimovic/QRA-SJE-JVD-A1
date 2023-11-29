package com.orangehrm.elementrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndtoEnd_repo {

	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[2]/a")
	private WebElement pim;
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement add_emp;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement upload_btn;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement first_name;
	
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middle_name;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement last_name;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit_button;
	
	public EndtoEnd_repo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getpim() {
		return pim;
	}
	
	public WebElement getadd_emp() {
		return add_emp;
	}
	
	public WebElement getUpload_btn() {
		return upload_btn;
	}
	
	public WebElement getFirst_name() {
		return first_name;
	}
	
	public WebElement getMiddle_name() {
		return middle_name;
	}
	
	public WebElement getLastName() {
		return last_name;
	}
	
	public WebElement getSubmit() {
		return submit_button;
	}
}
