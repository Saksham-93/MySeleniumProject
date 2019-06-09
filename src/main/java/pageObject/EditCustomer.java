package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditCustomer {
	
	public WebDriver driver;
	
	By EditCustomer = By.xpath("//a[text()='Edit Customer']");
	
	By CustomerId = By.xpath("//*[@name='cusid']");
	
	By SubmitButton = By.xpath("//*[@name='AccSubmit']");
	
	By EditPinnumber = By.xpath("//*[@name='pinno']");
	
	By verificationText = By.xpath("//*[@class='heading3']");
	
	public EditCustomer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getEditCustomer() {
		return driver.findElement(EditCustomer);
	}
	public WebElement getCustomerEdit() {
		return driver.findElement(CustomerId);
	}
	public WebElement getSubmitButton() {
		return driver.findElement(SubmitButton);
	}
	public WebElement getPinnumber() {
		return driver.findElement(EditPinnumber);
	}
	
	public WebElement getverificationText() {
		return driver.findElement(verificationText);
	}

}
