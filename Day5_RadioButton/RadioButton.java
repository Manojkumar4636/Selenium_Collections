package com.learn.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TestCase1: Open Chrome Browser.
TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/radio.html"
TestCase3: Click YES or NO button
TestCase4: Find default selected radio button
TestCase5: Select your age group
TestCase6: Close the project
*/
public class RadioButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//Click YES or NO button
		WebElement clickYes = driver.findElement(By.id("yes"));
		clickYes.click();
		
		//Find default selected radio button
		WebElement findSelectButton = driver.findElement(By.xpath("//input[@name=\"news\"][@value=\"0\"]"));
		boolean uncheckedButton = findSelectButton.isSelected();
		System.out.println("Unchecked: "+uncheckedButton);
		
		WebElement findSelectButton1 = driver.findElement(By.xpath("//input[@name=\"news\"][@value=\"1\"]"));
		boolean checkedButton = findSelectButton1.isSelected();
		System.out.println("Checked: "+checkedButton);
		
		//Select your age group
		WebElement findSelectButton2 = driver.findElement(By.xpath("//input[@name=\"age\"][@value=\"0\"]"));
		findSelectButton2.click();
		
		//Quit the project
		driver.quit();
		
	}
}
