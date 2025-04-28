package com.ui.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTestOld {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		
		BrowserUtility browserUtility = new BrowserUtility(wd);
		
		browserUtility.goToWebsite("http://www.automationpractice.pl/index.php");
		browserUtility.maximizeWindow();

		By signInLocator = By.xpath("//a[@class='login' and contains(normalize-space(text()), 'Sign in')]");
		browserUtility.clickOn(signInLocator);
		
		
		By emailTextBoxLocator = By.id("email");
		browserUtility.enterText(emailTextBoxLocator, "ak@gmail.com");
		
		By passTextBoxLocator = By.id("passwd");
		browserUtility.enterText(passTextBoxLocator, "pass");
		
		By submitBtnLocator = By.xpath("//button[@id= 'SubmitLogin']");
		browserUtility.clickOn(submitBtnLocator);		
	}
}
