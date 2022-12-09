package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseDriver {
	public WebDriver driver;

	@BeforeMethod
	public void initializeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHIBIN\\eclipse-workspace\\POM_Project\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}

	public void browserClose() {
		driver.close();
	}

	@AfterMethod
	public void browserQuit() {
		driver.quit();
	}
}
