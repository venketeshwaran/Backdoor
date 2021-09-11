package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(name ="password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login;
	
 public SignInPage(WebDriver driver2) {
	 SignInPage.driver=driver2;
	 PageFactory.initElements(driver2, this);
	 
	 
    }

     public static WebDriver getDriver() {
	return driver;
     }

      public WebElement getUsername() {
	return Username;
    }

      public WebElement getPassword() {
	   return password;
      }

       public WebElement getLogin() {
	   return login;
       }
	

}
