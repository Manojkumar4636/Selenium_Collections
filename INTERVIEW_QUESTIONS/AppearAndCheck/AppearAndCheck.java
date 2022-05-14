package com.learn.selenium.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppearExample {
	  /*
		TestCase1: Open Chrome Browser.
		TestCase2: Visit Google Home Page: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/appear.html"
		TestCase3: One of them is disappeared and it will appears after few seconds, And you get that text.
		TestCase4: Close the project.
		*/
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get() - To load the URL to WebPage
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/appear.html");
		
		WebElement findElement = driver.findElement(By.xpath("//b[(text()=\"Voila! I'm here Guys\")]"));
		
		//Wait for few seconds
		Thread.sleep(5000);
		
		//it will appears after few seconds, And you get that text
		String text = findElement.getText();
		System.out.println("I will get the Text: "+text);
		
		//Close the project
		driver.quit();
	}
}
