package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.LoginPage;

public class LoginFeatures {
WebDriver driver;
LoginPage lp;
public LoginFeatures(WebDriver driver)
{
	this.driver=driver;
	lp=new LoginPage(driver);
}
public void login(String username,String password)
{
	lp.getUnTxtBx().sendKeys(username);
	lp.getPwdTxtBx().sendKeys(password);
	lp.getLoginBtn().click();
	
}

public void verifyInvalidlogin()
{
	String actualMsg = lp.getGetInvalidLoginEle().getText();
	String expectedMsg="Username or Password is invalid. Please try again.";
	Assert.assertEquals(actualMsg, expectedMsg);
	Reporter.log("Invalid login is varified",true);
}

}
