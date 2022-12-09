package com.obsqura.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.obsqura.utilities.ExcelUtility;

public class SimpleFormDemoPage {
	WebDriver driver;

	public SimpleFormDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	By inputField = By.xpath("//input[@id='single-input-field']");
	By showMessageButton = By.xpath("//button[@id='button-one']");
	By yourMessage = By.xpath("//div[@id='message-one']");

	public void singleInputField() throws IOException {
		String expectedMessage, actualMsg;
		String inputMsg = ExcelUtility.getString(0, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "sheet1");
		expectedMessage = ExcelUtility.getString(1, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "sheet1") + inputMsg;
		driver.findElement(By.xpath("(//input[@id='single-input-field'])[1]")).sendKeys(inputMsg);
		driver.findElement(By.xpath("(//button[@id='button-one'])[1]")).click();
		actualMsg = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(expectedMessage, actualMsg, "Messages are not equal");

	}
	public void twoInputField() throws IOException {
		String expectedTotal,getTotal,actualtotal,valueA, valueB;
		int enterValueA,enterValueB,total;
		valueA = ExcelUtility.getNumeric(2, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "sheet1");
		valueB = ExcelUtility.getNumeric(3, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "sheet1");
		enterValueA =Integer.parseInt(valueA);
		enterValueB = Integer.parseInt(valueB);
		total =enterValueA + enterValueB;
		getTotal = Integer.toString(total);
		expectedTotal = ExcelUtility.getString(4, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "sheet1")+ total;
		driver.findElement(By.xpath("(//input[@id='value-a'])[1]")).sendKeys(valueA);
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(valueB);
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		actualtotal = driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(actualtotal, expectedTotal, "Total A+B is not same");
		
	}
}
