package com.obsqura.SeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorAmazon extends Base {

	@Test
	public void amazonLocator() {

		driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		driver.findElement(By.id("icp-nav-flyout")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("electronics");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("swm-link")).click();

	}
}