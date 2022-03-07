package com.selenium.Myproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable_Class {
	static int indexOfMatches , indexOfWon, indexOfLost, indexOfPoints, indexOfNetrunrate;
	static String Team = "CSK";
	static String Team1 = "RR";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.google.com/search?q=ipl+points+table+2021&sxsrf=AOaemvL0U4fna9xF3X4kyqii_1QEdyyfSQ%3A1632369470443&ei=PvtLYbvAGrHF4-EP5tyOwAQ&oq=ipl+points+tabLE&gs_lcp=Cgdnd3Mtd2l6EAEYAjIKCAAQsQMQgwEQQzIKCAAQsQMQgwEQQzILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgQIABBDMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCxAxCDATILCAAQgAQQsQMQgwE6BwgAEEcQsAM6BwgAELADEEM6DQguEMgDELADEEMQkwI6CgguEMgDELADEEM6BQgAEMQCOgUIABCABDoGCAAQFhAeSgUIOBIBMUoECEEYAFCUxAFYuNgBYIXoAWgBcAJ4AYABuAGIAa0KkgEEMC4xMJgBAKABAcgBD8ABAQ&sclient=gws-wiz#sie=lg;/g/11fqtnjjg0;5;/m/03b_lm1;st;fp;1;;");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		List<WebElement> allheaders = driver.findElements(By.xpath("(//table[@class='Jzru1c'])[1]/tbody/tr/th"));
		for (int i = 0; i < allheaders.size(); i++) {
			String text = allheaders.get(i).getText();
			 //System.out.println(text);
			String header = text.replace("\n", " ");
			//System.out.println(header);
			if (header.equalsIgnoreCase("Matches")) {
				indexOfMatches = i;
				System.out.println("Total no of Matchs index value:"+indexOfMatches);
			}else if (header.equalsIgnoreCase("Won")) {
				indexOfWon = i;
				System.out.println("Total no of Matchs WON index value:"+indexOfWon);
			}else if (header.equalsIgnoreCase("Lost")) {
				indexOfLost = i;
				System.out.println("Total no of Matchs Loss index value:"+indexOfLost);
			}else if (header.equalsIgnoreCase("Points")) {
				indexOfPoints = i;
				System.out.println("Total point index value:"+indexOfPoints);
			}else if (header.equalsIgnoreCase("Net run rate")) {
				indexOfNetrunrate = i;
				System.out.println("Net run rate index value:"+indexOfNetrunrate);
			}
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		List<WebElement> allRows = driver.findElements(By.xpath("(//table[@class='Jzru1c'])[1]/tbody/tr"));
		for (int i = 0; i <allRows.size(); i++) {
			List<WebElement> allData = allRows.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < allData.size(); j++) {
			
				if (allData.get(j).getText().equalsIgnoreCase(Team)) {
					System.out.println(Team);
					System.out.println("Total Matchs Played:"+allData.get(indexOfMatches).getText());
					System.out.println("Total Matchs WON:"+allData.get(indexOfWon).getText());
					System.out.println("Total Matchs Loss:"+allData.get(indexOfLost).getText());
					System.out.println("Total Points :"+allData.get(indexOfPoints).getText());
					System.out.println("Net run rate :"+allData.get(indexOfNetrunrate).getText());
				}
				
			else if (allData.get(j).getText().equalsIgnoreCase(Team1)) {
					System.out.println(Team1);
					System.out.println("Total Matchs :"+allData.get(indexOfMatches).getText());
					System.out.println("Total Matchs WON:"+allData.get(indexOfWon).getText());
					System.out.println("Total Matchs Loss:"+allData.get(indexOfLost).getText());
					System.out.println("Total Points :"+allData.get(indexOfPoints).getText());
					System.out.println("Net run rate :"+allData.get(indexOfNetrunrate).getText());
				}
		}
		}
		
		
		
		
		
		
		
		
	}
}