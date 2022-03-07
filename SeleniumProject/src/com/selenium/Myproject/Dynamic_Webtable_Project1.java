package com.selenium.Myproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable_Project1 {
	static String Team = "Chennai Super Kings";
	static String Team1 = "Sunrisers Hyderabad";
	static int indexOfPld, indexOfWon, indexOfNetRR, indexOfPts;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.iplt20.com/points-table/men/2021");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		Thread.sleep(3000);
		List<WebElement> allHeaders = driver
				.findElements(By.xpath("//table[@class='standings-table standings-table--full ']/tbody/tr/th"));
		for (int i = 0; i < allHeaders.size(); i++) {
			String text = allHeaders.get(i).getText();
			String headers = text.replace("\n", " ");
			// System.out.println(headers);
			if (headers.equalsIgnoreCase("Pld")) {
				indexOfPld = i;
				System.out.println("Pld index value is:" + indexOfPld);
			} else if (headers.equalsIgnoreCase("Won")) {
				indexOfWon = i;
				System.out.println("Won index value is:" + indexOfWon);
			} else if (headers.equalsIgnoreCase("Net RR")) {
				indexOfNetRR = i;
				System.out.println("Net RR indexvalue is:" + indexOfNetRR);
			} else if (headers.equalsIgnoreCase("Pts")) {
				indexOfPts = i;
				System.out.println("Pts index value is :" + indexOfPts);
			}
		}
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allRows = driver
				.findElements(By.xpath("//table[@class='standings-table standings-table--full ']/tbody/tr"));
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allDatas = allRows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < allDatas.size(); j++) {
				if (allDatas.get(j).getText().equalsIgnoreCase(Team)) {
					System.out.println("\n"+Team);
					System.out.println("Total match played :" + allDatas.get(indexOfPld).getText());
					System.out.println("Total matchs Won:" + allDatas.get(indexOfWon).getText());
					System.out.println("Total points:" + allDatas.get(indexOfPts).getText());
					System.out.println("Net run rate:" + allDatas.get(indexOfNetRR).getText());
				} else if (allDatas.get(j).getText().equalsIgnoreCase(Team1)) {
					System.out.println("\n"+Team1);
					System.out.println("Total match played :" + allDatas.get(indexOfPld).getText());
					System.out.println("Total matchs Won:" + allDatas.get(indexOfWon).getText());
					System.out.println("Total points:" + allDatas.get(indexOfPts).getText());
					System.out.println("Net run rate:" + allDatas.get(indexOfNetRR).getText());
					System.exit(0);
				}

			}
		}

	}
}
