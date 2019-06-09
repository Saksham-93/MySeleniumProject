package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class managerHomePage {
	
	public WebDriver driver;
	
	By NewCustomer = By.xpath("//a[text()='New Customer']");
	
	public managerHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	public WebElement getNewCustomer() {
		
		return driver.findElement(NewCustomer);
	}

}
