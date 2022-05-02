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
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/upload.html"
	TestCase3: Upload the file
	TestCase4: Close the project.
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		//Upload the file
		WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
		uploadFile.sendKeys("C:\\Users\\Acer\\Downloads\\testleaf.xlsx");
		
		//Close the project
		driver.quit();
		
	}
}
