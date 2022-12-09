package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckBoxDemoPage {
	WebDriver driver;

	public CheckBoxDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	By checkBox = By.xpath("//input[@id='gridCheck']");
	By messageShown = By.xpath("//div[@id='message-one']");
	By checkBoxOne = By.xpath("//input[@id='check-box-one']");
	By checkBoxTwo = By.xpath("//input[@id='check-box-two']");
	By checkBoxThree = By.xpath("//input[@id='check-box-three']");
	By checkboxFour = By.xpath("//input[@id='check-box-four']");
	By selectAllButton = By.xpath("//input[@id='button-two']");

	public void singleCheckBoxDemo() {
		boolean isSelectedSingleCheckBox;
		String expectedMsg = "Success - Check box is checked", actualMsg;
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(checkBox).click();
		isSelectedSingleCheckBox = driver.findElement(checkBox).isSelected();
		    if(isSelectedSingleCheckBox) {
		    actualMsg = driver.findElement(messageShown).getText();
		    Assert.assertEquals(actualMsg, expectedMsg,"Both messages are not equal");
		    }
	}
	public void multipleCheckBoxDemo() {
		boolean box1,box2,box3,box4;
		WebElement selectAllbutton;
		String actualButtonValue,expectedButtonValue = "Unselect All";
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(selectAllButton).click();
		box1 = driver.findElement(checkBoxOne).isSelected();
		box2 = driver.findElement(checkBoxTwo).isSelected();
		box3 = driver.findElement(checkBoxThree).isSelected();
		box4 = driver.findElement(checkboxFour).isSelected();
	    selectAllbutton= driver.findElement(selectAllButton);
	    actualButtonValue = selectAllbutton.getAttribute("Value");
		Assert.assertTrue(box1);
		Assert.assertTrue(box2);
		Assert.assertTrue(box3);
		Assert.assertTrue(box4);
		Assert.assertEquals(actualButtonValue, expectedButtonValue);
	}
}
