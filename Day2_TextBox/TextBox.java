package com.learn.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit This WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html"
	TestCase3: 1st TextBox Enter your email address
	TestCase4: 2nd TextBox Append a text 
	TestCase5: 3rd TextBox Get default text
	TestCase6: 4th TextBox Clear the text
	TestCase7: 5th Confirm that edit field is disabled
	TestCase8: Close the project
	*/
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html");
		
		//1st TextBox Enter your email address
		WebElement enterEmail = driver.findElement(By.id("email"));
		enterEmail.sendKeys("manojkumar@gmail.com");
		
		//2nd TextBox Append a text
		WebElement appendText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendText.sendKeys(" Manoj");
		
		//3rd TextBox Get default text
		WebElement getText = driver.findElement(By.name("username"));
		String print = getText.getAttribute("value");
		System.out.println("Get the defalut text: "+print);
		
		//4th TextBox Clear the text
		WebElement clearText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearText.clear();
		
		//5th Confirm that edit field is disabled
		WebElement enabledOrNot = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = enabledOrNot.isEnabled();
		System.out.println("Enabled or Disabled: "+enabled);
		
		//Quit the project
		driver.quit();	
	}

}
