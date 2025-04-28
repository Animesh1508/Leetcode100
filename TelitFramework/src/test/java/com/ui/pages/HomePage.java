package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import static com.constants.ENV.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;

import static com.utility.PrpoertiesUtil.*;

public class HomePage extends BrowserUtility{

	public HomePage(Browser browserName) {
		super(browserName);
		goToWebsite(JSONUtility.readJson(QA));
		//goToWebsite(readProperty(QA, "URL"));
	}


	private static final By SIGN_IN_LOCATOR = By.xpath("//a[@class='login' and contains(normalize-space(text()), 'Sign in')]");
	
	
	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_LOCATOR);
		LoginPage loginPage =  new LoginPage(getDriver());
		return loginPage;
	}
}
