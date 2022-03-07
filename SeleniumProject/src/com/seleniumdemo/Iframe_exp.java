package com.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_exp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
	driver.findElement(By.id("i-icon-profile")).click();
	Thread.sleep(2000);
	WebElement signin = driver.findElement(By.id("signInLink"));
	signin.click();
	
	int count = driver.findElements(By.tagName("iframe")).size();
	System.out.println("size of the frame:" +count);
	WebElement frm = driver.findElement(By.xpath("(//iframe[@class='modalIframe'])[2]"));
	driver.switchTo().frame(frm);
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8765432100");
	
	
	
	
}
}
