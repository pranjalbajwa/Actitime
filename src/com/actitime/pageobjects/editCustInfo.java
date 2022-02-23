package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editCustInfo {
@FindBy(css="input[value='Delete This Customer']")
private WebElement deleteCustEle;

public editCustInfo(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getDeleteCustEle() {
	return deleteCustEle;
}
}
