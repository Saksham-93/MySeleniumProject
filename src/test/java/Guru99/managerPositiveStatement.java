package Guru99;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.DeleteAccount;
import pageObject.LoginPage;

public class managerPositiveStatement extends base{
	
	
	
	@Test
	public void statementFunctionality() throws IOException {
		try {
			managerLogin ml = new managerLogin();
			ml.managerLogin();
				DeleteAccount da = new DeleteAccount(driver);
				
				da.getCustomizedStatement().click();
				
				da.getAccountNumber().sendKeys("61035");
				
				Calendar cal = Calendar.getInstance();
				   DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				   String today_date=dateFormat.format(cal.getTime());
				   //System.out.println(today_date);

				   cal.add(Calendar.DATE, -1);
				   String yesterday_date=dateFormat.format(cal.getTime()); 
				   //System.out.println(yesterday_date);
				   
				da.getFromdate().sendKeys(yesterday_date);
				da.getTodate().sendKeys(today_date);
				da.getminimumTransaction().sendKeys("100");
				da.getNoofTransaction().sendKeys("3");
				da.getSubmitButton().click();
				
				System.out.println(driver.findElement(By.xpath("//*[@id='customstmt']/tbody")).getText());
				
				da.getStatementButton().click();;
				
				da.getAccountNumber().sendKeys("61035");
				da.getSubmitButton().click();
				
				System.out.println(driver.findElement(By.xpath("//*[@id='ministmt']/tbody")).getText());
				
			
		}
		catch(Exception e) {
			
			System.out.println(driver.switchTo().alert().getText());
			
		}
		finally {
			driver.close();
			
		}
	
		
		
			
			
			
		
	}

}
