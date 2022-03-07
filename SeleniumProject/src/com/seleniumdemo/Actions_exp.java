package com.seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_exp {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement mobiletab = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
	
	
	//actions is Mouse based
	Actions act = new Actions(driver);
	act.contextClick(mobiletab).build().perform();
	Thread.sleep(2000);
	// Robat is keyboard based
	Robot r = new Robot();
	Thread.sleep(2000);
	for (int i = 0; i < 7; i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_TAB);
	WebElement bestseller = driver.findElement(By.xpath("//a[normalize-space()='Best Sellers']"));
	
	
	
	
	
	
	
	

}
}
