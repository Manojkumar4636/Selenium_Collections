package com.learn.selenium.totalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutSetProperty {

	/*
	1) First of click the " Window-Start " button
        2) Then Search " Edit the system environment variables " and click 
        3) After click one new window will be open and click " environment variables " Button
        4) And another " Environment variables " window is opened, you go for " System Variables " and 
           " PATH " is click.

        5) Then your ChromeDriver path is Copy and Paste the " System Variables PATH " after 
        click ok button the  all opened windows.
	*/
	
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

