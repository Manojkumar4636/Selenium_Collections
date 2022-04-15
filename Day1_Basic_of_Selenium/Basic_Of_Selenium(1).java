/*Selenium
  ----------
  Aim: Automation --> Web Application

=> Selenium is a Web Application Automation Framework.

=> Selenium IDE (Integrated Development Environment) ---> Eclipse, Netbeans, IntelliJ...

=> Selenium WebDriver ----> Support All Browser

=> Automation Script --> JAVA + Selenium 
   =>It's combinational of java and selenium
   
Components
----------
1 - Selenium IDE (Integrated Development Environment) ---> Eclipse, Netbeans, IntelliJ...
2 - Selenium jar file
3 - Driver.exe file

Steps
-----
1 - Create a Project

2 - Create a new Folder (RightClick Project --> new --> folder --> Library)
  => Copy and paste the jar in Library folder from downloads
  
3 - RightClick jar --> build path --> add to build path

4 - Create a new Folder (RightClick Project --> new --> folder --> Driver)

5 - Extract the downloaded driver zip folder

6 - Copy and paste the exe file in driver folder from downloads 

7 - Create a class

Browser Name
------------
Chrome ---> webdriver.chrome.driver
Gecko  ---> webdriver.gecko.driver
IE     ---> webdriver.ie.driver

Class
------
Chrome ---> ChromeDriver
Gecko  ---> FirefoxDriver
IE     ---> InteretExploreDriver

Object
------
WebDriver ---> (Interface)

WebDriver driver = new ChromeDriver();


*/


package com.learn.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
	/*
	TestCase1: Open Chrome Browser.
	TestCase2: Visit Google Home Page: "https://www.google.co.in"
	*/		 
	public static void main(String[] args) {
		
		                    //Your Browser Name              Your Browser Path
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		//Create a Object
		WebDriver driver = new ChromeDriver(); //Upcasting Method
		
		//get() - To load the URL to Webpage
		driver.get("http://www.google.co.in"); 

	}

}

