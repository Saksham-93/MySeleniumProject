package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Deposit {
	
	public WebDriver driver;
	
	By AccountNumber = By.xpath("//*[@name='accountno']");
	
	By Amount = By.xpath("//*[@name='ammount']");
	
	By Description = By.xpath("//*[@name='desc']");
	
	By Submit = By.xpath("//*[@name='AccSubmit']");
	
	
	public WebElement getAccountNumber() {
		return driver.findElement(AccountNumber);
	}
	
	

}
