package com.obsqura.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RadioButtonDemo extends Base {

	@Test
	public void radioButton() {
		boolean maleButtonisSelected;
		boolean femaleButtonisSelected;
		String actualMessg;
		String expMessage = "Radio button is Not checked";
		// driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement radio = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radio.click();
		WebElement maleButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	
		maleButtonisSelected = maleButton.isSelected();
		WebElement femaleButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleButtonisSelected = femaleButton.isSelected();

		if (maleButtonisSelected || femaleButtonisSelected) {
			driver.findElement(By.xpath("//button[@id='button-one']")).click();
			WebElement actualMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
			actualMessg=actualMessage.getText();
		}
		else {
			driver.findElement(By.xpath("//button[@id='button-one']")).click();
			WebElement actualMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
			actualMessg=actualMessage.getText();
		}
			
		SoftAssert obj1 = new SoftAssert();
		obj1.assertEquals(actualMessg, expMessage, "Radio button not checked");
		obj1.assertAll();

	}

	@Test
	public void radioButtonMale() {
		String actualMessage;
		String expMessage = "Radio button 'Male' is checked";

		WebElement radio = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radio.click();
		WebElement maleButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean maleRadButton = maleButton.isEnabled();
		maleButton.click();
		boolean maleRadioButton = maleButton.isSelected();
		WebElement showScltdValue = driver.findElement(By.xpath("//button[@id='button-one']"));

		WebElement actualMessageShown = driver.findElement(By.xpath("//div[@id='message-one']"));
		if (maleRadButton && maleRadioButton) {
			
			maleButton.click();
			showScltdValue.click();
			actualMessage = actualMessageShown.getText();

			SoftAssert obj2 = new SoftAssert();
			obj2.assertEquals(expMessage, actualMessage, "Radio button is checked");
			obj2.assertAll();
		}

	}

	@Test
	public void radioButtonFemale() {
		String actMessage;
		String expMessage = "Radio button 'Female' is checked";

		WebElement radio = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radio.click();
		WebElement femaleButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean femaleRadButton = femaleButton.isEnabled();
		femaleButton.click();
		boolean femaleRadioButton = femaleButton.isSelected();
		WebElement showScltdValue = driver.findElement(By.xpath("//button[@id='button-one']"));

		WebElement actualMessageShown = driver.findElement(By.xpath("//div[@id='message-one']"));
		if (femaleRadButton && femaleRadioButton) {
			femaleButton.click();
			showScltdValue.click();
			actMessage = actualMessageShown.getText();
		
			SoftAssert obj3 = new SoftAssert();
			obj3.assertEquals(actMessage, expMessage, "Radio button is checked");
			obj3.assertAll();
		}

	}
}
