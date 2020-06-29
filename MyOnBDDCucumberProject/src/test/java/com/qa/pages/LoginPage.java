package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver = null;
	
	//Below we have use FageFactory by using @FindBy
      @FindBy(xpath = "//span[contains(text(),'Log In')]")
      WebElement loginDashboadButton;
      
      
      
      
      
      //Note when ever we use @FindBy annotation then we have to initialized it by PageFactory as below. .initElments method is of PageFactory Class and driver, this means please initialized all this globle variable. 
      //Initializing the Page Objects Model.(Constructure)
      public LoginPage() {
    	  PageFactory.initElements(driver, this);
    	  
      }
      
      
      
      
      public void clickDashboardLoginbtn() {
    	  JavascriptExecutor js = (JavascriptExecutor)driver;
    	  js.executeScript("arguments[0].click", loginDashboadButton);
      }
      
      

}
