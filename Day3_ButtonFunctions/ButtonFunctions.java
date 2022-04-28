package com.learn.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html"
	TestCase3: Click button to travel home page
	TestCase4: Back to previous page
	TestCase5: Find Location of button (x,y)
	TestCase6: Find button color
	TestCase7: Find the height and width
	TestCase8: Close the project
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
		
		//Click button to travel home page
		WebElement click = driver.findElement(By.id("home"));
		click.click();
		
		//Back to previous page
		driver.navigate().back();
		
		//Find Location of button (x,y)
		WebElement position = driver.findElement(By.id("position"));
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("X position: "+x+" Y position: "+y);
		
		//Find button color
		WebElement findColor = driver.findElement(By.id("color"));
		String cssValue = findColor.getCssValue("background-color");
		System.out.println("Button Color: "+cssValue);
		
		//Find the height and width
		WebElement findHeiandWid = driver.findElement(By.id("size"));
		Dimension size = findHeiandWid.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Height is: "+height+" Width is: "+width);
		
		//Close the project
		driver.quit();
		
	}

}
