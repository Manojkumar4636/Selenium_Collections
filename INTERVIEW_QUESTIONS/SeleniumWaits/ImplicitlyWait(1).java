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
        TestCase5: Close the project
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

		//Close the Project
		driver.quit();

	}
}
