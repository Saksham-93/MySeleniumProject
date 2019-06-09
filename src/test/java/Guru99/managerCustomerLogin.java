package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageObject.LoginPage;

public class managerCustomerLogin extends base {
	
	@Test
	public void managerCustomerLogin() throws IOException, InterruptedException {
		
		try {
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		
		managerAddCustomer mac = new managerAddCustomer();
		mac.managerAddCustomer();
		
		String CustomerId = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]")).getText();
		
		managerLogout mlog = new managerLogout();
		mlog.managerLogout();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.getUsername().sendKeys(CustomerId);
		lp.getPassword().sendKeys("roman@93");
		lp.getLogin().click();
		
		WebDriverWait wd = new WebDriverWait(driver, 5);
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='heading3']")));
		
		String CustomerPageText = driver.findElement(By.xpath("//*[@class='heading3']")).getText();
		String ExpectedText = "Welcome To Customer's Page of Guru99 Bank";
		
		Assert.assertEquals(CustomerPageText, ExpectedText);
		}
		catch(Exception message) {
			System.out.println(message);
		}
		finally {
			driver.close();
		}
		
		
		
	}

}
