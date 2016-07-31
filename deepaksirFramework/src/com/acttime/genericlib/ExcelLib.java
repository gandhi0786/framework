package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	public String getexceldata(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		String filepath="F:\\workspace\\deepaksirFramework\\TESTDATA\\TestData.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		String data=row.getCell(colnum).getStringCellValue();
		
		return data;
	}
	
	public void setexceldata(String sheetname,int rownum,int colnum,String data1){
		
	}

}
