package com.obsqura.SeleniumTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obsqura.SeleniumTestNG.Base;

public class Xpath extends Base {
	@Test
	public void xpath() {

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		driver.findElement(By.xpath("//span[@class='icp-currency-symbol']"));
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));
		driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
		driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
		driver.findElement(By.xpath("//div[@id='nav-tools']"));
		driver.findElement(By.xpath("//div[@id='nav-packard-glow-loc-icon']"));
		driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		driver.findElement(By.xpath("//span[@class='icp-currency-symbol']"));
		
	}

}
