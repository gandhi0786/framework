package com.acttime.pageObjectRepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebDriverCommonLib;

public class CreateNewUser extends WebDriverCommonLib {
	
	

	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="firstName")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="email")
	private WebElement emailEdt;
	
	
	
	//input[@placeholder="Username"]

//	@FindBy(By.xpath("//input[@placeholder="Password"]"))
//	private WebElement passwordEdt;
	
	@FindBy(name="passwordTextRetype")
	private WebElement rePasswordEdt;

   @FindBy(xpath="//input[contains(@value,'Create')]")
   private WebElement createUserBtn;
   
   
//   @FindBy(xpath="//span[text()='Create User']")
//   private WebElement createuserbtn;
   
   public void createUser(String userN, String fName, String lName
		                 , String email, String userPassword){
	   userNameEdt.sendKeys(userN);
	   this.fName.sendKeys(fName);
	   this.lName.sendKeys(lName);
	   emailEdt.sendKeys(email);
	   //passwordEdt.sendKeys(userPassword);
	   rePasswordEdt.sendKeys(userPassword);
	   createUserBtn.click();
	   waitForPageToLoad();
	   
   }

}
