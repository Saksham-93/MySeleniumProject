package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.AddCustomerPage;
import pageObject.LoginPage;
import pageObject.managerHomePage;

public class managerLogin extends base {


	//	public WebDriver driver;
//	
//	
//	@BeforeTest
//	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "D:\\My Folder\\chromedriver.exe");
	
//	}
	
	@Test
	public void managerLogin() throws IOException {
		driver = initializedriver();
		
		
		
		
		
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.getUsername().sendKeys("mngr196162");
		lp.getPassword().sendKeys("UqYhyge");
		lp.getLogin().click();
		
		
		
		String getTitle=driver.getTitle();
		
		String excpectedTitle="Guru99 Bank Manager HomePage";
		
		Assert.assertEquals(getTitle, excpectedTitle);
		
		
		
		//driver.close();
		
		//driver.close();
		
		
		
	}
	
	
	
	
	
	

}
