package com.learn.selenium.totalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavgateExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROME DRIVER PATH");
		WebDriver driver = new ChromeDriver();
		
		//get will not store the history
		//driver.get("http://www.google.co.in"); //Waiting for the elements appear in DOM
		
		//navigate will store the history
		driver.navigate().to("http://www.google.co.in");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Goa Trip"+Keys.ENTER);
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//Quit the project
		driver.quit();

	}

}
