package com.obsqura.SeleniumTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AmazonBase {
	public WebDriver driver;

	@BeforeTest
	public void initializeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHIBIN\\eclipse-workspace\\SeleniumTestNG\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

	public void browserClose() {
		driver.close();
	}

	@AfterTest
	public void browserQuit() {
		driver.quit();
	}
}
