package com.squadwde.next.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}

	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("http://automationpractice.com/index.php");
		driver.navigate().to("http://localhost:4200/webpack-dev-server/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
