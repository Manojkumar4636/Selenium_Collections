package com.learn.selenium.day9;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/frame.html"
	TestCase3: Click inside a frame button
	TestCase4: Click inside a nested frame button
	TestCase5: Find total number of frames.
	TestCase6: Close the project
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//Click inside a frame button
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		String getText = frame1.getText();
		System.out.println("Clicked Text1: "+getText);
		
		driver.switchTo().defaultContent();
		
		//I am inside a nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
		String text = frame2.getText();
		System.out.println("Clicked Text2: "+text);
		
		driver.switchTo().defaultContent();
		
		//Find total number of frames.
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println("Total Size: "+size);
		
		//Close the project
		driver.quit();

		
	}

}
