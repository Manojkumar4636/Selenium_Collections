package com.learn.selenium.day15;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/upload.html"
	TestCase3: Upload the file use sendKeys.
	TestCase4: Quit the project.
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/upload.html");
		
		//Upload the file
		WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
		uploadFile.sendKeys("C:\\Users\\Acer\\Downloads\\testleaf.xlsx");
		
		//Quit the project
		driver.quit();
		
	}
}
