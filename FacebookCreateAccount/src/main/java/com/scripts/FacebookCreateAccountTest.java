package com.scripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.EnvSetUp;
import com.generic.Utilities;
import com.pageFactory.LoginPage;
import com.pageFactory.SignUpPage;

public class FacebookCreateAccountTest extends EnvSetUp {
	private LoginPage objLoginPage;
	private SignUpPage objSignUpPage;
	

	// private By drpLocator=By.id("month");

	@BeforeClass
	public void initialiseWebEnvironment() {
		objLoginPage = new LoginPage(this);
		objSignUpPage = new SignUpPage(this);
		initialiseWebEnv();
	}

	@Test
	public void TC_ID_01_CreateFacebookAccount() {
		objLoginPage.clickCreateNewAccount();
		objSignUpPage.verifyFacebookTitle();
		objSignUpPage.setFirstName(objconfig.getProperty("firstName"));
		objSignUpPage.setLastName(objconfig.getProperty("lastName"));
		objSignUpPage.setMobileNumber(Utilities.randomnogenerate());
		objSignUpPage.setPassword(objconfig.getProperty("user.password"));
		objSignUpPage.setDateOfBirthDropDown(objconfig.getProperty("user.dateOfBirth"));// (selectbyvisibilitytext
																						// return string )
		// objModularFunctions.setDateOfMonthDropDown(5);
		objSignUpPage.setYearOfDropDown(Integer.parseInt(objconfig.getProperty("index")));// (selectbyvisibilityindex
																							// return int do type
																							// cast..properties file
																							// return string)
		// objModularFunctions.setYearOfDropDown((Integer.toString(objconfig.getProperty("index")));
		// objModularFunctions.verifyAllDropDownValues(drpLocator);
		objSignUpPage.setMonthInDropdown(Utilities.getRandomMonthInCalender());
		objSignUpPage.selectRadiobtn();

	}

}
