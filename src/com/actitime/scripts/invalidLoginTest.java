package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.features.LoginFeatures;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class invalidLoginTest extends BaseLib {
	@ Test
	public void invalidlogin()
	{
		ExcelUtilities eu=new ExcelUtilities("./testdata/Testdata.xlsx");
		String username=eu.readData("Sheet1", 2, 1);
		String password=eu.readData("Sheet1", 2, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
	}

}
