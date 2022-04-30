package com.learn.selenium.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/tooltip.html"
	TestCase3: Find ToolTip Value
	TestCase4: Close the project
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		//Find ToolTip Value
		WebElement toolTip = driver.findElement(By.id("age"));
		String attribute = toolTip.getAttribute("title");
		System.out.println("ToolTip Value: "+attribute);
		
		//Close the project
		driver.quit();
	}
}
