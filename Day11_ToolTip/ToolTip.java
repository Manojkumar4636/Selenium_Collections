package com.learn.selenium.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/tooltip.html"
	TestCase3: Find ToolTip Value
	TestCase4: Quit the project
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		//Find ToolTip Value
		WebElement toolTip = driver.findElement(By.id("age"));
		String attribute = toolTip.getAttribute("title");
		System.out.println("ToolTip Value: "+attribute);
		
		//Quit the project
		driver.quit();
	}
}
