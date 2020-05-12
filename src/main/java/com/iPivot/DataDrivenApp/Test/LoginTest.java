package com.iPivot.DataDrivenApp.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.iPivot.DataDrivenApp.PageObject.LoginObjectfromHomePage;
import com.iPivot.DataDrivenApp.PageObject.LoginPage;
import com.iPivot.DataDrivenApp.Utilities.BaseTest;
//import com.iPivot.DataDrivenApp.Utilities.ExcelReader;

public class LoginTest extends BaseTest{
	//ExcelReader er=new ExcelReader();
	
	
	
	@Test(dataProvider="loginData",alwaysRun = true)
	public void loginTestCase(String user,String Pass) throws InterruptedException {
		LoginObjectfromHomePage.LoginLinkObject(driver).click();
		LoginPage.EmailFieldObject(driver).sendKeys(user);
		LoginPage.PasswordFieldObject(driver).sendKeys(Pass);
		Thread.sleep(2000);
		LoginPage.LoginFieldObject(driver).click();
		
	}
	




@DataProvider(name="loginData")
public Object[][] TestDataSupply()
{
	
	return null;
//return er.getExcelData();
	
}
}