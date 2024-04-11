package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownList { 

	public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //Create a list of all element in dropdown
		 
		 List<WebElement> birthName = driver.findElements(By.xpath("//select[@id='month']/option"));
		 
		 birthName.get(11).click();
		
		 
		  

	}

}
