package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage {
@FindBy(linkText="Projects & Customers")
private WebElement projCustLink;
public OpenTaskPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getProjCustLink() {
	return projCustLink;
}
}
