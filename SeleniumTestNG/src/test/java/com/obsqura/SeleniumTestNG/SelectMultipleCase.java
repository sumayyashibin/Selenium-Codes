package com.obsqura.SeleniumTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.SeleniumTestNG.Base;

public class SelectMultipleCase extends Base {

	@Test
	public void visibleText() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select obj = new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		obj.selectByVisibleText("Red");
		obj.selectByVisibleText("Yellow");
		obj.selectByVisibleText("Green");
	}

	@Test
	public void indexSelect() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select obj1 = new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		obj1.selectByIndex(0);
		obj1.selectByIndex(1);
		obj1.selectByIndex(2);

	}

	@Test
	public void valueSelect() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select obj2 = new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		obj2.selectByValue("Red");
		obj2.selectByValue("Yellow");
		obj2.selectByValue("Green");
	}

	@Test
	public void optionGet() {
		Select obj3 = new Select(driver.findElement(By.xpath("//select[@id='multi-select-field']")));
		List<WebElement> element = obj3.getOptions();
		int ele = element.size();
		boolean isMultipleFlag = obj3.isMultiple();
		Assert.assertTrue(isMultipleFlag, "Multiple option not possible");
		obj3.selectByVisibleText("Red");
		obj3.selectByVisibleText("Yellow");
		obj3.selectByVisibleText("Green");
		obj3.deselectAll();

	}

	@Test
	public void multiSelect() {
		WebElement getSelctButton;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select obj4 = new Select(driver.findElement(By.xpath("//select[@id='multi-select-field']")));
		List<WebElement> opt = obj4.getOptions();
		getSelctButton = driver.findElement(By.id("button-all"));
		for (WebElement option : opt) {
			String text = option.getText();
			if (text.contains("Yellow")) {
				option.click();
				getSelctButton.click();
				break;
			}
		}

	}
	@Test
	public void selectAll() {
		WebElement getSelctAllButton,actualMessg;
		boolean isMultipleFlag;
		String  actualMessage,expectedMessg="All selected colors are : Red,Yellow,Green";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select obj5 = new Select(driver.findElement(By.xpath("//select[@id='multi-select-field']")));
		isMultipleFlag=obj5.isMultiple();
		Assert.assertTrue(isMultipleFlag, "Multiple option not selected");
		getSelctAllButton = driver.findElement(By.id("button-all"));
		actualMessg=driver.findElement(By.id("message-two"));
		if(isMultipleFlag) {
			obj5.selectByVisibleText("Red");
			obj5.selectByVisibleText("Yellow");
			obj5.selectByVisibleText("Green");
			obj5.getAllSelectedOptions();
			getSelctAllButton.click();
			actualMessage = actualMessg.getText();
			Assert.assertEquals(expectedMessg, actualMessage, "Selected colours text are not same");
			obj5.deselectAll();		
			}
		
	}
	@Test
	public void deselectAll() {
		WebElement deslctActualMessg;
		boolean isMultipleFlag;
		String deselectActual,deslctExpMessg="All selected colors are : ";
		deslctActualMessg=driver.findElement(By.id("message-two"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select obj6 = new Select(driver.findElement(By.xpath("//select[@id='multi-select-field']")));
		isMultipleFlag=obj6.isMultiple();
		obj6.selectByVisibleText("Red");
		obj6.selectByVisibleText("Yellow");
		obj6.selectByVisibleText("Green");
		obj6.deselectAll();
		deselectActual=deslctActualMessg.getText();
		Assert.assertEquals(deselectActual, deslctExpMessg, "messages are not same");
		
	}

}
