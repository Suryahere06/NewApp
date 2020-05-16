package com.iPivot.DataDrivenApp.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.iPivot.DataDrivenApp.PageObject.LoginObjectfromHomePage;
import com.iPivot.DataDrivenApp.PageObject.LoginPage;
import com.iPivot.DataDrivenApp.Utilities.BaseTest;
import com.iPivot.DataDrivenApp.Utilities.ExcelReader;
//import com.iPivot.DataDrivenApp.Utilities.ExcelReader;

public class LoginTest extends BaseTest{
 

@DataProvider(name="loginData")
public Object[][] TestDataSupply() throws IOException
{
	 
	System.out.println("inside data provider");

	return new ExcelReader().getExcelData();

	
}

@Test(dataProvider="loginData",alwaysRun = true)
public void loginTestCase(String user, String pass) throws InterruptedException {
	LoginObjectfromHomePage.LoginLinkObject(driver).click();
	LoginPage.EmailFieldObject(driver).sendKeys(user);
	LoginPage.PasswordFieldObject(driver).sendKeys(pass);
	Thread.sleep(2000);
	LoginPage.LoginFieldObject(driver).click();
	
}

}
