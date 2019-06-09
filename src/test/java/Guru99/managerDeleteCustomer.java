package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddCustomerPage;
import pageObject.DeleteCustomer;
import pageObject.LoginPage;

public class managerDeleteCustomer extends base {
	
	@Test
	public void deteCustomerFunctionalieties() throws IOException, InterruptedException {
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		
		DeleteCustomer dc = new DeleteCustomer(driver);
		
		dc.getDeleteCustomer().click();
		
		dc.getCustomerId().sendKeys("11123");
		
		dc.getSubmitButton().click();
		
		//1 st functionality verifying the pop up for deleted Customer
		
		String firstpop=driver.switchTo().alert().getText();
		
		String actualfirstpopup ="Do you really want to delete this Customer?";
		
		Assert.assertEquals(firstpop, actualfirstpopup);
		
		driver.switchTo().alert().accept();
		
		//2nd functionality verifying the pop up 
		
		String secondpopup = driver.switchTo().alert().getText();
		
		String actualsecondpopup ="Customer could not be deleted!!. First delete all accounts of this customer then delete the customer";
		
		Assert.assertEquals(secondpopup, actualsecondpopup);
		
		driver.switchTo().alert().accept();
		
driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		
	
		
		
	
		
		Thread.sleep(3000);
		
		
		AddCustomerPage acp = new AddCustomerPage(driver);
		acp.getCustomerName().sendKeys("Rohit Sharma");
		acp.getdateOfBirth().sendKeys("11042011");
		acp.getcity().sendKeys("Pune");
		acp.getstate().sendKeys("Maharashtra");
		acp.getaddress().sendKeys("Olympia Society");
		acp.getpincode().sendKeys("678954");
		acp.getMobileNumber().sendKeys("7438657453");
		acp.getemail().click();
		acp.getemail().clear();
		acp.getemail().sendKeys("rohit.sharma@gmail.com");
		acp.getpassword().click();
		acp.getpassword().clear();
		acp.getpassword().sendKeys("rohit@3");
		acp.getsubmitbutton().click();;
		
		String verificationText=acp.verificationText().getText();
		String ActualText="Customer Registered Successfully!!!";
		
		Assert.assertEquals(verificationText, ActualText);
		
		String customerid = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]")).getText();
		
         dc.getDeleteCustomer().click();
		
		dc.getCustomerId().sendKeys(customerid);
		
		dc.getSubmitButton().click();
		
		driver.switchTo().alert().accept();
		
		String customerdeleted="Customer deleted Successfully";
		
		String verifycustomerdeletedText = driver.switchTo().alert().getText();
		
		Assert.assertEquals(customerdeleted, verifycustomerdeletedText);
		
		driver.switchTo().alert().accept();
		
		WebDriverWait wd = new WebDriverWait(driver, 5);
		wd.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Manger Id : mngr196162']"))));
		
		String managerHometext = driver.findElement(By.xpath("//*[text()='Manger Id : mngr196162']")).getText();
		
		String actualHomeText ="Manger Id : mngr196162";
		
		Assert.assertEquals(actualHomeText, managerHometext);
		
		System.out.println("You are at manager Home page");
		
		dc.getEditCustomer().click();
		
        dc.getCustomerId().sendKeys(customerid);
		
		dc.getSubmitButton().click();
		
		String thirdpopup ="Customer does not exist!!";
		
		String actualthirdpopup = driver.switchTo().alert().getText();
		
		Assert.assertEquals(actualthirdpopup, thirdpopup);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		driver.close();
		
	}

}
