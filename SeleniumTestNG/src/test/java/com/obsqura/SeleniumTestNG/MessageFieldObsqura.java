package com.obsqura.SeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obsqura.SeleniumTestNG.Base;

public class MessageFieldObsqura extends Base {
	@Test
	 public void MessageFieldObsqura() {
		driver.findElement(By.id("single-input-field"));
		 driver.findElement(By.className("form-control"));
		 driver.findElement(By.cssSelector("input#single-input-field"));
		 driver.findElement(By.cssSelector("input.form-control"));
		 driver.findElement(By.cssSelector("input[id=single-input-field]"));
		 driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		 driver.findElement(By.xpath("(//input[@id='single-input-field'])[1]"));
		
	 }

}
