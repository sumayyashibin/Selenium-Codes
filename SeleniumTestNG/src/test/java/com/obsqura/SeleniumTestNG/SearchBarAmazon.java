package com.obsqura.SeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchBarAmazon extends Base {
	@Test
	public void iD() {
		driver.findElement(By.id("twotabsearchtextbox"));
	}

	@Test
	public void cssSelector() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));//Tag&ID
	}

	@Test
	public void cssSelectorAttribute() {

		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));//Tag&Attribute
	}

	@Test
	public void xpath() {

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}

}
