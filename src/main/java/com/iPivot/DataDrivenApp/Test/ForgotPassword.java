package com.iPivot.DataDrivenApp.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iPivot.DataDrivenApp.PageObject.ForgotPasswordObject;
import com.iPivot.DataDrivenApp.PageObject.LoginObjectfromHomePage;
import com.iPivot.DataDrivenApp.Utilities.BaseTest;

public class ForgotPassword extends BaseTest {
	
	
	
	@Test(dataProvider="Email",alwaysRun = true)
	public void forgotPassword(String EmailId) throws InterruptedException {
		//String Email="surya.vijeyakumar@gmail.com";
		
	LoginObjectfromHomePage.LoginLinkObject(driver).click();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

	ForgotPasswordObject.forgotPassObject(driver).click();
	ForgotPasswordObject.EmailIdObject(driver).sendKeys(EmailId);
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
Thread.sleep(2000); 
		
	}
	
	
	
	
	
	
	@DataProvider(name="Email")
	public String[] getEmailId() {
		
		return new  String[]  {"surya.vijeyakumar@gmail.com","abcd"};
		
	}

}
