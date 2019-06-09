package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	
	By username = By.xpath("//*[@name='uid']");
	
	By password = By.xpath("//*[@name='password']");
	
	By loginButton =By.xpath("//*[@name='btnLogin']");
	
	By logoutButton = By.xpath("//a[text()='Log out']");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getUsername() {
		
		return driver.findElement(username);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(loginButton);
	}
	public WebElement getLogout() {
		return driver.findElement(logoutButton);
	}
	
	

}
