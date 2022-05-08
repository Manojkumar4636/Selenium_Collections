package com.learn.selenium.totalExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROME DRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Goa Trip");
		
		
		//1st Method - Refresh Comment
		driver.navigate().refresh();
		
		
		/*
		//2nd Method - Get CurrentUrl
		driver.get(driver.getCurrentUrl());
		*/
		
		/*
		//3rd Method - JavaScript
		JavascriptExecutor exception = (JavascriptExecutor) driver;
		exception.executeScript("history.go(0)");
		*/
		
		/*
		//4th Method Robot class used
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		*/
		
		//Quit the driver
		driver.quit();
		
	}
}
