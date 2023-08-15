package com.telus.testannaotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingApplAssertValidation3 {
  @Test (priority=1)
  public void launchApplication() {
	  
	  System.out.println("Application is launched successfully");
	  Assert.assertEquals("Page Title", "Page Title","Titles are not same");
	  // Here we Hardcoded the Pagetitles
	  
	  
	  /*Title Validation example 
	  String actTitle = driver.getTitle();
	  String expectedTitle = "NxtGen A.I Academy - Learn With Clarity";
	  String expectedTitle = "Learn With Clarity";
	  Assert.assertEquals(actTitle, expectedTitle,"Titles are not same");*/
	  
  }
  
  @Test (priority=2)
  public void loginUser() {
	  System.out.println("User was logged in successfully");
	  Assert.assertEquals("Login", "Login","Invalid Login");
  }
  
  
  @Test (priority=3)
  public void checkSavingAccountBalnce() {
	  System.out.println("Saving account is checked successfully");
	  Assert.assertEquals("Saving Account Balnce", "Saving Account Balnce","Saving AccountBalnce is not equal");
  }
  
  
  @Test (priority=4 , enabled=false)// For Ignore the testmethod use enabled=false
  public void checkCurrentAccountBalnce() {
	  System.out.println("Current account is checked successfully");
	  Assert.assertEquals("Not Current Account Balnce", "Current Account Balnce","Current AccountBalnce is not equal");
  }
  
  @Test (priority=5)
  public void loggOff() {
	  System.out.println("Application is loggedout successfully");
	  Assert.assertEquals("LogOut", "LogOut","Unable to LogOut");
  }
  
  @Test (priority=6)
  public void closeApplication() {
	  System.out.println("Application is closed successfully");
	  Assert.assertEquals("Closed", "Closed","Unable to close the application");
  }
}
