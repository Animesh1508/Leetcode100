package com.ui.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.automationpractice.pl/index.php");
		wd.manage().window().maximize();

		By signInLocator = By.xpath("//a[@class='login' and contains(normalize-space(text()), 'Sign in')]");
		WebElement signInLinkWebElement = wd.findElement(signInLocator);
		signInLinkWebElement.click();
	}
}
