package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Withdrawl {
	
	public WebDriver driver;
	
	By WithdrawlButton = By.xpath("//*[text()='Withdrawal']");
	
	By AccountNumber = By.xpath("//*[@name='accountno']");
	
	By Ammount = By.xpath("//*[@name='ammount']");
	
	By Description = By.xpath("//*[@name='desc']");
	
	By SubmitButton = By.xpath("//*[@name='AccSubmit']");
	
	By WithdrawalDetails = By.xpath("//*[@id='withdraw']/tbody");
	
	By MiniStatementDetails = By.xpath("//*[@id='ministmt']/tbody");
	
	public Withdrawl(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getWithdrawalButton() {
		return driver.findElement(WithdrawlButton);
	}
	public WebElement getAccountNumber() {
		return driver.findElement(AccountNumber);
	}
	public WebElement getAmount() {
		return driver.findElement(Ammount);
	}
	public WebElement getDescription() {
		return driver.findElement(Description);
				
	}
	public WebElement getSubmitButton() {
		return driver.findElement(SubmitButton);
	}
	
	public WebElement getWithdrawalDetails() {
		return driver.findElement(WithdrawalDetails);
	}
	public WebElement getMinistatementDetails() {
		return driver.findElement(MiniStatementDetails);
	}
	
	

}
