package com.telus.methodandclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenNavigationClass8 {
	
	/* Example of BeforeClass And AfterClass
	  Application is launched Successfully
      Registration form is displayed
      Alert popup page is displayed
      Application is closed Successfully
	 * 
	 * */
	
	
  @BeforeClass
  public void launchApplication() {
	  System.out.println("Application is lauched Successfully");
  }
  
  @AfterClass
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
