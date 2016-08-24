package com.acttime.usertest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acttime.genericlib.Constants;
import com.acttime.genericlib.Driver;
import com.acttime.genericlib.ExcelLib;
import com.acttime.pageObjectRepositorylib.Common;
import com.acttime.pageObjectRepositorylib.CreateNewUser;
import com.acttime.pageObjectRepositorylib.EntertimeTrack;
import com.acttime.pageObjectRepositorylib.Login;



public class Usertest {
	ExcelLib elib;
	WebDriver driver;
	Login loginpage;
	EntertimeTrack etr;
	CreateNewUser cpage;
	Common compage;
	 
	 @BeforeClass
	
	public void configbeforeclass()
	{
		 elib=new ExcelLib();
		 
		 //get browser
		 
		 Reporter.log("launch browser");
		 
		 Reporter.log("launch browser");
		 driver=Driver.getBrowser();
		  loginpage=PageFactory.initElements(driver, Login.class);
		 etr=PageFactory.initElements(driver, EntertimeTrack.class);
		 cpage=PageFactory.initElements(driver, CreateNewUser.class);
		  compage=PageFactory.initElements(driver, Common.class);
		
	}
	
	
@BeforeMethod


public void configbeforemethod()
{
	
	Reporter.log("login into application");
	loginpage.logintoapp(Constants.userName, Constants.password);
	
	Reporter.log("login is successfull");
}

	

	
	@Test
	
		//Login loginpage=new Login() this is not syntax for creating object 
		
		//in order to create object we have to use page factory class
		
		
	
		public void createnewuser1() throws EncryptedDocumentException, InvalidFormatException, IOException			
			{
		//get the data 
		Reporter.log("get test data from exce;l");
		
			String jk = elib.getexceldata("Sheet1", 5, 2);
			String firstName = elib.getexceldata("Sheet1", 5, 3);
			String lasttName = elib.getexceldata("Sheet1", 5, 4);
			String email = elib.getexceldata("Sheet1", 5, 5);
			String userPsw = elib.getexceldata("Sheet1", 5, 6);
			
	//navigate to task page
			Reporter.log("navigate to task page");
		etr.navigatetotaskpage();
		
		//navigate to task page
		Reporter.log("navigate to user page");
		etr.navigatetouserpage();
		
		
		etr.clickonuserbutton();
		//create user
		
		Reporter.log("create user ");
	
		cpage.createUser(jk, firstName, lasttName, email, userPsw);
		
		
		
		
		
			}
		

	
	@AfterMethod
		
		public void configAfterMtd(){
			
		 compage.logouts();
	}
	
	
	
	
			
		@AfterClass
		public void configAfterClass(){
			
Reporter.log("close browser");
			driver.quit();
		}

		

		
		
		
		
		
		
		
	}
	

