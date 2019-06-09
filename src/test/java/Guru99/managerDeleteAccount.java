package Guru99;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.DeleteAccount;
import pageObject.LoginPage;

public class managerDeleteAccount extends base {
	
	@Test
	public void deleteAccount() throws IOException {
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		
		DeleteAccount da = new DeleteAccount(driver);
		
		da.getdeleteAccountButton().click();
		
		da.getAccountNumber().sendKeys("2345");
		
		da.getSubmitButton().click();
		
		String popUpText=driver.switchTo().alert().getText();
		
		String ActualPopupText = "Do you really want to delete this Account?";
		
		Assert.assertEquals(popUpText, ActualPopupText);
		
		driver.switchTo().alert().dismiss();
		driver.close();
	}

}
