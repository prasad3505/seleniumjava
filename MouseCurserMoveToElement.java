package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseCurserMoveToElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("https://sellglobal.ebay.in/seller-center/");
		Thread.sleep(2000);
		
		WebElement PF = driver.findElement(By.linkText("Payments & Fees"));
		
		//Move to element payment and fees
		Actions act = new Actions(driver);
		act.moveToElement(PF).perform();
		
        WebElement Shipping = driver.findElement(By.linkText("Shipping"));
		
		//Move to element shipping
		Actions act1 = new Actions(driver);
		act1.moveToElement(Shipping).perform();
			
	}

}
