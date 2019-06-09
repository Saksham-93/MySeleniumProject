package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.BalanceEnquiry;
import pageObject.DeleteAccount;
import pageObject.Withdrawl;

public class managerWithdrawl extends base {
	
	@Test
	public void withdrawlFunctionalities() throws IOException {
		
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		
		managerAddAccount ma=new managerAddAccount();
		ma.addAccount();
		
		String AccountNumber =  driver.findElement(By.xpath("//*[@id='account']/tbody/tr[4]/td[2]")).getText();
		
		Withdrawl wi = new Withdrawl(driver);
		
		wi.getWithdrawalButton().click();
		
		wi.getAccountNumber().sendKeys(AccountNumber);
		
		wi.getAmount().sendKeys("200");
		
		wi.getDescription().sendKeys("Testing Withdrawal");
		
		wi.getSubmitButton().click();
		
		System.out.println(wi.getWithdrawalDetails().getText());
		
		// 2 When the amount for Withdrawal is more
		
		wi.getWithdrawalButton().click();
        wi.getAccountNumber().sendKeys(AccountNumber);
		
		wi.getAmount().sendKeys("200000000");
		
		wi.getDescription().sendKeys("Testing Withdrawal");
		
		wi.getSubmitButton().click();
		
		String ActualText=driver.switchTo().alert().getText();
		
		String ExpectedText = "Transaction Failed. Account Balance Low!!!";
		
		Assert.assertEquals(ActualText, ExpectedText);
		
		driver.switchTo().alert().accept();
		
		DeleteAccount da = new DeleteAccount(driver);
		
		da.getStatementButton().click();
		wi.getAccountNumber().sendKeys(AccountNumber);
		wi.getSubmitButton().click();
		System.out.println(wi.getMinistatementDetails().getText());
		
		BalanceEnquiry be = new BalanceEnquiry(driver);
		be.getBalanceEnquiryButton().click();
		
		wi.getAccountNumber().sendKeys(AccountNumber);
		
		wi.getSubmitButton().click();
		
		System.out.println(be.getBalanceDetails().getText());
		
		driver.close();
	}

}
