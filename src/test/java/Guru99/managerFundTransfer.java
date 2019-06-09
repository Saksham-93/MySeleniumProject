package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.FundTransfer;
import pageObject.LoginPage;

public class managerFundTransfer extends base {
	
	

	@Test
	public void fundTransferFunctionalities() throws IOException {
		
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		FundTransfer ft = new FundTransfer(driver);
		
		ft.getfundTransfer().click();
		
		ft.getpayersaccountNumber().sendKeys("61035");
		
		ft.getpayeeaccountNumber().sendKeys("61034");
		
		ft.getamount().sendKeys("100");
		
		ft.getdescription().sendKeys("test");
		
		ft.getsubmitButton().click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[text()='Fund transfer']")).isDisplayed();
		
		String fundtransferdetails = driver.findElement(By.xpath("//*[text()='Fund Transfer Details']")).getText();
	
	String actualfundTransferpage = "Fund Transfer Details";
		Assert.assertEquals(fundtransferdetails, fundtransferdetails);
	System.out.println(driver.findElement(By.xpath("//*[@class='layout']/tbody/tr[2]//tbody")).getText());
		
		driver.close();
		
		
		
	}

}
