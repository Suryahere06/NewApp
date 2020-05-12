package com.iPivot.DataDrivenApp.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjectfromHomePage {
	
//static 	String LoginLink="//a[linktext()='Log in']";
	
	static public WebElement LoginLinkObject(WebDriver driver) {
		
		return driver.findElement(By.linkText("Log in"));
		
	}

}
