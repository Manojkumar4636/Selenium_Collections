/*
2) Explicit Wait
----------------
=> It is applicable to only one locator (or) one WebElement.
=> The Explicit Wait in Selenium is used to tell the webdriver to wait for certain conditions (Expected Conditions).

    SYNTAX
    -------
    WebDriverWait wait = new WebDriverWait(Webdriver ref, 30);
    wait.until(Condition to be met);
     
     Example:
     --------
    WebDriverWait wait = new WebDriverWait(driver, 20);
    WebElement profile = wait.until(ExpectedConditions
			     .elementToBeClickable(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")));


*/



package com.learn.selenium.explicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
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
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
		//Create WebDriverWait instance (object) => (driver, seconds)
		//wait.until(Condition to be met)
				WebDriverWait wait = new WebDriverWait(driver, 20);
				WebElement profile = wait.until(ExpectedConditions
								.elementToBeClickable(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")));
				profile.click();
				
		//Quit the Project
		driver.quit();
		
	}

}
