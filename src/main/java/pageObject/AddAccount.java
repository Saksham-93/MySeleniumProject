package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAccount {
	
	public WebDriver driver;
	
	By newAccountButton = By.xpath("//a[text()='New Account']");
	
	By custId = By.xpath("//*[@name='cusid']");
	
	By accountType = By.xpath("//*[@name='selaccount']");
	
	By initialDeposit = By.xpath("//*[@name='inideposit']");
	
	By submit = By.xpath("//*[@name='button2']");
	
	public AddAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getNewAccountButton() {
		
		return driver.findElement(newAccountButton);
	}
	
	public WebElement getCustid() {
		return driver.findElement(custId);
	}
    public WebElement getAccountType() {
    	return driver.findElement(accountType);
    }
    public WebElement getInitialDeposit() {
    	return driver.findElement(initialDeposit);
    }
    public WebElement getsubmitButton() {
    	return driver.findElement(submit);
    }
}
