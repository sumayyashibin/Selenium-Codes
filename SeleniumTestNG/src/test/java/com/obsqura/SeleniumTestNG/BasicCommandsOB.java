package com.obsqura.SeleniumTestNG;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BasicCommandsOB extends Base {
	@Test
	public void singleInputFieldVarification() {
		String expectedMessage, inputMsg = "Hello", actualMsg;
		expectedMessage = "Your Message : " + inputMsg;
		driver.findElement(By.xpath("(//input[@id='single-input-field'])[1]")).sendKeys(inputMsg);
		driver.findElement(By.xpath("(//button[@id='button-one'])[1]")).click();
		actualMsg = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(expectedMessage, actualMsg, "Messages are not equal");

	}
	@Test
	public void total() {
		int a = 10;
		int b = 20;
		int t = a+b;
		String exp;
		String sa = Integer.toString(a);
		String sb = Integer.toString(b);
		String st = Integer.toString(t);
		exp="Total A + B : "+t;
		driver.findElement(By.xpath("(//input[@id='value-a'])[1]")).sendKeys(sa);
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(sb);
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		String sum = driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(exp, sum);
	}

}
