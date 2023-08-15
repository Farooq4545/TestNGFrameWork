package com.telus.assertvalidation;

import org.testng.Assert;
import org.testng.annotations.Test;

/* If any one validation is failed , then rest of the validation will not be executed 
 * inside the method.
 * */

public class HardAssertValidation10 {
	
	
  @Test (priority=1)
  public void registerDemo() {
	  
	  // Implementation  of HardAssert
	  System.out.println("Execution is started");
	  Assert.assertEquals(true, true,"Title are not equal");
	  
	  // First name error message
	  System.out.println("First name error msg validation started");
	  Assert.assertEquals(true, true," First name error msg is not same");
	  
	// Last name error message
		  System.out.println("Last name error msg validation started");
		  Assert.assertEquals(false, true," Last name error msg is not same");
	  
		// Gender name error message
		  System.out.println("Gender name error msg validation started");
		  Assert.assertEquals(true, true," Gender name error msg is not same");
	  
		// Eamil id error message
		  System.out.println("Eamil id  error msg validation started");
		  Assert.assertEquals(true, true,"Eamil id error msg is not same");
	  
		// Verification error message
		  System.out.println("Verification  error msg validation started");
		  Assert.assertEquals(true, true,"Verification error msg is not same");
	  
  }
}
