package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class managerDeposit extends base {
	
	@Test
	public void depostitFunctionality() throws IOException {
		
		managerLogin ml = new managerLogin();
		ml.managerLogin();
		
		managerAddAccount ma = new managerAddAccount();
		ma.addAccount();
		
		String AccountNumber = driver.findElement(By.xpath("//*[@id='account']/tbody/tr[4]/td[2]")).getText();
		
	}

}
