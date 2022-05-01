package com.learn.selenium.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TestCase1: Open Chrome Browser.
TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/checkbox.html"
TestCase3: Select JAVA CheckBox
TestCase4: Confirm Selenium is checked
TestCase5: Checked Empty box and DeSelect checkedBox
TestCase6: Select all below CheckBoxes
TestCase7: Quit the project
*/
public class CheckBoxExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/checkbox.html");
		
		//Select JAVA CheckBox
		WebElement javaClick = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		javaClick.click();
		
		//Confirm Selenium is checked
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean selected = checked.isSelected();
		System.out.println("Selenium is checked: "+selected);
		
		//Checked Empty box and DeSelect checkedBox
		WebElement deSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
	    if (deSelect.isDisplayed()) {
	    	deSelect.click();	
		}
	    WebElement deSelect1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
	    if (deSelect1.isSelected()) {
	    	deSelect1.click();
		}
	    
	    //Select all below CheckBoxes
	    WebElement option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
	    option1.click();
	    WebElement option2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
	    option2.click();
	    WebElement option3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
	    option3.click();
	    
	    //Quit the project
	    driver.quit(); 
	}

}
