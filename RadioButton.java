package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton { 

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 
		 driver.manage().window().maximize();
		 
		Thread.sleep(2000);
		
		 //Click on create new account button
		 
	  driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='1']")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='-1']")).click();
	  

	} 

}
