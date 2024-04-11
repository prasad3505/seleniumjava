package javapackage;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://demoqa.com/browser-windows");
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Thread.sleep(2000);
		 Set<String> allWindow = driver.getWindowHandles();
		 System.out.println(allWindow);
		
		 Iterator<String> abc = allWindow.iterator();
		 String win1 = abc.next();
		 String win2 = abc.next();
		 
		 //Print the title of parent window
		 driver.switchTo().window(win1);
		 System.out.println("Parent window ID is : " + win1);
		 
		 //Print the title child window
		 driver.switchTo().window(win2);
		 System.out.println("Child window ID is : " + win2);
		 
		 driver.close();      // close only child window
		 driver.quit();       // close both child & parent window
		 
	}

}
