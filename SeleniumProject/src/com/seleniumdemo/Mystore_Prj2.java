package com.seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.openqa.selenium.support.ui.Select;

public class Mystore_Prj2 {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Gibril.kadher@gmail.com");
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("G777#bl");
	driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
	driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[4]")).click();
	driver.findElement(By.xpath("//img[@title='Printed Dress']")).click();
	driver.switchTo().frame(0);
	WebElement inc = driver.findElement(By.xpath("//i[@class='icon-plus']"));
	for (int i = 1; i < 10; i++) {
		inc.click();
	}
	WebElement sizedropdown = driver.findElement(By.xpath("//select[@name='group_1']"));
	Select size = new Select(sizedropdown);
	size.selectByValue("2");
	driver.findElement(By.xpath("//a[@name='Pink']")).click();
	driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
	
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement tx = driver.findElement(By.xpath("(//div[@class='clearfix'])[1]"));
//	WebElement tx = driver.findElement(By.xpath("//h2[normalize-space()='Product successfully added to your shopping cart']"));
//	js.executeScript("arguments[0].scrollIntoView();", tx);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\Screenshots1\\Scshot.png");
	FileUtils.copyFile(src, dest);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();	
	driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]")).click();
	driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]")).click();
	driver.findElement(By.id("cgv")).click();
	driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]")).click();
	driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement text = driver.findElement(By.xpath("//h1[@class='page-heading']"));
	js.executeScript("arguments[0].scrollIntoView();", text);
	TakesScreenshot ts1 = (TakesScreenshot)driver;
	File src1 = ts1.getScreenshotAs(OutputType.FILE);
	File dest1 = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\Screenshots1\\Scshot1.png");
	FileUtils.copyFile(src1, dest1);
	
	driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
	WebElement tx1 = driver.findElement(By.xpath("//span[text()='Order confirmation']"));
	js.executeScript("arguments[0].scrollIntoView();", tx1);
	TakesScreenshot ts2 = (TakesScreenshot)driver;
	File src2= ts2.getScreenshotAs(OutputType.FILE);
	File dest2 = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\Screenshots1\\Scshot2.png");
	FileUtils.copyFile(src2, dest2);	

	driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
	
	Actions mov = new Actions(driver);
	WebElement move = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	mov.moveToElement(move).build().perform();
	driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//img[@title='Printed Chiffon Dress'])[2]")).click();
	
	driver.switchTo().frame(0);
	WebElement incc = driver.findElement(By.xpath("//i[@class='icon-plus']"));
	for (int j = 1; j < 5; j++) {
		incc.click();
	}
	WebElement sizedropdown1 = driver.findElement(By.id("group_1"));
	Select sizz = new Select(sizedropdown1);
	sizz.selectByValue("3");
	driver.findElement(By.xpath("//a[@name='Green']")).click();
	driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	TakesScreenshot ts3 = (TakesScreenshot)driver;
	File src3= ts3.getScreenshotAs(OutputType.FILE);
	File dest3 = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\Screenshots1\\Scshot3.png");
	FileUtils.copyFile(src3, dest3);
	
	driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();	
	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]")).click();
	driver.findElement(By.xpath("//a[@class='cheque']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement order = driver.findElement(By.xpath("//h1[@class='page-heading']"));
	js.executeScript("arguments[0].scrollIntoView();", order);
	TakesScreenshot ts4 = (TakesScreenshot)driver;
	File src4= ts4.getScreenshotAs(OutputType.FILE);
	File dest4 = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\Screenshots1\\Scshot4.png");
	FileUtils.copyFile(src4, dest4);
	driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
	WebElement confirmation = driver.findElement(By.xpath("//h1[@class='page-heading']"));
	js.executeScript("arguments[0].scrollIntoView();", confirmation);
	TakesScreenshot ts5 = (TakesScreenshot)driver;
	File src5= ts5.getScreenshotAs(OutputType.FILE);
	File dest5 = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\Screenshots1\\Scshot5.png");
	FileUtils.copyFile(src5, dest5);
}
}
