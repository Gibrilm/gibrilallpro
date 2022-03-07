package com.selenium.Myproject;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dynamic_Xpath_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		// Dynamic xpath
		List<WebElement> discountPrice = driver.findElements(
				By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		// empty array list
		List<Integer> priceList = new ArrayList<>();
		// Iterate
		// foreach --> for (WebElement price : discountPrice) //
		for (int i = 0; i < discountPrice.size(); i++) {
			String text = discountPrice.get(i).getText().replace("Rs. ", "");
			int values = Integer.parseInt(text);
			priceList.add(values);
			System.out.println(text);
		}
		System.out.println(priceList);
		int size = priceList.size();
		System.out.println("size :" +size);
		System.out.println("Maximum value:" + Collections.max(priceList));
		System.out.println("Minimun value :" + Collections.min(priceList));
	}
}
