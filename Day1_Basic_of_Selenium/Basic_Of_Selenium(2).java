package com.learn.selenium.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleiumBasic1 {

	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit Google Home Page: "https://www.google.co.in"
	TestCase3: Google Search The "Goa trip budget" 
	TestCase4: Then Click "ENTER"
	*/		 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Upcasting Method
		
		//get() - To load the URL to WebPage
		driver.get("http://www.google.co.in"); 
		
		//SearchBox Google
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Goa trip budget"+Keys.ENTER);
		
	}
}
