package com.adactin_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adaction_Project_Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/index.php");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Gibofariz");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("G777#bl");
	WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
	login.click();
	
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	Select s = new Select(location);
	s.selectByValue("Paris");
	
	WebElement holets = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select h = new Select(holets);
	h.selectByValue("Hotel Cornice");
	
	WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select rt=new Select(roomType);
	rt.selectByValue("Super Deluxe");
	
	WebElement roomNo = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select rn= new Select(roomNo);
	rn.selectByValue("2");
	
	WebElement checkInDate = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
	checkInDate.clear();
	checkInDate.sendKeys("21/11/2021");
	
	WebElement checkOutDate = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
	checkOutDate.clear();
	checkOutDate.sendKeys("23/11/2021");
	
	WebElement adultsperroom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
	Select apr= new Select(adultsperroom);
	apr.selectByValue("3");
	
	WebElement childperroom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
	Select cpr = new Select(childperroom);
	cpr.selectByValue("1");
	
	WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
	submit.click();
	
	WebElement radiobtn = driver.findElement(By.xpath("//input[@type='radio']"));
	radiobtn.click();
	
	WebElement continuebtn = driver.findElement(By.xpath("//input[@name='continue']"));
	continuebtn.click();
	
	WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	firstname.sendKeys("Gibril");
	
	WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	lastname.sendKeys("Fariz");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	address.sendKeys("No.215,9th main Road, newyark");
	
	WebElement cardnumber = driver.findElement(By.xpath("//input[@name='cc_num']"));
	cardnumber.sendKeys("9876543210987654");
	
	WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select ct = new Select(cardtype);
	ct.selectByValue("MAST");
	
	WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select mon=new Select(month);
	mon.selectByValue("11");
	
	WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select yr = new Select(year);
	yr.selectByValue("2022");
	
	WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv.sendKeys("000");
	
	WebElement bookbtn = driver.findElement(By.xpath("//input[@name='book_now']"));
	bookbtn.click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement orderdetails = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
	orderdetails.click();
}
}
