package com.iPivot.DataDrivenApp.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	static String EmailFieldXpath="//input[@id='Email']";
	static String PasswordFieldXpath="//input[@id='Password']";
	static String LoginButtonXpath="//input[@class='button-1 login-button']";
	
	static public WebElement EmailFieldObject(WebDriver driver) {
		return driver.findElement(By.xpath(EmailFieldXpath));
	}
	
	static public WebElement PasswordFieldObject(WebDriver driver) {
		return driver.findElement(By.xpath(PasswordFieldXpath));
	}
	
	
	static public WebElement LoginFieldObject(WebDriver driver) {
		return driver.findElement(By.xpath(LoginButtonXpath));
	}
	
	
	
	
}
