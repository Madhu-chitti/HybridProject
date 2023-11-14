package testscripts.regression;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class SampleValidateLogin extends BaseTest {
	
	
	@Test
	public void validateLoginTest1() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz009");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
			
	}
	

}