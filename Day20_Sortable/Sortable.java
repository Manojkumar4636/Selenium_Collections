package com.learn.selenium.day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/sortable.html"
	TestCase3: Move the last index value from first index
	TestCase4: Quit the project
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHOMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");

		//Move the last index value from first index
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		WebElement from = elements.get(6);
		WebElement to = elements.get(0);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
		
		//Quit the project
		driver.quit();
		
	}

}
