package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObject.DeleteAccount;

public class CustomerMiniStatement extends base {
	
	@Test
	public void CustomerMiniStatement() throws IOException {
		
		try {
		
		CustomerLogin cl = new CustomerLogin();
		cl.customerLogin();
		
		DeleteAccount da = new DeleteAccount(driver);
		da.getStatementButton().click();
		da.getAccountNumber().sendKeys("61782");
		da.getSubmitButton().click();
		
		System.out.println(driver.findElement(By.xpath("(//table[@align='center'])[2]/tbody")).getText());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			driver.close();
		}
	}

}
