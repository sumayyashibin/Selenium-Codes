package com.obsqura.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.obsqura.utilities.ExcelUtility;
import com.obsqura.utilities.PageUtility;

public class ManageSliderPage {
	WebDriver driver;
	PageUtility page=new PageUtility();

	public ManageSliderPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li[10]/a")
		WebElement manageSliderMenu;
	
		@FindBy(xpath="//a[@onClick='click_button(1)']")
		private WebElement addButton;
		
		@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//li")
		private WebElement menuOption;
		
		@FindBy(xpath="//h1[text()='List Sliders']")
		private WebElement listSliders;
		
		@FindBy(xpath="//input[@id='link']")
		private WebElement link;
		
		@FindBy(xpath="//form[@id='form']//child::input[@id='main_img']")
		private WebElement chooseButton;
		
		@FindBy(xpath="//button[@class='btn btn-danger']")
		private WebElement saveButton;
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement alert;
		
	public void manageSliderOption() throws IOException{
		WebElement slidersList;
		boolean isListSlider;
		page.getClickElement(manageSliderMenu);
		isListSlider=listSliders.isDisplayed();
		Assert.assertTrue(isListSlider);

	}
	
	public void enterLink(String lk) {
		boolean isLinkField;
		page.getClickElement(manageSliderMenu);
		page.getClickElement(addButton);
		isLinkField=link.isDisplayed();
		page.clickOnElement(link);
		link.sendKeys(lk);
		Assert.assertTrue(isLinkField);
		
	}
	public void saveLinkButton() throws IOException {
		boolean alertMessage;
		Actions action = new Actions(driver); 
		action.moveToElement(chooseButton).click().perform();
		chooseButton.sendKeys("D:\\Automation Testing\\DF.png");
		page.clickOnElement(saveButton);
		alertMessage=alert.isDisplayed();
		Assert.assertTrue(alertMessage, "Alert message not displayed");

		
	}
}
