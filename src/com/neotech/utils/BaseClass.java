package com.neotech.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	/**
	 * This method will create the driver and return it
	 * @return WebDriver
	 */
	
	public static WebDriver setUp(){
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webDriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webDriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported!");
		}
		
		driver.manage().window().maximize();		
		driver.get(ConfigsReader.getProperty("url"));
		
		return driver;
	}
	
	/**
	 * This method will quit the browser
	 */
	public static void tearDown(){
		if(driver != null) {
			driver.quit();
		}
	}

}
