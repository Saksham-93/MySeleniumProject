package Guru99;

import org.testng.annotations.Test;

import pageObject.LoginPage;

public class managerLogout extends base {
	
	@Test
	public void managerLogout() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.getLogout().click();
		
		driver.switchTo().alert().accept();
	}

}
