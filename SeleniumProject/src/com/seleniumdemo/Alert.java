package com.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

	driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
	Thread.sleep(2000);
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.accept();
	
	driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
	org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
	Thread.sleep(2000);
	String text = alert2.getText();
	System.out.println(text);
	alert2.sendKeys("Gibril");
	alert2.accept();


}
}
