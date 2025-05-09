package com.ui.tests;


import static com.constants.Browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.utility.BrowserUtility;

public class LoginTest {

	HomePage homePage;
	
	@BeforeTest(description = "Load the home page of the website")
	public void setUp() {
		homePage = new HomePage(CHROME);
	}
	
	
	@Test(description = "Verifies user is able to login with correct creds" , 
			groups= {"e2e" , "sanity"})
	public void loginTest() {
	
//		LoginPage loginPage = homePage.goToLoginPage();
//		loginPage.doLoginWith("ak@gmail.com", "pass");
		
		//String userName = homePage.goToLoginPage().doLoginWith("hagivod730@astimei.com", "password").getUserName();
		//Assert.assertEquals(userName, "Animesh k"); //Assert is static class so we can make static import
		
		assertEquals(homePage.goToLoginPage().doLoginWith("hagivod730@astimei.com", "password").getUserName(), "Animesh k");
	}
}

