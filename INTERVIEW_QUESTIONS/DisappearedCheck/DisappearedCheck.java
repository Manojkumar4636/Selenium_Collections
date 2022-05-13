package com.learn.selenium.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DissaperiencedExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit Google Home Page: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/disapper.html"
	TestCase3: Wait for few seconds. If the above button get disappeared then confirm it.
	TestCase4: Close the project.
	*/
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get() - To load the URL to WebPage
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/disapper.html");
		
		WebElement findElement = driver.findElement(By.id("btn"));
		
		//Wait for few seconds
		Thread.sleep(5000);
		
		//If the above button get disappeared then confirm it
		boolean displayed = findElement.isDisplayed();
		System.out.println("Disappeared or Not: "+displayed);
		
		//Close the project.
		driver.quit();	
	}

}
