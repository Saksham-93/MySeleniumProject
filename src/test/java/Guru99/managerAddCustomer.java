package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.AddCustomerPage;
import pageObject.LoginPage;
import pageObject.managerHomePage;

public class managerAddCustomer extends base{
	
	
	
	
	@Test
	public void managerAddCustomer() throws InterruptedException, IOException {
		
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		
	
		
		
	
		
		Thread.sleep(3000);
		
		
		AddCustomerPage acp = new AddCustomerPage(driver);
		acp.getCustomerName().sendKeys("Dean Reigns");
		acp.getdateOfBirth().sendKeys("11042011");
		acp.getcity().sendKeys("Pune");
		acp.getstate().sendKeys("Maharashtra");
		acp.getaddress().sendKeys("Olympia Society");
		acp.getpincode().sendKeys("678954");
		acp.getMobileNumber().sendKeys("7438757453");
		acp.getemail().click();
		acp.getemail().clear();
		acp.getemail().sendKeys("roman1.reigns@gmail.com");
		acp.getpassword().click();
		acp.getpassword().clear();
		acp.getpassword().sendKeys("dean@3");
		acp.getsubmitbutton().click();;
		
		String verificationText=acp.verificationText().getText();
		String ActualText="Customer Registered Successfully!!!";
		
		Assert.assertEquals(verificationText, ActualText);
		
		
		
		//driver.close();
		
	}
}
