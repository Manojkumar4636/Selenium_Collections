package com.learn.selenium.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherUploadExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://the-internet.herokuapp.com/upload"
	TestCase3: Upload the file
	TestCase4: Click the Upload button
	TestCase5: Close the project.
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Upload the file
		WebElement uploadFile = driver.findElement(By.id("file-upload"));
		uploadFile.sendKeys("C:\\Users\\Acer\\Downloads\\testleaf.xlsx");
		
		//Click the Upload button 
		WebElement uploadButton = driver.findElement(By.id("file-submit"));
		uploadButton.click();
		
		//Close the project.
		driver.quit();
	}
}
