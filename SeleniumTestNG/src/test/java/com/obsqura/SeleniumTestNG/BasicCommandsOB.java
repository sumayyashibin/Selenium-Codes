package com.obsqura.SeleniumTestNG;

import org.testng.Assert;

import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class BasicCommandsOB extends Base {
	@Test
	public void singleInputFieldVarification() {
		String expectedMessage, inputMsg = "Hello", actualMsg;
		expectedMessage = "Your Message : " + inputMsg;
		driver.findElement(By.xpath("(//input[@id='single-input-field'])[1]")).sendKeys(inputMsg);
		driver.findElement(By.xpath("(//button[@id='button-one'])[1]")).click();
		actualMsg = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(expectedMessage, actualMsg, "Messages are not equal");

	}

	@Test
	public void total() {
		int a = 10;
		int b = 20;
		int t = a + b;
		String exp;
		String sa = Integer.toString(a);
		String sb = Integer.toString(b);
		String st = Integer.toString(t);
		exp = "Total A + B : " + t;
		driver.findElement(By.xpath("(//input[@id='value-a'])[1]")).sendKeys(sa);
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(sb);
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		String sum = driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(exp, sum);
	}

	@Test
	public void clearSample() {
		WebElement enterMessageField = driver.findElement(By.xpath("(//input[@id='single-input-field'])[1]"));
		enterMessageField.sendKeys("Hello");
		enterMessageField.clear();
		WebElement showMessage = driver.findElement(By.xpath("(//button[@id='button-one'])[1]"));
		showMessage.isEnabled();
		showMessage.isDisplayed();
		showMessage.isSelected();

	}

	@Test
	public void singleInputField() {
		String message = "Hello", actualMsg;
		String expectedMessage = "Your Message : " + message;
		WebElement enterMessageField = driver.findElement(By.xpath("(//input[@id='single-input-field'])[1]"));
		boolean isEnterMessageField = enterMessageField.isDisplayed();
		boolean enterMessageFields = enterMessageField.isEnabled();
		if (isEnterMessageField && enterMessageFields) {

			driver.findElement(By.xpath("(//input[@id='single-input-field'])[1]")).sendKeys(message);
		}
		Assert.assertTrue(enterMessageFields, "Message field not enabled");

		WebElement buttonShowMessage = driver.findElement(By.xpath("(//button[@id='button-one'])[1]"));
		boolean isbuttonShowMessage = buttonShowMessage.isDisplayed();
		boolean showMessageButton = buttonShowMessage.isEnabled();
		if (isbuttonShowMessage && showMessageButton) {
			driver.findElement(By.xpath("(//button[@id='button-one'])[1]")).click();
		}
		Assert.assertTrue(showMessageButton, "button not enabled");

		WebElement yourMessage = driver.findElement(By.xpath("(//div[@id='message-one'])[1]"));
		boolean isYourMessage = yourMessage.isDisplayed();
		if (isYourMessage) {
			actualMsg = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			Assert.assertEquals(expectedMessage, actualMsg, "Messages are not equal");
		}
		Assert.assertTrue(isYourMessage, "Message is not displayed");

	}

	@Test
	public void getAttribute() {
		String className = driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("class");
		String tagName = driver.findElement(By.xpath("//button[@id='button-one']")).getTagName();
		String backGroundColour = driver.findElement(By.xpath("//button[@id='button-one']"))
				.getCssValue("background-color");
		String fontColour = driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color");
		String borderRadius = driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("border-radius");
		Dimension buttonSize = driver.findElement(By.xpath("//button[@id='button-one']")).getSize();
		int buttonHeight = buttonSize.getHeight();
	}

	@Test
	public void verifyGetTotalButton() {
		int weight = 400;
		String hex = "#007bff";
		String hexa = "#fff";

		String buttonSize = driver.findElement(By.xpath("//button[@id='button-two']")).getCssValue("padding");
		String expValueButtonSize = buttonSize.replace(".375", " .75");
		Assert.assertEquals(expValueButtonSize, buttonSize);

		String buttonColour = driver.findElement(By.xpath("//button[@id='button-two']"))
				.getCssValue("background-color");
		String expButtonColor = (Color.fromString(hex).asRgba());
		Assert.assertEquals(expButtonColor, buttonColour);

		String buttonShape = driver.findElement(By.xpath("//button[@id='button-two']")).getCssValue("border-radius");
		String expbuttonShape = buttonShape.replace("border-radius", ".25");
		Assert.assertEquals(expValueButtonSize, buttonSize);

		String buttonFontColour = driver.findElement(By.xpath("//button[@id='button-two']")).getCssValue("color");
		String expButtonFontColor = (Color.fromString(hexa).asRgba());
		Assert.assertEquals(expButtonFontColor, buttonFontColour);

		String buttonFontWeight = driver.findElement(By.xpath("//button[@id='button-two']")).getCssValue("font-weight");
		String expButtonFontWeight = Integer.toString(weight);
		Assert.assertEquals(expButtonFontWeight, buttonFontWeight);

	}

	@Test
	public void getLOcation() {
		int x, y, x1, y1;
		boolean increasingValue=true;
		Point showMessage = driver.findElement(By.xpath("(//input[@id='single-input-field'])[1]")).getLocation();
		x = showMessage.getX();
		y = showMessage.getY();

		Point buttonSize = driver.findElement(By.xpath("//button[@id='button-one']")).getLocation();
		x1 = buttonSize.getX();
		y1 = buttonSize.getY();

		if (y1 > y) {
			increasingValue=true;
		}
		Assert.assertTrue(increasingValue, "Show message button is not below the message field");
	}
	

	@Test
	public void list() {
		
		List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//li"));
		
		
		for (WebElement menu : menuList) {
			
				String text = menu.getText();
				
				if (text.contentEquals("Radio Buttons Demo")) {
					menu.click();
					break;
				}
			}

		}
	@Test
	public void datepickerslist() {
		
		List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
		
		
		for (WebElement menu : menuList) {
			
				String text = menu.getText();
				
				if (text.contentEquals("Date Pickers")) {
					menu.click();
					break;
				}
			}

		}
	
}
