package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class CustomerLogin extends base{
	
	@Test
	public void customerLogin() throws IOException {
		
		driver = initializedriver();
		
       driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);
		lp.getUsername().sendKeys("83229");
		lp.getPassword().sendKeys("saksham@93");
		lp.getLogin().click();
		
		String CustomerPageText=driver.findElement(By.xpath("//*[@class='heading3']")).getText();
		
		String ExpectedText="Welcome To Customer's Page of Guru99 Bank";
		
		Assert.assertEquals(CustomerPageText, ExpectedText);
		
	}
	
	

}
