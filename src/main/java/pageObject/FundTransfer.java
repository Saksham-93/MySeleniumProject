package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FundTransfer {
	
	public WebDriver driver;
	
	By fundTransfer = By.xpath("//a[text()='Fund Transfer']");
	
	By payersaccountNumber = By.xpath("//*[@name='payersaccount']");
	
	By payeeaccountNumber = By.xpath("//*[@name='payeeaccount']");
	
	By amount = By.xpath("//*[@name='ammount']");
	
	By description = By.xpath("//*[@name='desc']");
	
	By submitButton = By.xpath("//*[@name='AccSubmit']");
	
	public FundTransfer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getfundTransfer() {
		return driver.findElement(fundTransfer);
	}
	public WebElement getpayersaccountNumber() {
		return driver.findElement(payersaccountNumber);
	}
	public WebElement getpayeeaccountNumber() {
		return driver.findElement(payeeaccountNumber);
	}
	public WebElement getamount() {
		return driver.findElement(amount);
	}
	public WebElement getdescription() {
		return driver.findElement(description);
	}
	public WebElement getsubmitButton() {
		return driver.findElement(submitButton);
	}

}
