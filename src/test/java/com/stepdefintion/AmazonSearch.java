package com.stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.AmazonSearchBase;
import com.pageobjectmodel.AmazonPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch extends AmazonSearchBase {
	AmazonPages page;

	@Given("user on amazon homepage")
	public void user_on_amazon_homepage() {

		getDriver();

		page = PageFactory.initElements(driver, AmazonPages.class);

	}

	@When("user clicks on hello sign in button")
	public void user_clicks_on_hello_sign_in_button() {

		page.getSignin();

		// driver.findElement(By.xpath("(//span[@class='nav-line-1
		// nav-progressive-content'])[2]")).click();
		// driver.findElement(By.xpath("(//span[contains(text(),'Hello, Sign
		// in')])[1]")).click();
	}

	@When("user click on create an amazon account")
	public void user_click_on_create_an_amazon_account() {
		page.create();

		// driver.findElement(By.xpath("//a [@id='createAccountSubmit']")).click();

	}

	@When("user enter name as {string}")
	public void user_enter_name_as(String name) {

		page.nameBx(name);

		// driver.findElement(By.xpath("(//input[@id='ap_customer_name'])[1]")).sendKeys(name);

	}

	@When("user enter email as {string}")
	public void user_enter_email_as(String Email) {

		page.getemailBx(Email);

		// driver.findElement(By.xpath("(//input
		// [@id='ap_email'])[1]")).sendKeys(Email);

	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String password) {

		page.typepassBx(password);

		// driver.findElement(By.xpath("(//input
		// [@id='ap_password'])[1]")).sendKeys(password);

	}

	@When("user enter repassword as {string}")
	public void user_enter_repassword_as(String repassword) {
		page.typerepassBx(repassword);

		// driver.findElement(By.xpath("(//input
		// [@id='ap_password_check'])[1]")).sendKeys(repassword);

	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {

		page.clickcontinueBtn();

		// driver.findElement(By.xpath("(//input[@id='continue'] )")).click();

	}

	@Then("user varifies the error message")
	public void user_varifies_the_error_message() {

		// Assert.assertEquals(driver.getTitle(), "Authentication Requierd");


	 getClose();
	}	
	}
	


