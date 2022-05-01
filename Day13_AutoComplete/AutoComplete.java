package com.learn.selenium.day13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/autoComplete.html"
	TestCase3: Search the some word Example i'm search "S"
	TestCase4: Find List Size
	TestCase5: Select the value from the suggestion.
	TestCase6: Close the project.
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		//Search the some word Example i'm search "S"
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("S");
		
		//Find List Size
		List<WebElement> totalList = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		int size = totalList.size();
	    System.out.println(size);
	    
	    //Select the value from the suggestion
	    for (WebElement webElement : totalList) {
			if (webElement.getText().equals("Selenium")) {
				webElement.click();
				break;
			}
		}
	    
	    //Close the project
	    driver.quit();
	}

}
