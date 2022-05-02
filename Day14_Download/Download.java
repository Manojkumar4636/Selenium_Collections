package com.learn.selenium.day14;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/download.html"
	TestCase3: Click and Download the file
	TestCase4: Then file is Downloaded or Not check it
	TestCase5: Quit the project
	*/
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		//Click and Download the file
		WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		
		//Wait 3 Second after Check it
		Thread.sleep(3000);
		
		//C:\Users\Acer\Downloads
		File fileLocation = new File("C:\\Users\\Acer\\Downloads");
		File[] listFiles = fileLocation.listFiles();
		for (File file : listFiles) {
			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("File is Present");
				break;
			}
		}
		
		//Quit the project
		driver.quit();
		
	}

}
