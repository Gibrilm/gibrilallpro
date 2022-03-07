package com.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mystore_Prj1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Gibril.kadher@gmail.com");
	driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']")).click();
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Gibril");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Mohaideen");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("G777#bl");
	WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
	Select day = new Select(days);
	day.selectByValue("6");
	WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
	Select mon = new Select(months);
	mon.selectByValue("11");
	WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
	Select yr = new Select(years);
	yr.selectByValue("1993");
	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("777,9th main road, flori - 37");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Flori");
	WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
	Select st = new Select(state);
	st.selectByVisibleText("Florida");
	
	driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("20183");
	WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
	Select con = new Select(country);
	con.selectByVisibleText("United States");
	
	driver.findElement(By.id("phone_mobile")).sendKeys("9715971289");
	WebElement addr = driver.findElement(By.id("alias"));
	addr.clear();
	addr.sendKeys("777,9th main road, flori-37");
	driver.findElement(By.xpath("//span[text()='Register']")).click();
	
	
	
	//Thread.sleep(10000);driver.close();
	
	
	
}
}
