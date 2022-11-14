package com.obsqura.SeleniumTestNG;


import org.testng.Assert;
import org.testng.annotations.Test;



public class AmazonUrl extends AmazonBase {
	@Test
	public void verifyUrl() {
		String expectedUrl = "https://www.amazon.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl);
	}
}
