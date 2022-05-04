package com.learn.selenium.day19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Calendar.html"
	TestCase3: Select 10th day of following month
	TestCase4: Quit the project
	 */	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Calendar.html");

		//Select 10th day of following month
		WebElement date = driver.findElement(By.id("datepicker"));
		//date.sendKeys("03/10/2022"+Keys.ENTER);
		date.click();

		WebElement clickNext = driver.findElement(By.xpath("//a[@title=\"Next\"]"));
		clickNext.click();

		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		click.click();

		//Quit the project
		driver.quit();
	}
}
