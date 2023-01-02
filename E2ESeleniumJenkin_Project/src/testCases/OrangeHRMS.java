package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMS {
	
 @Test
 public void tc_01() {
	 
	 System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.close();
	
 }
	
	
 }
