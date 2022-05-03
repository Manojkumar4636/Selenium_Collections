package com.learn.selenium.day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Link.html"
	TestCase3: Click the link goto Home page
	TestCase4: Find where am supposed to go without clicking me?
	TestCase5: Find link is broken or Not
	TestCase6: Go to Home Page (Interact with same link name)
	TestCase7: How many links are available in this page?
	TestCase8: Quit the project.
	*/
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Link.html");
		
	//Click the link goto Home page
	WebElement clickLink1 = driver.findElement(By.linkText("Go to Home Page"));
	clickLink1.click();
	    
	    driver.navigate().back();
	    
	    //Find where am supposed to go without clicking me?
	    WebElement whereToGo = driver.findElement(By.partialLinkText("Find where am supposed"));
	    String where = whereToGo.getAttribute("href");
	    System.out.println("This link is where going: "+ where);
	    
	    //Find link is broken or Not
	    WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
	    brokenLink.click();
	    
	    String title = driver.getTitle();
	    if (title.contains("404")) {
			System.out.println("Link is broken");
		}
	    driver.navigate().back();
	    
	    //Go to Home Page (Interact with same link name)
	    WebElement clickLink2 = driver.findElement(By.linkText("Go to Home Page"));
	    clickLink2.click();
	    
	    driver.navigate().back();
	    
	    //How many links are available in this page?
	    List<WebElement> linkTagCount = driver.findElements(By.tagName("a"));
	    int size = linkTagCount.size();
	    System.out.println("Total no of links: "+size);
	    
	    //Quit the project
	    driver.quit();
	}

}
