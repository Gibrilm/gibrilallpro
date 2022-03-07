package com.selenium.Myproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_HRM_Project {
	static int indexOfUsername,indexOfUserRole,indexOfEmployeeName,indexOfStatus;
	static String name= "Gimbaarravs";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement login = driver
				.findElement(By.xpath("//span[contains(text(),'( Username : Admin | Password : admin123 )')]"));
		String text = login.getText();
		System.out.println(text);
		String username = text.substring(13, 18);
		System.out.println(username);
		String password = text.substring(32, 40);
		System.out.println(password);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		WebElement UserRole = driver.findElement(By.xpath("//select[@id='systemUser_userType']"));
	//	UserRole.sendKeys("A");
		Select s = new Select(UserRole);
		s.selectByValue("1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("G");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> empname = driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));
		for (WebElement webElement : empname) {
			if (webElement.getText().equals("Garry White")) {
				webElement.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("Gimbaarravs");
		WebElement status = driver.findElement(By.xpath("//select[@id='systemUser_status']"));
		Select s1 = new Select(status);
		s1.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Gibril@711");
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("Gibril@711");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("Gimbaarravs");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.findElement(By.xpath("//input[@id='resetBtn']")).click();
		
		List<WebElement> allHeader = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));
		for (int i = 0; i < allHeader.size(); i++) {
			String head = allHeader.get(i).getText();
	//		System.out.println(head);
			String headers = head.replace("\n", " ");
	//		System.out.println(headers);
		
		if (headers.equalsIgnoreCase("Username")) {
			indexOfUsername =i;
			System.out.println("Index value of Username:"+indexOfUsername);
		}else if (headers.equalsIgnoreCase("User Role")) {
			indexOfUserRole =i;
			System.out.println("Index value of User Role:"+indexOfUserRole);
		}else if (headers.equalsIgnoreCase("Employee Name")) {
			indexOfEmployeeName =i;
			System.out.println("Index value of Employee Name:"+indexOfEmployeeName);
		}else if (headers.equalsIgnoreCase("Status")) {
			indexOfStatus =i;
			System.out.println("Index value of Status:"+indexOfStatus);
		}
	}		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < allRows.size(); i++) {
			//System.out.println("print");
			List<WebElement> allDatas = allRows.get(i).findElements(By.tagName("td"));
			//System.out.println("print1");
			for (int j = 0; j < allDatas.size(); j++) {
			if(allDatas.get(j).getText().equalsIgnoreCase(name)) {
				System.out.println("Orange HR Details");
				System.out.println("Username : "+allDatas.get(indexOfUsername).getText());
				System.out.println("User Role :"+allDatas.get(indexOfUserRole).getText());
				System.out.println("Emp name:"+allDatas.get(indexOfEmployeeName).getText());
				System.out.println("Status :"+allDatas.get(indexOfStatus).getText());
		}
			}}}}
