package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(2000);
		
	    // find source to target element
		WebElement SourceElement =  driver.findElement(By.id("box6"));  //Rome
		WebElement TargetElement =  driver.findElement(By.id("box106")); //italy
		
		Thread.sleep(2000);
		
		//Drag & Drop
		Actions act = new Actions(driver);
		act.dragAndDrop(SourceElement, TargetElement).perform();
	
	}

}
