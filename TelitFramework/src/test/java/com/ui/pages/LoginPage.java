package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class LoginPage extends BrowserUtility{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static final By EMAIL_TEXTBOX_LOCATOR = By.id("email");	
	private static final By PASS_TEXTBOX_LOCATOR = By.id("passwd");
	private static final By SUBMIT_BTN_LOCATOR = By.xpath("//button[@id= 'SubmitLogin']");


	public MyAccountPage doLoginWith(String user, String pass) {
		enterText(EMAIL_TEXTBOX_LOCATOR, user);
		enterText(PASS_TEXTBOX_LOCATOR, pass);
		clickOn(SUBMIT_BTN_LOCATOR);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
	}

}
