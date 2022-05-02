package com.learn.selenium.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherUploadExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/upload.html"
	TestCase3: Upload the file
	TestCase4: Click the Upload button
	TestCase5: Close the project.
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/upload.html");
		
		//Upload the file
		WebElement uploadFile = driver.findElement(By.id("file-upload"));
		uploadFile.sendKeys("C:\\Users\\Acer\\Downloads\\testleaf.xlsx");
		
		//Click the Upload button 
		WebElement uploadButton = driver.findElement(By.id("file-submit"));
		uploadButton.click();
		
		//Quit the project.
		driver.quit();
	}
}
