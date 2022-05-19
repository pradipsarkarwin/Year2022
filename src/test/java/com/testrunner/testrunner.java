package com.testrunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features",
		glue = "com.stepdefintion",
		tags = "@amazon"
		
)

public class testrunner extends AbstractTestNGCucumberTests {
	
	
	
	

}
