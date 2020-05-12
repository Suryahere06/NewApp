package com.iPivot.DataDrivenApp.Utilities;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBrowser {
	
	//Logger log=Logger.getLogger("SelectBrowser");
	
	WebDriver driver=null;
	
 	public WebDriver getBrowser(String browser) throws Exception {
		 
		
		if(browser==null)
		{
			//log.fatal("Browser should not be null. ");
			System.exit(0);  
		}
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome browser1");
try {
	
    String currentDirectory = System.getProperty("user.dir");
    System.out.println("The current working directory is " + currentDirectory);
    
 

	WebDriverManager.chromedriver().setup();
	 System.out.println(WebDriverManager.chromedriver().getBinaryPath());
	 String str1= WebDriverManager.chromedriver().getBinaryPath();

	System.out.println("Chrome browser2");
	System.setProperty("webdriver.chrome.driver", str1);
	driver=new ChromeDriver();
    //driver.manage().window().maximize();

	 
    

			System.out.println("Chrome browser3");
}
			//log.info("Browser selected is chrome browser");

catch(Exception e) {
    e.printStackTrace();
}
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			//log.info("Browser selected is firefox browser");
			
		}else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			//log.info("Browser selected is ie browser");
		
	}else {
		//log.fatal("specify the corect browser");
		System.exit(0);
	}
return driver;
	}

}