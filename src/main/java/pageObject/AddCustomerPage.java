package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomerPage {
	
	public WebDriver driver;
	
	By customerName = By.xpath("//*[@class='layout']/tbody//tbody/tr[4]/td[2]/input");
	
	By dateOfBirth=By.xpath("//*[@class='layout']/tbody//tbody/tr[6]/td[2]/input");
	
	By address =By.xpath("//*[@class='layout']/tbody//tbody/tr[7]/td[2]/textarea");
	
	By city =By.xpath("//*[@class='layout']/tbody//tbody/tr[8]/td[2]/input");
	
	By state = By.xpath("//*[@class='layout']/tbody//tbody/tr[9]/td[2]/input");
	
	By pincode = By.xpath("//*[@class='layout']/tbody//tbody/tr[10]/td[2]/input");
	
	By mobileNumber = By.xpath("//*[@class='layout']/tbody//tbody/tr[11]/td[2]/input");
	
	By email =By.xpath("//*[@class='layout']/tbody//tbody/tr[12]/td[2]/input");
	
	By password= By.xpath("//*[@class='layout']/tbody//tbody/tr[13]/td[2]/input");
	
	By submit = By.xpath("//*[@value='Submit']");
	
	By customeraddedSuccessfully = By.xpath("//*[@class='heading3']");
	
	
	public AddCustomerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getCustomerName() {
		
		return driver.findElement(customerName);
	}
	
	public WebElement getdateOfBirth() {
		return driver.findElement(dateOfBirth);
	}
	
	public WebElement getaddress() {
		return driver.findElement(address);
	}
	public WebElement getcity() {
		return driver.findElement(city);
	}
	public WebElement getstate() {
		return driver.findElement(state);
	}
	public WebElement getpincode() {
		return driver.findElement(pincode);
	}
	public WebElement getMobileNumber() {
		return driver.findElement(mobileNumber);
	}
	public WebElement getemail() {
		return driver.findElement(email);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getsubmitbutton() {
		return driver.findElement(submit);
	}
	
	public WebElement verificationText() {
		return driver.findElement(customeraddedSuccessfully);
	}
}
