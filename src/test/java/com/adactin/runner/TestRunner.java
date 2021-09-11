package com.adactin.runner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import Base.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
    @RunWith(Cucumber.class)
   
	@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature",
	                               glue ="src/test/java/com/adactin/stepdefinition/stepdefinition.java")
	
	public class TestRunner {
    	
    	public static WebDriver driver ;
    	@BeforeClass
    	public static void setup() {
    		Base_Class.getBrowser("chrome");
    	}
    	

}