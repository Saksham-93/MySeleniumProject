package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteAccount {
	
	public WebDriver driver;
	
	By deleteAccountButton = By.xpath("//a[text()='Delete Account']");
	
	By accountNumber = By.xpath("//*[@name='accountno']");
	
	By submitButton = By.xpath("//*[@name='AccSubmit']");
	
	By miniStatementButton = By.xpath("//a[text()='Mini Statement']");
	
	By BalanceEnquiry = By.xpath("//a[text()='Balance Enquiry']");
	
	By CustomizedStaement = By.xpath("//a[text()='Customised Statement']");
	
	By fromDate = By.xpath("//*[@name='fdate']");
	
	By toDate = By.xpath("//*[@name='tdate']");
	
	By minimumValue = By.xpath("//*[@name='amountlowerlimit']");
	
	By noOfTransaction = By.xpath("//*[@name='numtransaction']");
	
	public DeleteAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	public WebElement getdeleteAccountButton() {
		
		return driver.findElement(deleteAccountButton);
	}
	public WebElement getAccountNumber() {
		return driver.findElement(accountNumber);
	}
	public WebElement getSubmitButton() {
		return driver.findElement(submitButton);
	}
	public WebElement getStatementButton() {
		return driver.findElement(miniStatementButton);
	}
	
	public WebElement getBalanceStatement() {
		return driver.findElement(BalanceEnquiry);
	}
	public WebElement getCustomizedStatement() {
		return driver.findElement(CustomizedStaement);
				
	}
	public WebElement getFromdate() {
		return driver.findElement(fromDate);
	}
	public WebElement getTodate() {
		return driver.findElement(toDate);
	}
	public WebElement getminimumTransaction() {
		return driver.findElement(minimumValue);
	}
	public WebElement getNoofTransaction() {
		return driver.findElement(noOfTransaction);
	}
	
	
	

}
