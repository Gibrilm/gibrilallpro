package com.seleniumdemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	Thread.sleep(2000);
	
	// single select
	WebElement selday = driver.findElement(By.xpath("//select[@class='form-control']"));
	Select s1 = new Select(selday);
	s1.selectByValue("Sunday");
	boolean multiple2 = s1.isMultiple();
	System.out.println(multiple2);
	System.out.println("<<<<<<>>>>>>>>>");
	//is Multiple select
	WebElement state = driver.findElement(By.xpath("//select[@name='States']"));
	Select s2= new Select(state);
	boolean multiple = s2.isMultiple();
	System.out.println(multiple);
	
	s2.selectByValue("Florida");
	s2.selectByValue("Ohio");
	s2.selectByValue("Texas");
	s2.deselectAll();
	s2.selectByValue("New York");
	
//	Thread.sleep(10000);
//	driver.close();
	
	// getOptions()---> it will return all options in dropdown
	
	List<WebElement> options = s2.getOptions();
	Iterator<WebElement> iterator = options.iterator();
	
	// Iterator
	while (iterator.hasNext()) {
		WebElement next = iterator.next();
//		String all = next.getText();
//		System.out.println(all);
		System.out.println(next.getText());
	}
		
	System.out.println("-----------------------------");
	
	List<WebElement> allSelectedOptions = s2.getAllSelectedOptions();
	
	for (WebElement selected : allSelectedOptions) {
		System.out.println(selected.getText());
	}
	
	s2.deselectByValue("Ohio");
	
	
	
	
	
	
	}




}

