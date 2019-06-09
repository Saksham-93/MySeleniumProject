package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddAccount;
import pageObject.DeleteAccount;
import pageObject.LoginPage;

public class managerMiniStatement extends base {
	
	
	@Test
	public void generateMiniStatement() throws IOException {
		
		managerLogin ml = new managerLogin();
		ml.managerLogin();
				managerAddAccount ma = new managerAddAccount();
				ma.addAccount();
				String AccountNumber = driver.findElement(By.xpath("//*[@id='account']/tbody/tr[4]/td[2]")).getText();
						
		DeleteAccount da = new DeleteAccount(driver);
				
				da.getdeleteAccountButton().click();
				
				da.getAccountNumber().sendKeys(AccountNumber);
				
				da.getSubmitButton().click();
				
				String popUpText=driver.switchTo().alert().getText();
				
				String ActualPopupText = "Do you really want to delete this Account?";
				
				Assert.assertEquals(popUpText, ActualPopupText);
				
				driver.switchTo().alert().accept();
				
				String deletedAccount=driver.switchTo().alert().getText();
				
				String Expectedtext = "Account Deleted Sucessfully";
				
				Assert.assertEquals(deletedAccount, Expectedtext);
				driver.switchTo().alert().accept();
				
				WebDriverWait wd = new WebDriverWait(driver, 5);
				wd.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Manger Id : mngr196162']"))));
				
				String managerHometext = driver.findElement(By.xpath("//*[text()='Manger Id : mngr196162']")).getText();
				
				String actualHomeText ="Manger Id : mngr196162";
				
				Assert.assertEquals(actualHomeText, managerHometext);
				
				System.out.println("You are at manager Home page");
				
				da.getStatementButton().click();
				
				da.getAccountNumber().sendKeys(AccountNumber);
				
				da.getSubmitButton().click();
				
				String ministatementpopup =driver.switchTo().alert().getText();
				
				String actualministatementpopup ="Account does not exist";
				
				Assert.assertEquals(ministatementpopup, actualministatementpopup);
				
				driver.switchTo().alert().accept();
				
				wd.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Mini Statement Form']"))));
				
				
				String ministatementpage = driver.findElement(By.xpath("//*[text()='Mini Statement Form']")).getText();
				
				String actualministatementpage = "Mini Statement Form";
				
				Assert.assertEquals(ministatementpage, actualministatementpage);
				
				System.out.println("At mini statement page");
				
				da.getBalanceStatement().click();
				
				da.getAccountNumber().sendKeys(AccountNumber);
				
				da.getSubmitButton().click();
				
				String balanceEnquirypopup=driver.switchTo().alert().getText();
				
				String actualBalanceEnquiryPopUp = "Account does not exist";
				
				Assert.assertEquals(balanceEnquirypopup, actualBalanceEnquiryPopUp);
				
				driver.switchTo().alert().accept();
				
				wd.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Balance Enquiry Form']"))));
				
				String balanceEnquiryHomepage= driver.findElement(By.xpath("//*[text()='Balance Enquiry Form']")).getText();
				
				String actualBalanceEnquiryHomepage = "Balance Enquiry Form";
				Assert.assertEquals(balanceEnquiryHomepage, actualBalanceEnquiryHomepage);
				
				System.out.println("You are at balance Enquiry page");
				
				da.getCustomizedStatement().click();
				
				da.getAccountNumber().sendKeys(AccountNumber);
				
				da.getSubmitButton().click();
				
String actualCustomizedyPopUp = "Account does not exist";

String customisedtext=driver.switchTo().alert().getText();
				
				Assert.assertEquals(actualCustomizedyPopUp, customisedtext);
				
				driver.switchTo().alert().accept();
				
				
				
				
				driver.close();
				
		
	}

	
}
