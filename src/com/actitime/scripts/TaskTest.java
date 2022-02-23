package com.actitime.scripts;

import org.testng.annotations.Test;


import com.actitime.features.LoginFeatures;
import com.actitime.features.TaskFeatures;
import com.actitime.features.TimeTrackFeatures;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class TaskTest extends BaseLib
{
	@Test
	public void custCreate()
	{
		ExcelUtilities eu=new ExcelUtilities("./testdata/Testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password=eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		String customerName = eu.readData("Sheet1", 3, 3);
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickOnTask();
		tf.clickOnProjectCustLink();
		tf.createCostumer(customerName);
		tf.verifyCreateCustomer(customerName);
		
	}
	@Test()
	public void custDelete()
	{
		ExcelUtilities eu=new ExcelUtilities("./testdata/Testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password=eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		String customerName = eu.readData("Sheet1", 3, 3);
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickOnTask();
		tf.clickOnProjectCustLink();
		tf.showThisCust(customerName);
		
	}

	
	 
	
}
