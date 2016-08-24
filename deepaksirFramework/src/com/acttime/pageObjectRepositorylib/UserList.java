package com.acttime.pageObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebDriverCommonLib;

public class UserList extends WebDriverCommonLib {
	
	@FindBy(xpath="//span[text()='User']")
	WebElement createuser;
	
	@FindBy(xpath="//span[@class='successmag']")
	WebElement  wbsucessfulmsg;
	
	
	
	public WebElement getCreateuser() {
		return createuser;
	}



	public WebElement getWbsucessfulmsg() {
		return wbsucessfulmsg;
	}



	public void navigatetocreatenewuserpage()
	{
		createuser.click();
		
		waitForPageToLoad();
		
	}

}
