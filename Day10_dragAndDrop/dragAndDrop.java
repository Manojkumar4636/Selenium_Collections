package com.learn.selenium.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableExample {
/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/drop.html"
	TestCase3: Play with Droppable
	TestCase4: Close the project
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		//action.clickAndHold(from).moveToElement(to).release().build().perform();
		
		action.dragAndDrop(from, to).build().perform();
		
		//close the project
		driver.quit();
	}
}
