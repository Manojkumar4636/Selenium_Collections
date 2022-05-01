package com.learn.selenium.day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Alert.html"
	TestCase3: Click the button to display a alert box.
	TestCase4: Click the button to display a confirm box.
	TestCase5: Click the button to display a prompt box.
	TestCase6: Click the below button and click OK.
        TestCase7: Quit the project
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROMEDRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Alert.html");
		
		//Click the button to display a alert box.
		WebElement alert1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alert1.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Click the button to display a confirm box.
		WebElement alert2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		alert2.click();
		
		Alert alertDissmis = driver.switchTo().alert();
		alertDissmis.dismiss();
		
		//Click the button to display a prompt box.
		WebElement alert3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		alert3.click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("manoj");
		prompt.accept();
		
		//Click the below button and click OK.
		WebElement alert4 = driver.findElement(By.id("btn"));
		alert4.click();
		
		WebElement happy = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
		happy.click();
		
		//Quit the project
		driver.quit();
	}

}
