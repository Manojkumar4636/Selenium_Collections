package com.learn.selenium.totalExamples;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaxmizeExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROME DRIVER PATH");
		/*
		1st Method 
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		*/
		WebDriver driver = new ChromeDriver(); // ( ) --> Passing the chromeOptions
		driver.get("http://www.google.co.in");
		
		//2nd Method
		driver.manage().window().maximize();
		
		/*
		3rd Method
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		*/
		
		//Quit the browser
		driver.quit();
	}

}
