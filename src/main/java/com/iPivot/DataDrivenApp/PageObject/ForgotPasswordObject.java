package com.iPivot.DataDrivenApp.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordObject {
	
//	 static String ForgotPassword="//a[linktext()='Forgot password?']";
	int i =1;
	
 static	public  WebElement forgotPassObject(WebDriver driver) {
		return driver.findElement(By.linkText("Forgot password?"));
		
	}

 static public WebElement EmailIdObject(WebDriver driver) {
	return driver.findElement(By.name("Email"));
	 
 }
}
