package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.io.FileNotFoundException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author pranjal
 *
 */
public class ExcelUtilities {
String filepath;
public ExcelUtilities(String filepath)
{
	this.filepath=filepath;
}
/**
 * @author pranjal
 * @param sheetName
 * @param row
 * @param cell
 * @return
 */
public  String readData(String sheetName,int row,int col)
{
	String value =null;
	try {
		FileInputStream fis=new FileInputStream(new File(filepath));
		Workbook wb=WorkbookFactory.create(fis);
		Cell cl = wb.getSheet(sheetName).getRow(row).getCell(col);
		switch (cl.getCellType()) {
		case STRING:
			value=cl.getStringCellValue();
			break;
	    case NUMERIC:
			if(DateUtil.isCellDateFormatted(cl))
			{
				SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy");
				value=sdf.format(cl.getDateCellValue());
			}
			else
			{
				
				value=Long.toString((long) cl.getNumericCellValue());
			}
			break;
	    case BOOLEAN:
		value=Boolean.toString(cl.getBooleanCellValue());
		break;
		default:
			break;
		}
	}
	catch(EncryptedDocumentException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	return value;
	}
}

