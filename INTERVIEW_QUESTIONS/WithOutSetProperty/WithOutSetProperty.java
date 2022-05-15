package com.learn.selenium.totalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutSetProperty {

	
	public static void main(String[] args) {
		
		//With out SetProperty use to launch the Browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Goa Trip \n");
		
		WebElement clickLink = driver.findElement(By.xpath("//h3[(text()='84 Goa Tour Packages - MakeMyTrip')]"));
		clickLink.click();
		
		//Quit the browser
		driver.quit();
	}

}

