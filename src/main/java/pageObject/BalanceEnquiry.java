package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalanceEnquiry {
	
	public WebDriver driver;
	
	By BalanceEnquiry = By.xpath("//*[text()='Balance Enquiry']");
	
	By BalanceDetails = By.xpath("//*[@id='balenquiry']/tbody");
	
	By AccountNumber = By.xpath("//*[@name='accountno']");
	
	By SubmitButton = By.xpath("//*[@name='AccSubmit']");
	
	public BalanceEnquiry(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	public WebElement getBalanceEnquiryButton() {
		
		return driver.findElement(BalanceEnquiry);
	}
	public WebElement getBalanceDetails() {
		return driver.findElement(BalanceDetails);
	}
	public WebElement getAccountNumber() {
		return driver.findElement(AccountNumber);
	}
	public WebElement getSubmitButton() {
		return driver.findElement(SubmitButton);
	}
	
	
	

}
