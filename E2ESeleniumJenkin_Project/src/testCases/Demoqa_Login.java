package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoqa_Login {
	
	@Test
	 public void tc_01() {
		 
		 System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/login");
		 driver.findElement(By.id("userName")).sendKeys("Hello");
		 driver.findElement(By.id("password")).sendKeys("hello123");
		 //driver.findElement(By.id("login")).click();
		 driver.close();
		
	 }

}
