package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveprojCustPage {
	@FindBy(css="input[value='Create New Customer']")
	private WebElement createNewCustBtn;
	@FindBy(xpath="//table[@id='SuccessMessages']//span")
	private WebElement successMsgEle;
	@FindBy(xpath="//select[@name='selectedCustomer']")
	private WebElement selCustName;
	@FindBy(xpath="input[value='  Show  ']")
	private WebElement ShowTextBtn;
	@FindBy(xpath = "//td[@class='selectCustomer']/input")
	private WebElement selChkBx;
	@FindBy(xpath = "//input[@value='Delete Selected']")
	private WebElement delSelectedBtn;
	@FindBy(css = "input[value='Delete This Customer']")
	private WebElement DelThisCustPopUp;
	public WebElement getSelChkBx() {
		return selChkBx;
	}
	public WebElement getDelSelectedBtn() {
		return delSelectedBtn;
	}
	public WebElement getDelThisCustPopUp() {
		return DelThisCustPopUp;
	}
	public WebElement getShowTextBtn() {
		return ShowTextBtn;
	}
	public WebElement getSelCustName() {
		return selCustName;
	}
	public WebElement getSuccessMsgEle() {
		return successMsgEle;
	}
	public ActiveprojCustPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateNewCustBtn() {
		return createNewCustBtn;
	}
	

}
