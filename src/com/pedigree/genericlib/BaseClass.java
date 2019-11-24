package com.pedigree.genericlib;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	PropertiesFileReader reader = new PropertiesFileReader();

	@BeforeTest
	public void driverSetUp() throws IOException {
		Properties prt = reader.getPropertiesFile();
		String BrowserName = prt.getProperty("Browser");

		switch (BrowserName) {
		case "Chrome":
			System.out.println("Please wait, Launching chrome Browser");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prt.getProperty("Url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;

		case "Firefox":
			System.out.println("Please wait, Launching Firefox Browser");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(prt.getProperty("Url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;

		default:
			System.out.println("Please wait, Launching chrome Browser");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prt.getProperty("Url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		}
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
