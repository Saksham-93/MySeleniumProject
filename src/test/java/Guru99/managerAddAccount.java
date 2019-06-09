package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.AddAccount;
import pageObject.LoginPage;

public class managerAddAccount extends base {
	
	
	
	@Test
	public void addAccount() throws IOException {
		
//		managerLogin ml = new managerLogin();
//		ml.managerLogin();
		
		
		AddAccount ac = new AddAccount(driver);
		
		ac.getNewAccountButton().click();
		
		ac.getCustid().sendKeys("11123");
		Select se = new Select(ac.getAccountType());
		se.selectByValue("Savings");
		ac.getInitialDeposit().sendKeys("534");
		ac.getsubmitButton().click();
		
		String actualText=driver.findElement(By.xpath("//*[@class='heading3']")).getText();
		
		String expectedText="Account Generated Successfully!!!";
		Assert.assertEquals(actualText, expectedText);
		System.out.println(driver.findElement(By.xpath("//*[@id='account']/tbody")).getText());
		//driver.close();
	}
	

}
