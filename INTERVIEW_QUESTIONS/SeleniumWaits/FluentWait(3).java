/*
3) FluentWait
--------------
=> It checks for the webelement at regular intervals until the element is found (or)timeOut happens.

   SYNTAX
   -------
   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
   
   WebElement profile = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
			}

*/


package com.learn.selenium.fluentwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExampe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement profile = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
			}
		});

		profile.click();

		//Quit the Project
		driver.quit();
	}
}
