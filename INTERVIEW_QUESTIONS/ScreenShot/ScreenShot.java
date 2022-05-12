package com.learn.selenium.totalExamples;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException, AWTException  {
		
		System.setProperty("webdriver.chrome.driver", "ENTER YOUR CHROME DRIVER PATH");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		
		//1st Method - Take a screenshot here
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile = new File("D://sample.png");
		FileHandler.copy(sourceFile, destinationfile);
		
		
		
		/*
		//2nd Method - Used robot class
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle  = new Rectangle(screenSize);
		BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
		
		File file = new File("D://manoj.png");
		ImageIO.write(createScreenCapture, "png", file);
		*/
		
		//Quit the browser
		driver.quit();
	}

}
