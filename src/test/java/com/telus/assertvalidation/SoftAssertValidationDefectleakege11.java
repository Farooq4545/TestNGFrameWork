package com.telus.assertvalidation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/* If any one validation is failed , then rest of the validation will  be executed 
 * inside the method 
 * By passing the softAssert.assertAll().
 * To stop the defectleakege
 * Create an object instance for softAssert out side the method
 * Replace the Assert to  softAssert
 * */

public class SoftAssertValidationDefectleakege11 {

	SoftAssert softAssert = new SoftAssert();

	@Test (priority=1)
	public void registerDemo() {

		// Implementation  of HardAssert
		System.out.println("Execution is started");
		softAssert.assertEquals(true, true,"Title are not equal");

		// First name error message
		System.out.println("First name error msg validation started");
		softAssert.assertEquals(true, true," First name error msg is not same");

		// Last name error message
		System.out.println("Last name error msg validation started");
		softAssert.assertEquals(false, true," Last name error msg is not same");

		// Gender name error message
		System.out.println("Gender name error msg validation started");
		softAssert.assertEquals(true, true," Gender name error msg is not same");

		// Email id error message
		System.out.println("Eamil id  error msg validation started");
		softAssert.assertEquals(true, true,"Eamil id error msg is not same");

		// Verification error message
		System.out.println("Verification  error msg validation started");
		softAssert.assertEquals(true, true,"Verification error msg is not same");

		System.out.println("Execution is ended");
		
		//Mandatory Step 
		softAssert.assertAll();
		
	}
}
