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

public class managerConfirmDeleteAccount extends base {
	
	@Test
	
	public void confirmDeleteAccount() throws IOException {
		managerLogin ml = new managerLogin();
		ml.managerLogin();
        managerAddAccount mac = new managerAddAccount();
        mac.addAccount();
		
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
		
		driver.close();
		
		
		
		
		
	}

}
