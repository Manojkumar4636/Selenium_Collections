/*
Wait
-----

Static Wait
------------
Thread.Sleep(ms) 5000ms is a 5Sec

Dynamic Wait
------------
1) Implicit Wait
2) Explicit Wait
3) Fluent Wait

1) Implicit Wait
-----------------
=> Implicit Wait is applicable for all your locators.
=> The Implicit Wait in Selenium is used to tell the webdriver to wait for a certain amount of time before it throws a Exceptions.
=> Default time is "0".
=> Once we set the time, the webdriver will wait for the element for that time before throwing an Exception.
	
	
	SYNTAX
	-------
	driver.manage().timeOuts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	
*/

package com.learn.selenium.implicitlywait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitExample {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit the WebSite: "https://www.phptravels.net/login"
	TestCase3: Login the Website( UserName: "user@phptravels.com", Password: "demouser" )
        TestCase4: Then Click MY PROFILE
        TestCase5: Quit the project
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//ImplicitylyWait Method
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Visit the WebSite: "https://www.phptravels.net/login"
		driver.get("https://www.phptravels.net/login");

		//Login the Website( UserName: "user@phptravels.com", Password: "demouser" )
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("user@phptravels.com");

		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("demouser");

		WebElement clickLogin = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		clickLogin.click();

		//Then Click MY PROFILE
		WebElement clickProfile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
		clickProfile.click();

		//Quit the Project
		driver.quit();

	}
}
