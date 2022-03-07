package com.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_Xpath {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Gibril.M@gmail.com");
	
	WebElement pass = driver.findElement(By.name("pass"));
	pass.sendKeys("123123asd");
	
//	WebElement Loginbtn = driver.findElement(By.name("login"));
//	Loginbtn.click();
	
//	driver.close();
	
	WebElement createbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	createbtn.click();		
	
	Thread.sleep(2000);
	
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("Gibril");
	
//	WebElement firstname1 = driver.findElement(By.name("firstname"));
//	firstname1.sendKeys("Kadher");
	
	WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
	
	surname.sendKeys("Mohaideen");
	
	WebElement number = driver.findElement(By.xpath("(//input[contains(@name,'reg_ema')])[1]"));
	number.sendKeys("9988998899");
// not working	
//	WebElement text = driver.findElement(By.xpath("//font[contains(text(),'Facebook helps to interact with)]"));
//	String fbtxt = text.getText();
//	System.out.println(fbtxt);

	
// Dropdown

	WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s1 = new Select(date);
	s1.selectByValue("18");
	
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s2 =new Select(month);
	s2.selectByValue("4");
	
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select s3 = new Select(year);
	s3.selectByVisibleText("2020");

	WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	sex.click();
	
	WebElement sex1 = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
	sex1.click();
	
	
	
}
}
