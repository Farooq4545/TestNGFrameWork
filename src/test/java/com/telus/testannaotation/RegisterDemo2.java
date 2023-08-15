package com.telus.testannaotation;

import org.testng.annotations.Test;

public class RegisterDemo2 {
	
	
  @Test (priority=1)
  public void launchApplication() {
	  System.out.println("Application is launched successfully");
  }
  
  @Test  (priority=2)
  public void navigateToRegisterForm() {
	  System.out.println("Application is navigated successfully");
  }
  
  @Test  (priority=3)
  public void registerForDemo() {
	  System.out.println("User is registerd successfully");
  }
  
  @Test  (priority=4)
  public void valideSuccessfulMsg() {
	  System.out.println("Message is successfully validated");
  }
  
  @Test  (priority=5)
  public void closeApplication() {
	  System.out.println("Application is closed successfully");
  }
  
  
}
