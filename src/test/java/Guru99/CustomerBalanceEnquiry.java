package Guru99;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObject.AddAccount;
import pageObject.BalanceEnquiry;

public class CustomerBalanceEnquiry extends base{
	
	@Test
	public void CustomerBalanceEnquiry() {
		
		try {
			CustomerLogin cl = new CustomerLogin();
			cl.customerLogin();
			BalanceEnquiry be = new BalanceEnquiry(driver);
			be.getBalanceEnquiryButton().click();
			Select AccountDropDown = new Select(be.getAccountNumber());
			AccountDropDown.selectByVisibleText("61782");
			
			be.getSubmitButton().click();
			
			System.out.println(be.getBalanceDetails().getText());
			
		}
		catch(Exception e) {
			
			//System.out.println(driver.switchTo().alert().getText());
			System.out.println(e);
			
		}
		finally {
			driver.close();
		}
	}

}
