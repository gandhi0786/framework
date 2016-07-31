package com.acttime.usertest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acttime.genericlib.Constants;
import com.acttime.genericlib.Driver;
import com.acttime.genericlib.ExcelLib;
import com.acttime.pageObjectRepositorylib.CreateNewUser;
import com.acttime.pageObjectRepositorylib.EntertimeTrack;
import com.acttime.pageObjectRepositorylib.Login;
import com.acttime.pageObjectRepositorylib.UserList;



public class Usertest {
	
	ExcelLib elib=new ExcelLib();


	
	@Test
	
		//Login loginpage=new Login() this is not syntax for creating object 
		
		//in order to create object we have to use page factory class
		
		
		
	
		public void createnewuser1() throws EncryptedDocumentException, InvalidFormatException, IOException			
			{
			String jk = elib.getexceldata("Sheet1", 1, 2);
			String firstName = elib.getexceldata("Sheet1", 1, 3);
			String lasttName = elib.getexceldata("Sheet1", 1, 4);
			String email = elib.getexceldata("Sheet1", 1, 5);
			String userPsw = elib.getexceldata("Sheet1", 1, 6);
			
			
		
		
		//get browsser object
		WebDriver driver=Driver.getBrowser();
		
			
		Login loginpage=PageFactory.initElements(driver, Login.class);
		
		loginpage.logintoapp(Constants.userName, Constants.password);
		
		
		//naviagte to userpage
		
		EntertimeTrack etr=PageFactory.initElements(driver, EntertimeTrack.class);
		etr.navigatetotaskpage();
		etr.navigatetouserpage();
		
		CreateNewUser cpage=PageFactory.initElements(driver, CreateNewUser.class);
		//cpage.createUser(userN, fName, lName, email, userPassword);
		
		//hi buddy
	
		
		
		
		
		
		
		
		
	}
	
}
