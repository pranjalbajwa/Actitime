package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.features.LoginFeatures;
import com.actitime.features.TimeTrackFeatures;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class LoginTest extends BaseLib {
@ Test(priority=1)
public void validlogin()
{
	ExcelUtilities eu=new ExcelUtilities("./testdata/Testdata.xlsx");
	String username=eu.readData("Sheet1", 1, 1);
	String password=eu.readData("Sheet1", 1, 2);
	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(username, password);
	TimeTrackFeatures ttf=new TimeTrackFeatures(driver);
	ttf.verifyEnterTimeTrackPage();
}
@ Test(priority=2)
public void invalidlogin()
{
	ExcelUtilities eu=new ExcelUtilities("./testdata/Testdata.xlsx");
	String username=eu.readData("Sheet1", 2, 1);
	String password=eu.readData("Sheet1", 2, 2);
	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(username, password);
	lf.verifyInvalidlogin();
}


}

