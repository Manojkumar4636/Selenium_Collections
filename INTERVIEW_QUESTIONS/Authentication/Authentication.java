package com.learn.selenium.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationExample {
    /*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://the-internet.herokuapp.com/digest_auth"
	TestCase3: Login the Website ( UserName: "admin", Password: "admin" )
	TestCase4: Close the project
	*/
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Passing the UserName, Password in the URL
		//Example : https://username:password@example.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		//Close the Project
		driver.quit();
	}

}
