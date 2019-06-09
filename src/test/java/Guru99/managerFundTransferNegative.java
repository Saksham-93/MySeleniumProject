package Guru99;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.FundTransfer;
import pageObject.LoginPage;

public class managerFundTransferNegative extends base {
	
	@Test
	public void fundtransferNegative() throws IOException {
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		FundTransfer ft = new FundTransfer(driver);
		
		ft.getfundTransfer().click();
		String firstAccountNumber ="61305";
		ft.getpayersaccountNumber().sendKeys(firstAccountNumber);
		String wrongAccountNumber = "1234";
		ft.getpayeeaccountNumber().sendKeys(wrongAccountNumber);
		ft.getamount().sendKeys("100");
		ft.getdescription().sendKeys("test");
		ft.getsubmitButton().click();
		
		String popUpText = driver.switchTo().alert().getText();
		String expectedPopupText = "Account"+" "+firstAccountNumber+"does not exist!!!";
		
		Assert.assertEquals(popUpText, expectedPopupText);
		driver.switchTo().alert().accept();
		
		
		ft.getpayersaccountNumber().sendKeys(firstAccountNumber);
		String wrongAccountNumber1 = "61305";
		ft.getpayeeaccountNumber().sendKeys(wrongAccountNumber1);
		ft.getamount().sendKeys("100");
		ft.getdescription().sendKeys("test");
		ft.getsubmitButton().click();
		
		String popUptextsecond = driver.switchTo().alert().getText();
		String expectedValidation = "Payers account No and Payees account No Must Not be Same!!!";
		Assert.assertEquals(popUptextsecond, expectedValidation);
		driver.switchTo().alert().accept();
		
		ft.getpayersaccountNumber().sendKeys(firstAccountNumber);
		String wrongAccountNumber2 = "61304";
		ft.getpayeeaccountNumber().sendKeys(wrongAccountNumber2);
		ft.getamount().sendKeys("1000000");
		ft.getdescription().sendKeys("test");
		ft.getsubmitButton().click();
		
		String popUpthird = driver.switchTo().alert().getText();
		String expectedValidationThird ="Transfer Failed. Account Balance low!!";
		Assert.assertEquals(popUpthird, expectedValidationThird);
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
				
		
		
		
		
		
	}

}
