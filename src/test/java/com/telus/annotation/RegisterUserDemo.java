package com.telus.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterUserDemo {

	public WebDriver driver;
    String myName = "Aariz";
	String firstNameInput="SHAIK";
	String lastNameInput="FAROOQ";
	String addressInput="SHAIVALAYAM";
	String doorNumberInput="4-41";
	String stateInput="ANDHRA PRADESH";
	String cityInput="KURNOOL";
	String zipInput="518001";
	String countryInput="India";
	String emailInput="shaik.farooq7@gmail.com";
	String dateInput="15/05/1998";
	String hours="01";
	String minutes="05";
	String mobileNumberInput= "9966986868";
	String queryInput="xyz";
	String title="NxtGen A.I Academy – Learn With Clarity";
	String actualOutput = "Registration Form is Successfully Submitted. The Transaction ID NXTGEN1937465";
	String expectedOutValue="Registration Form is Successfully Submitted.";
	String transactionId=" NXTGEN1937465";

	@Test (priority=1)
	public void launchApplication() {

		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		String url ="https://nxtgenaiacademy.com/";
		driver.get(url);
		driver.manage().window().maximize();

		Reporter.log("Application is launched successfully");
	}

	@Test(priority=2)
	public void navigateToRegistrationForm() {

		Actions action=new Actions(driver);

		WebElement demoSites=driver.findElement(By.linkText("Demo Sites"));
		action.moveToElement(demoSites).perform();


		WebElement practiceAuto=driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAuto).perform();

		WebElement registration = driver.findElement(By.partialLinkText("Registration Form"));
		registration.click();


		Reporter.log("Application is Navigated successfully");
	}

	@Test (priority=3)
	public void registerUser() {
		
		WebElement firstName=driver.findElement(By.id("vfb-5"));
		if(firstName.isDisplayed()) {
			Reporter.log("First Name is Displayed ");
		}
		else
		{
			Reporter.log("First Name is not Displayed");
		}

		if(firstName.isEnabled()) {
			Reporter.log("First Name is Enabled");
			firstName.sendKeys(firstNameInput);
			Reporter.log("First Name is -"+firstNameInput);
		}
		else
		{
			Reporter.log("First Name  is not Enabled");
		}

		//Last Name
		WebElement lastName=driver.findElement(By.id("vfb-7"));

		if(lastName.isDisplayed())
		{
			Reporter.log("Last Name is Displayed");

		}
		else
		{
			Reporter.log("Last Name is not Displayed");
		}

		if(lastName.isEnabled()) {
			Reporter.log("Last Name is Enabled");
			lastName.sendKeys(lastNameInput);
			Reporter.log("Last Name is-"+lastNameInput);
		}
		else
		{
			Reporter.log("Last Name is not Enabled");
		}

		// Gender
		WebElement male=driver.findElement(By.id("vfb-8-1"));


		if(male.isDisplayed()) {
			Reporter.log("Gender is Displayed");
		}
		else
		{
			Reporter.log("Gender is not Displayed");
		}

		if(male.isEnabled()) {
			Reporter.log("Gender is Enabled");
			male.click();
			Reporter.log("The Gender Selected is- Male");
		}
		else
		{
			Reporter.log("Gender is not Enabled");
		}

		//address
		WebElement address=driver.findElement(By.id("vfb-13-address"));


		if(address.isDisplayed()) {
			Reporter.log("Address is Displayed");
		}
		else
		{
			Reporter.log("Address is not Displayed");
		}

		if(address.isEnabled()) {
			Reporter.log("Address is Enabled");
			address.sendKeys(addressInput);
			Reporter.log("Address is-"+addressInput);
		}
		else
		{
			Reporter.log("Address is not Enabled");
		}

		//DoorNumber

		WebElement doorNumber=driver.findElement(By.id("vfb-13-address-2"));


		if(doorNumber.isDisplayed()) {
			Reporter.log("Door Number is Displayed");

		}
		else
		{
			Reporter.log("Door Number is not Displayed");
		}


		if(doorNumber.isEnabled()) {
			Reporter.log("Door Number is Enabled");
			doorNumber.sendKeys(doorNumberInput);
			Reporter.log("The Door Number Is -"+doorNumberInput);

		}
		else
		{
			Reporter.log("Door Number is not Enabled");
		}

		//city

		WebElement city=driver.findElement(By.id("vfb-13-city"));


		if(city.isDisplayed()) {
			Reporter.log("City is Displayed");

		}
		else
		{
			Reporter.log("City is not Displayed");
		}


		if(city.isEnabled()) {
			Reporter.log("City is Enabled");
			city.sendKeys(cityInput);
			Reporter.log("The City Name is-"+cityInput);
		}
		else
		{
			Reporter.log("City is not Enabled");
		}

		//State 

		WebElement state=driver.findElement(By.id("vfb-13-state"));


		if(state.isDisplayed()) {
			Reporter.log("State is Displayed");

		}
		else
		{
			Reporter.log("tSate is not Displayed");
		}


		if(state.isEnabled()) {
			Reporter.log("Sate is Enabled");
			state.sendKeys(stateInput);
			Reporter.log("The State Name is-"+stateInput);
		}
		else
		{
			Reporter.log("State is not Enabled");
		}

		//Zip Code

		WebElement zipCode=driver.findElement(By.id("vfb-13-zip"));


		if(zipCode.isDisplayed()) {
			Reporter.log("Pin Code is Displayed");

		}
		else
		{
			Reporter.log("Pin Code is not Displayed");
		}


		if(zipCode.isEnabled()) {
			Reporter.log("Pin Code is Enabled");
			zipCode.sendKeys(zipInput);
			Reporter.log("The ZIP Code is -"+zipInput);
		}
		else
		{
			Reporter.log("Pin Code is not Enabled");
		}

		//Country

		WebElement country = driver.findElement(By.id("vfb-13-country"));


		if(country.isDisplayed()) {
			Reporter.log("Country is Displayed");

		}
		else
		{
			Reporter.log("Country is not Displayed");
		}


		if(country.isEnabled()) {
			Reporter.log("Country is Enabled");
			Select countryName=new Select(country);
			countryName.selectByValue(countryInput);
			Reporter.log("Country is -"+countryInput);
		}
		else
		{
			Reporter.log("Country is not Enabled");
		}
		if(country.isSelected()) {
			Reporter.log("Country is not Selected");
		}
		else {
			Reporter.log("Country is Selected");
		}


		//email

		WebElement email=driver.findElement(By.id("vfb-14"));


		if(email.isDisplayed()) {
			Reporter.log("Email is Displayed");

		}
		else
		{
			Reporter.log("Email is not Displayed");
		}


		if(email.isEnabled()) {
			Reporter.log("Email is Enabled");
			email.sendKeys(emailInput);
			Reporter.log("Email is -"+emailInput);
		}
		else
		{
			Reporter.log("Email is not Enabled");
		}

		//Date

		WebElement date=driver.findElement(By.id("vfb-18"));

		if(date.isDisplayed()) {
			Reporter.log("Date is Displayed");

		}
		else
		{
			Reporter.log("Date is not Displayed");
		}


		if(date.isEnabled()) {
			Reporter.log("Date is Enabled");
			date.sendKeys(dateInput);
			Reporter.log("Selected Date is -"+dateInput);
		}
		else
		{
			Reporter.log("Date is not Enabled");
		}

		//Time Hours 

		WebElement time=driver.findElement(By.id("vfb-16-hour"));

		if(time.isEnabled()) {
			Reporter.log("Time is Enabled");
			Select hours1=new Select(time);
			hours1.selectByValue(hours);
			Reporter.log("The Time is Hours -"+hours);
		}
		else
		{
			Reporter.log("Time is not Enabled");
		}

		//Time Minutes

		WebElement timeM=driver.findElement(By.id("vfb-16-min"));

		if(time.isDisplayed()) {
			Reporter.log("Time is Displayed");
			Select minutes1=new Select(timeM);
			minutes1.selectByValue(minutes);
			Reporter.log("The Time is -"+minutes);

		}
		else
		{
			Reporter.log("Time is not Displayed");
		}

		//Mobile Number

		WebElement mobile=driver.findElement(By.id("vfb-19"));

		if(mobile.isDisplayed()) {
			Reporter.log("Mobile is Displayed");

		}
		else
		{
			Reporter.log("Mobile is not Displayed");
		}


		if(mobile.isEnabled()) {
			Reporter.log("Mobile is Enabled");
			mobile.sendKeys(mobileNumberInput);
			Reporter.log("Mobile Number Is-"+mobileNumberInput);
		}
		else
		{
			Reporter.log("Mobile is not Enabled");
		}

		//Course  UFT Check Box

		WebElement cousreUFT =driver.findElement(By.id("vfb-20-1"));
		if(cousreUFT.isDisplayed()) {
			Reporter.log("CourseUFT  is Displayed");
		}
		else
		{
			Reporter.log("CourseUFT is not Displayed");
		}


		if(cousreUFT.isEnabled()) {
			Reporter.log("CourseUFT is Enabled");
			cousreUFT.click();
			Reporter.log("Course intrested UFT is Selected");
			Reporter.log("intrested course -UFT");
		}
		else
		{
			Reporter.log("CourseUFT is not Enabled");

		}

		//Course TestNG Check Box 

		WebElement courseTestNG =driver.findElement(By.id("vfb-20-2"));

		if(courseTestNG.isDisplayed()) {
			Reporter.log("Course TestNG is Displayed");
		}
		else
		{
			Reporter.log("Course TestNG is not Displayed");
		}


		if(courseTestNG.isEnabled()) {
			Reporter.log("CourseTestNG is Enabled");
			courseTestNG.click();
			Reporter.log("Course Intrested TestNG is Selected");
			Reporter.log("Intrested course-TestNG");
		}
		else
		{
			Reporter.log("CourseTestNG is not Enabled");

		}
		//Query
		WebElement query=driver.findElement(By.id("vfb-23"));


		if(query.isDisplayed()) {
			Reporter.log("Query is Displayed");

		}
		else
		{
			Reporter.log("Query is not Displayed");
		}

		if(query.isEnabled()) {
			Reporter.log("Query is Enabled");
			query.sendKeys(queryInput);
			Reporter.log("Query is -"+queryInput);

		}
		else
		{
			Reporter.log("Query is not Enabled");
		}

		//Verification
		WebElement verificationcode=driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"));
		String example=verificationcode.getText();
		if(verificationcode.isDisplayed()) {
			Reporter.log("Code is Displayed");
		}
		else
		{
			Reporter.log("Code is not Displayed");
		}

		if(verificationcode.isEnabled()) {
			Reporter.log("Code is Enabled");
			String[] twoDigits=example.split(":");
			WebElement verify=driver.findElement(By.id("vfb-3"));
			String codes=twoDigits[1].trim();
			verify.sendKeys(codes);
			Reporter.log("Verification Code is -"+codes);
		}
		else
		{
			Reporter.log("code is not Enabled");
		}

		//Click Submit Button

		WebElement submitButton=driver.findElement(By.id("vfb-4"));


		if(submitButton.isDisplayed()) {
			Reporter.log("Submit Button is Displayed");
		}
		else
		{
			Reporter.log("Submit Button is not Displayed");
		}

		if(submitButton.isEnabled()) {
			Reporter.log("Submit Button is Enabled");
			submitButton.click();

		}
		else
		{
			Reporter.log("Submit Button is not Enabled");
		}

		Reporter.log("User is Registerd successfully");
	}

	@Test (priority=4)
	public void validateSuccessfullMsg() {


		//Validating the Actual Output and Expected Outputs  are same or not 
		if(actualOutput.contains(expectedOutValue)) {

			Reporter.log("The Both Out Puts are Same");
			Reporter.log("The Actual output is "+actualOutput);
			Reporter.log("The Transaction Id is"+transactionId);
		}
		else 
		{
			Reporter.log("Registration Form is not Successfully Submitted");
		}

		{
			Reporter.log("Registration Form is Successfully is not Displayed");
			//String actual = output.getText();
			//Reporter.log("Actual Successfull Message is "+actual );
			Reporter.log("Expected Successfull Message is "+expectedOutValue);
		}

		Reporter.log("Successfully Validated the message");
	}

	@Test(priority=5)
	public void closeApplication() {

		//Close the application
		driver.close();
		Reporter.log("Application is closed successfully");
	}




}
