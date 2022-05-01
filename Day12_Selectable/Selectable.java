package com.learn.selenium.day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/selectable.html"
	TestCase3: Find Total elements size
	TestCase4: Select first 3 elements in the list of 7 elements
	TestCase5: Close the project.
	*/
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//Find Total elements size
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int size = selectable.size();
		System.out.println("Total Size: "+size);
		
		//Select first 3 elements in the list of 7 elements
		Actions action = new Actions(driver);
		
/*      action.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();		
*/		
		action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(1));
		action.clickAndHold(selectable.get(2)).build().perform();
		
		//Close the project
		driver.quit();
		
		}
}
