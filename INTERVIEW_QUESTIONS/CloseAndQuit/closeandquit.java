package com.learn.selenium.closeandquit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		//Parent window identity store it
		String oldWindow = driver.getWindowHandle();

		//Click button to open home page in New Window
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		
		Thread.sleep(3000);
		
		//Close the browser window that the driver has foucus of
		driver.close();
		
		//close the project
		//driver.quit();
		

	}

}
