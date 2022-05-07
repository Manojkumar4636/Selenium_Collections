package com.learn.selenium.closeandquit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	
	//Close  is a only driver foucused window will be closed
	//Quit is a terminte the total driver
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROME DRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Window.html");

		//Parent window identity store it
		String oldWindow = driver.getWindowHandle();

		//Click button to open home page in New Window
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		
		Thread.sleep(3000);
		
		//Close the browser window that the driver has foucus of
		driver.close();
		
		//Quit the project
		//driver.quit();
		

	}

}
