package com.learn.selenium.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Dropdown.html"
	TestCase3: Select training Program using Index
	TestCase4: Select training Program using VisibleText
	TestCase5: Select training Program using Value
	TestCase6: SendKeys use to select 
	TestCase7: Multi select 
	TestCase8: Quit the project
	*/	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		//Select training Program using Index, index start with 0 to n-1
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		select.selectByIndex(2);
		
		//Select training Program using VisibleText
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select select1 = new Select(dropDown2);
		select1.selectByVisibleText("UFT/QTP");
		
		//Select training Program using Value
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select2 = new Select(dropdown3);
		select2.selectByValue("4");
		
		//Get the Number of Dropdown Options
		WebElement getNumber = driver.findElement(By.className("dropdown"));
		Select select3 = new Select(getNumber);
		List<WebElement> listOptions = select3.getOptions();
		int size = listOptions.size();
		System.out.println("Number of elements: "+size);
		
		//SendKeys use to select
		//You can use sendKeys for dropdown as well
		WebElement sendKeys = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		sendKeys.sendKeys("Selenium");
		
		//Multi select 
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select4 = new Select(multiSelect);
		select4.selectByIndex(1);
		select4.selectByIndex(2);
		select4.selectByIndex(3);
		
		//Quit the project
		
		driver.quit();	
	}

}
