package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BrowserFactory {
	public static WebDriver launchbrowser(String BrowserName)
	{
      WebDriver driver=null;
      if(BrowserName.equalsIgnoreCase("Firefox"))
      {
    	  System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
    	  driver=new FirefoxDriver();
    	  Reporter.log("Firefox browser launched",true);
      }
      if(BrowserName.equalsIgnoreCase("Chrome"))
      {
    	  System.setProperty("webdriver.chrome.driver","./exefiles/cd.exe");
    	  driver=new ChromeDriver();
    	  Reporter.log("Chrome browser launched", true);
      }
      return driver;
}
}
