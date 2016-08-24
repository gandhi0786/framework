package com.acttime.pageObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {

	
	@FindBy(id="logoutLink")
	WebElement logoutLnk;
	
	
	public void logouts()
	{
		logoutLnk.click();
	}
	//as per automation rule test data should not hard coreded in test script  so in excel data 
	//as per automation rule xpath should not hardcoded in test  script so we mantain in page object repository
}
