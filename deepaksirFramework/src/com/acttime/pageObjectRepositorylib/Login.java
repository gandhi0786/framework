package com.acttime.pageObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.Constants;
import com.acttime.genericlib.Driver;
import com.acttime.genericlib.WebDriverCommonLib;

public class Login extends WebDriverCommonLib {
	
	
	@FindBy(name="username")
	WebElement userNameedt;

	@FindBy(name="pwd")
	WebElement passwordedt;
	
	@FindBy(id="loginButton")
	WebElement loginbtn;
	
	
public void logintoapp(String username,String password)
{
	waitForPageToLoad();
	Driver.driver.get(Constants.url);
	userNameedt.sendKeys(username);
	passwordedt.sendKeys(password);
	loginbtn.click();
}
	
}
