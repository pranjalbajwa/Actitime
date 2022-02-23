package com.actitime.features;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import com.actitime.pageobjects.ActiveprojCustPage;
import com.actitime.pageobjects.CreateNewCustPage;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.OpenTaskPage;
import com.actitime.pageobjects.editCustInfo;

public class TaskFeatures {
WebDriver driver;
EnterTimeTrackPage ettp;
OpenTaskPage otp;
ActiveprojCustPage apcp;
CreateNewCustPage cncp;
editCustInfo eci;
public TaskFeatures(WebDriver driver)
{
	this.driver=driver;
	ettp=new EnterTimeTrackPage(driver);
	otp=new OpenTaskPage(driver);
	apcp=new ActiveprojCustPage(driver);
	cncp=new CreateNewCustPage(driver);
	eci=new editCustInfo(driver);
}
public void clickOnTask()
{
	ettp.getTaskEle().click();
}
public void clickOnProjectCustLink() {
	otp.getProjCustLink().click();
}
public void createCostumer(String customerName )
{
	apcp.getCreateNewCustBtn().click();
	cncp.getCustNameTxtBx().sendKeys(customerName);
	cncp.getCreateCustBtn().click();
}
public void verifyCreateCustomer(String customerName)
{
	String actualText = apcp.getSuccessMsgEle().getText();
	String expectedText = "Customer \""+customerName+"\" has been successfully created.";
	Assert.assertEquals(actualText, expectedText);
}
public void showThisCust(String customerName )
{
	Select sel = new Select(apcp.getSelCustName());
   sel.selectByVisibleText(customerName);
   apcp.getShowTextBtn();
   
	}

}
