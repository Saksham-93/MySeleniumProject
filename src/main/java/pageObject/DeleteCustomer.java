package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteCustomer {
	
	public WebDriver driver;
	
	By DeleteCustomer = By.xpath("//a[text()='Delete Customer']");
	
	By CustomerId = By.xpath("//*[@name='cusid']");
	
	By SubmitButton = By.xpath("//*[@name='AccSubmit']");
	
	By EditCustomer = By.xpath("//a[text()='Edit Customer']");
	
	public DeleteCustomer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getDeleteCustomer() {
		return driver.findElement(DeleteCustomer);
	}
	
	public WebElement getCustomerId() {
		return driver.findElement(CustomerId);
	}
	public WebElement getSubmitButton() {
		return driver.findElement(SubmitButton);
	}
	
	public WebElement getEditCustomer() {
		return driver.findElement(EditCustomer);
	}

}
