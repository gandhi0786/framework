package com.acttime.projectandcustomertest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.acttime.genericlib.ExcelLib;

public class ProjectandCustomerTest {

	ExcelLib elib=new ExcelLib();
	@Test
	
	public void createCustomerTest() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String username=elib.getexceldata("sheet1", 1, 2);
		String pwd=elib.getexceldata("sheet1", 1, 3);
		
		
		
		//step 1 login
		WebDriver d=new FirefoxDriver();
		d.get("http://localhost/login.do");
		d.findElement(By.name("username")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(pwd);		
				
	}
	
	public void modifyCustomerTest()
	{
		
	}
}
