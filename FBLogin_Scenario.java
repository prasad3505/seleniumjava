package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin_Scenario {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 
		 driver.manage().window().maximize();
		
		 Thread.sleep(2000);         //used when internet speed is slow wait 2 secnds
		 
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz@123");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 
	}

}
