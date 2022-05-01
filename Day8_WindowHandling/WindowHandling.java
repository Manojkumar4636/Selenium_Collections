package com.learn.selenium.day7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithWindowsExample {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Window.html"
	TestCase3: Click button to open home page in New Window
        TestCase4: Find the number of opened windows
        TestCase5: Close all windows except Parent Windows
        TestCase6: Wait for 2 new Windows to open
        TestCase7: Quit the project
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Window.html");

		//Parent window identity store it
		String oldWindow = driver.getWindowHandle();

		//Click button to open home page in New Window
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();

		//All window identity store it
		Set<String> windowHandles = driver.getWindowHandles();

		for (String newWindow : windowHandles) {
			driver.switchTo().window(newWindow);
		}
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		editBox.click();

		driver.close();

		driver.switchTo().window(oldWindow);

		//Find the number of opened windows
		WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openMultiple.click();

		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("NumberOfWindows: "+numberOfWindows);

		//Close all windows except Parent Windows
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();

		Set<String> windowHandles2 = driver.getWindowHandles();

		for (String allWindows : windowHandles2) {
			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}

		driver.switchTo().window(oldWindow);
		
		//Wait for 2 new Windows to open
		WebElement LastWindow = driver.findElement(By.xpath("//button[@id=\"color\"][@style=\"background-color:lightblue\"]"));
		LastWindow.click();

		Set<String> windowHandles3 = driver.getWindowHandles();
		for (String allWindows : windowHandles3) {
			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();	
			}
		}
		
		//Quit the project
		driver.quit();
	}

}
