package com.seleniumdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowschk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		Thread.sleep(2000);

		
		Set<String> windowHandle = driver.getWindowHandles();
		Iterator<String> ite = windowHandle.iterator();
		String first = ite.next();
		String Second = ite.next();
		driver.switchTo().window(Second);
		WebElement pnttext = driver.findElement(By.xpath("//div[normalize-space()='New Window']"));
		String text = pnttext.getText();
		System.out.println(text);

		Thread.sleep(2000);
		
		driver.switchTo().window(first);
		WebElement pttxt2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		String text2 = pttxt2.getText();
		System.out.println(text2);
	}
}
