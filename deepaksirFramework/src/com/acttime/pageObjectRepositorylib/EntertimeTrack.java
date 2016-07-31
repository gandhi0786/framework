package com.acttime.pageObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebDriverCommonLib;



public class EntertimeTrack extends WebDriverCommonLib{
	
	
	//WebDriverCommonLib w=new WebDriverCommonLib();
	
	@FindBy(xpath="//div[text()='TASKS']")
	WebElement task;
	
	
	@FindBy(xpath="//div[text()='USERS']")
	WebElement user;
	
	public void navigatetotaskpage()
	{
		task.click();
		
		waitForPageToLoad();
		
		
		//w.waitForPageToLoad()
	}
	
	public void   navigatetouserpage()
	{
                 user.click();
		
		waitForPageToLoad();
	}
	

}
