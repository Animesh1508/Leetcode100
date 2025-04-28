package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.constants.Browser;

public abstract class BrowserUtility {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
//	public BrowserUtility(String browserName) {
//		if(browserName.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if(browserName.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		} else 
//			System.err.print("Invalid browserName... please select chrome or edge");
//		
//	}
	
	public BrowserUtility(Browser browserName) {
		if(browserName == Browser.CHROME) {
			driver = new ChromeDriver();
		} else if(browserName == Browser.EDGE) {
			driver = new EdgeDriver();
		} 
	}
	
	public void goToWebsite(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void clickOn(By locatorToClickOn) {
		WebElement elementToClick = driver.findElement(locatorToClickOn);
		elementToClick.click();
	}
	
	public void enterText(By locatorToEnterText, String text) {
		WebElement passTextBoxElement = driver.findElement(locatorToEnterText);
		passTextBoxElement.sendKeys(text);
	}
	
	public String getVisibleText(By locatorToGetText) {
		WebElement elementToGetText = driver.findElement(locatorToGetText);
		return elementToGetText.getText();
	}
	
	
	
	
	
}
