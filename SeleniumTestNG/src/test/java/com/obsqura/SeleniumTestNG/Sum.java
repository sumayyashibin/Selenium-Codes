package com.obsqura.SeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.SeleniumTestNG.Base;

public class Sum extends Base {
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
