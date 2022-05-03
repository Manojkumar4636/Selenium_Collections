package com.learn.selenium.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractImageExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "http://www.leafground.com/pages/Image.html"
	TestCase3: Click on this image to go home page
	TestCase4: Return Previous page go
	TestCase5: Find that image is broken or not
	TestCase6: Close the project
	*/
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//Click on this image to go home page
		WebElement clickImg = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		clickImg.click();
		
		//Return Previous page go
		WebElement clickImgPage = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/img"));
		clickImgPage.click();
		
		//Find that image is broken or not
		WebElement brokenImg = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		//"naturalwidth" = 0 it is Broken else not a broken
		if (brokenImg.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
		}else {
			System.out.println("The image is not broken");
		}
		
		//Quit the project
		driver.quit();
		
	}

}
