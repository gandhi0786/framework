package listn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	
	
	@Test()
	
	public void create()
	{
		System.out.println("A");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		Assert.assertEquals("gandhi", "gani");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		Assert.assertEquals("gandhi", "gani");
		
		
	}
	
	
	public void create1()
	{
		System.out.println("A");
		
		Assert.assertEquals("gandhi", "gandhi");
	}

}
