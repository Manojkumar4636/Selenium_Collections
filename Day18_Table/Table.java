package com.learn.selenium.day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/table.html"
	TestCase3: Get the count of number of columns
	TestCase4: Get the count of number of rows
	TestCase5: Get the progress value of 'Learn to interact with Elements'
	TestCase6: Check the vital task for the least completed progress
	TestCase7: Quit the project.
	*/
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/table.html");
		
		//Get the count of number of columns
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnCount = column.size();
		System.out.println("Number of columns: "+columnCount);
		
		//Get the count of number of rows
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowCount = row.size();
		System.out.println("No of rows: "+rowCount);
		
		//Get the progress value of 'Learn to interact with Elements'
		
		//Raw Xpath
		/*WebElement percentage = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[3]/td[2]"));
		String getPercentage = percentage.getText();
		System.out.println("Percentage is: "+getPercentage);*/
		
		//Dynamic Xpath
		//td[normalize-space()='Learn to interact with Elements']//following::td[1]	
		WebElement percentage = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String getPercentage = percentage.getText();
		System.out.println("Percentage is: "+getPercentage);
		
                //Check the vital task for the least completed progress
		WebElement check = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/input"));
		check.click();
		
		//Quit the project
		driver.quit();	
	}
}
