package com.telus.methodandclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenNavigationMethod7 {
	
	/* Example of BeforeMethod And AfterMethod
	 * Application is launched Successfully
      Registration form is displayed
      Application is closed Successfully
      
      Application is launched Successfully
      Alert popup page is displayed
      Application is closed Successfully
	 * 
	 * */
	
	
  @BeforeMethod
  public void launchApplication() {
	  System.out.println("Application is lauched Successfully");
  }
  
  @AfterMethod
  public void closeApplication() {
	  System.out.println("Application is closed Successfully");
  }
  
  @Test (priority=1)
  public void navigateToRegisterForm(){
	  
	  System.out.println("Registration form is displayed");
  }
  
  @Test(priority=2)
  public void navigateToAlertPopUp() {
	  
	  System.out.println("Alert popup page is displayed");
  }
  
  
  @Test(priority=3)
  public void navigateToMultipuleWindows() {
	  
	  System.out.println("Multiple window page is displayed successfully");
  }
  @Test(priority =4)
  public void navigateToWebTable() {
	  System.out.println("Web table page is displayed successfully");
	  
  }
  
  
  
}
