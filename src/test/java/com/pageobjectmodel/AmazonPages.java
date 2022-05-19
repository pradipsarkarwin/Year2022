package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {

	public WebDriver driver;

	public AmazonPages(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")

	WebElement signinBtn;

	public void getSignin() {

		signinBtn.click();

	}

	@FindBy(xpath = "//a [@id='createAccountSubmit']")
	WebElement create;

	public void create() {
		create.click();
	}

	@FindBy(xpath = "//input[@id='ap_customer_name']")
	WebElement nameBx;

	public void nameBx(String name) {
		nameBx.sendKeys(name);
	}

	@FindBy(xpath = "//input [@id='ap_email']")
	WebElement emailBx;

	public void getemailBx(String Email) {
		emailBx.sendKeys(Email);
	}

	@FindBy(xpath = "//input [@id='ap_password']")
	WebElement passBx;

	public void typepassBx(String password) {
		passBx.sendKeys(password);
	}

	@FindBy(xpath = "//input [@id='ap_password_check']")
	WebElement repassBx;

	public void typerepassBx(String repassword) {
		repassBx.sendKeys(repassword);
	}

	@FindBy(xpath = "//input[@id='continue'] ")
	WebElement continueBtn;

	public void clickcontinueBtn() {
		continueBtn.click();
	}
	
	
	
}
