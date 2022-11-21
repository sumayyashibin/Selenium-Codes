package com.obsqura.SeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test
	public void iDLocator() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

	@Test
	public void classLocator() {
		driver.findElement(By.className("nav-logo-link"));
	}

	@Test
	public void nameLocator() {
		driver.findElement(By.name("glow-validation-token"));
	}

	@Test
	public void cssSelectorId() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

	}

	@Test
	public void cssSelectorTag() {

		driver.findElement(By.cssSelector("span.hm-icon-label"));
	}

	@Test
	public void cssSelectorAttribute() {

		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));
	}

	@Test
	public void xpath() {

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}

	@Test
	public void xpathIndexing() {

		driver.findElement(By.xpath("(//div[@class='nav-fill'])[2]"));
	}

}
