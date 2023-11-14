package testscripts.regression;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLogin extends BaseTest {
	
	
	@Test
	public void validateLoginTest1() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz009");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
			
	}
	
	@Test
	public void validateLoginTest2() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz009");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
			
	}
	
	@Test
	public void validateLoginTest3() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz1245");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
			
	}
	
	@Test
	public void validateLoginTest4() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz1245");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
			
	}

}