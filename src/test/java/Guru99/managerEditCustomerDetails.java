package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.EditCustomer;

public class managerEditCustomerDetails extends base {
	
	@Test
	public void editCustomer() throws IOException {
		
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		
		EditCustomer ed = new EditCustomer(driver);
		
		ed.getEditCustomer().click();
		
		ed.getCustomerEdit().sendKeys("11123");
		
		ed.getSubmitButton().click();
		
		WebDriverWait wb = new WebDriverWait(driver, 5);
		wb.until(ExpectedConditions.elementToBeClickable(ed.getPinnumber()));
		ed.getPinnumber().click();
		ed.getPinnumber().clear();
		ed.getPinnumber().sendKeys("567843");
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		
		String actualText=ed.getverificationText().getText();
		String expectedText ="Customer details updated Successfully!!!";
		
		Assert.assertEquals(actualText, expectedText);
		
		driver.close();
		
	}

}
