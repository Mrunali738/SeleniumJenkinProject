package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoqa_Register {
	
	@Test
	 public void tc_01() {
		 
		 System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/register");
		 driver.findElement(By.id("firstname")).sendKeys("Hello");
		 driver.findElement(By.id("lastname")).sendKeys("Testing");
		 driver.findElement(By.id("userName")).sendKeys("hello@123");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
		 //driver.findElement(By.id("register")).click();
		 driver.close();
		
	 }

}
