package com.telus.testannaotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingApplDepeOnMultipuleMethods6 {
	
	// Here we are using two(Saving and Current Account) methods in Tally Account
	
	@Test 
	public void launchApplication() {

		System.out.println("Application is launched successfully");
		Assert.assertEquals("Page Title", "Page Title","Titles are not same");

	}
	

	@Test (dependsOnMethods = {"launchApplication"})
	public void loginUser() {
		System.out.println("User was logged in successfully");
		Assert.assertEquals("Login", "Login","Invalid Login");
	}
	


	@Test (dependsOnMethods = {"loginUser"})
	public void checkSavingAccountBalnce() {
		
		System.out.println("Saving account is checked successfully");
		Assert.assertEquals("Saving Account Balnce", "Saving Account Balnce","Saving AccountBalnce is not equal");
	}
	


	@Test (dependsOnMethods = {"checkSavingAccountBalnce"})
	public void checkCurrentAccountBalnce() {
		System.out.println("Current account is checked successfully");
		Assert.assertEquals("Not Current Account Balnce", "Current Account Balnce","Current AccountBalnce is not equal");
	}
	
	@Test (dependsOnMethods = {"checkCurrentAccountBalnce","checkSavingAccountBalnce"})
	public void tallyAccountBallance() {
		System.out.println("Both the account balances are verified correctly");
		Assert.assertEquals("Tally", "Tally","Both the accounts are not Tallied");
	}
	

	@Test (dependsOnMethods = {"checkCurrentAccountBalnce"})
	public void loggOff() {
		System.out.println("Application is loggedout successfully");
		Assert.assertEquals("LogOut", "LogOut","Unable to LogOut");
	}
	

	@Test (dependsOnMethods = "loggOff" , alwaysRun = true)
	public void closeApplication() {
		System.out.println("Application is closed successfully");
		Assert.assertEquals("Closed", "Closed","Unable to close the application");
	}
}
