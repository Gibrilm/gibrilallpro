package com.aspire;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aspire_demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demos.telerik.com/aspnet-ajax/grid/examples/data-binding/client-side/programmatic/defaultcs.aspx");
	
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Peacock");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.findElement(By.xpath("(//button[@type='submit'])[12]")).click();
	
	driver.findElement(By.xpath("//span[text()='EqualTo']")).click();
	
	List<WebElement> list1 = driver.findElements(By.xpath("//table[@class='rgMasterTable rgClipCells']/thead/tr"));
	for (int i = 0; i < list1.size(); i++) {
		String text1 = list1.get(i).getText();
		System.out.println(text1);
	}
	
	List<WebElement> list = driver.findElements(By.xpath("//table[@class='rgMasterTable rgClipCells']/tbody/tr"));
	int a =0;
	for (int i = 0; i < list.size(); i++) {
		String text = list.get(i).getText();
		
		System.out.println(text);
		a++;
		
	}System.out.println("Total number of items found : "+a);
	
	
	Thread.sleep(5000);
	driver.close();
}

}
