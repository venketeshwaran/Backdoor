package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.pom.SignInPage;
import com.adactin.runner.TestRunner;


import Base.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends Base_Class{
	
	public static WebDriver driver = TestRunner.driver;
	SignInPage sp = new SignInPage(driver);
	

        @Given("^User launch the application$")
         public void user_launch_the_application() throws Throwable {
    	   
    	    getUrl("https://adactinhotelapp.com/");
        }

         @When("^User enters the valid username in the username field$")
         public void user_enter_the_valid_username_in_the_username_field()throws Throwable  {
        	inputValueofElement(sp.getUsername(),"Lokeshwaran");
        }

       

	    @When("^User enters the valid password in the password field$")
        public void user_enter_the_valid_password_in_the_password_field()throws Throwable  {
		inputValueofElement(sp.getPassword(), "12345678");
         }

      
         @Then("^User verify the homepage navigates to search hotel$")
        public void user_verify_the_homepage_navigates_to_search_hotel()throws Throwable  {
         }

}
