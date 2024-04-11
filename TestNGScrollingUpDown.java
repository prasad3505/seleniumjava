package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGScrollingUpDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demoqa.com/alerts");
		 
		 driver.manage().window().maximize();
		 
		 //Syntax to scroll
		 
		 JavascriptExecutor js = (JavascriptExecutor)  driver;
		 
		 //1st Way of scrolling : using pixels
		 
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,350)");     //scrollDown
		 
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,-250)");     //scrollUp
		 
		 
		 //2nd Way : Till we found web element(recommended to use)
		 Thread.sleep(2000);
		 WebElement demo = driver.findElement(By.xpath("//button[@id='promtButton']"));
		 js.executeScript("argument[0].scrollIntoView();", demo);
		 
		 
		 //3rd way : scroll to the bottom 
		 
		 Thread.sleep(2000);
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  
		 
	}

}
