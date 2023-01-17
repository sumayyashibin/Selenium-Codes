package com.obsqura.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
	WebDriver driver;
	By menuOption = By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column']//li");
	
	public HeaderPage(WebDriver driver) {
		this.driver = driver;
	}

	public void managSliderList(String menuOpt) {

		List<WebElement> menuList = driver.findElements(menuOption);
		for (WebElement menu : menuList) {
				String text = menu.getText();
				
				if (text.contentEquals("Manage Slider")) {
					menu.click();
					break;
				}
			}
	}
		

}

