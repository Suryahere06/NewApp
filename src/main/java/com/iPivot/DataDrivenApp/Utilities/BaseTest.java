package com.iPivot.DataDrivenApp.Utilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	ReadPropertiesFile prop=new ReadPropertiesFile();
	SelectBrowser s=new SelectBrowser();
	protected WebDriver driver=null;
	
	@BeforeMethod (alwaysRun = true)
	public void launchBrowser() throws Exception {
		
		String browser = prop.readPropFileByKey("browser");
		String url=prop.readPropFileByKey("url");
		System.out.println(url);

 		driver=s.getBrowser(browser);
		//driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		System.out.println("launch browser"); 
 		driver.navigate().to(url);
		System.out.println("launch url");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
}
