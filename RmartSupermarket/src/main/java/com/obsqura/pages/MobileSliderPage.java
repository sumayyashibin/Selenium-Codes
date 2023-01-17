package com.obsqura.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.obsqura.utilities.PageUtility;


public class MobileSliderPage {
	WebDriver driver;
	PageUtility page=new PageUtility();
	public MobileSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li[11]/a")
	WebElement mblSlideMenu;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]/img")
	WebElement firstCell;

	@FindBy(css = "h1[class='m-0 text-dark']")
	WebElement pgHead;
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[2]/a/span")
	WebElement statusBtn;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newBtn;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[2]/td[3]/a[1]")
	WebElement editBtn;

	@FindBy(xpath = "//form[@id='form']/div/div[2]/div/input")
	WebElement chooseFileBtn;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement updateBtn;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[1]//img")
	WebElement imgCell;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement errorPopupMsg;

	@FindBy(css = "button[type='submit']")
	WebElement saveBtn;


	public boolean verifyImageUpload() throws InterruptedException {
		page.getClickElement(mblSlideMenu);
		page.getClickElement(editBtn);
		chooseFileBtn.sendKeys("D:\\Automation Testing\\DF.png");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		page.getClickElement(updateBtn);
		boolean newImage=page.isDisplay(imgCell);
		Assert.assertTrue(newImage, "Image not updated");;
		return newImage;
	}

	public boolean uploadBigSizeImage() throws InterruptedException {
		page.getClickElement(mblSlideMenu);
		page.getClickElement(newBtn);
		chooseFileBtn.sendKeys("D:\\Automation Testing\\bigSizeImage.jpg");
		page.getClickElement(saveBtn);
		boolean errorMessg=page.isDisplay(errorPopupMsg);
		Assert.assertTrue(errorMessg, "Image not updated");;
		return errorMessg;


	}

	public void getTitle() {
		page.getClickElement(mblSlideMenu);
		String actual=page.getElementText(pgHead);
		String expected = "List Mobile Sliders";
		Assert.assertEquals(actual, expected, "Title error");
	}

	public boolean chkStatusBtnPresent() {

		page.getClickElement(mblSlideMenu);
		boolean status = page.isDisplay(statusBtn);
		Assert.assertTrue(status,"Status error");
		return status;

	}

	public boolean getBgColor() throws InterruptedException {
		String actual,expButtonColor;
		page.getClickElement(mblSlideMenu);
		actual=page.stylePropertyValidation(newBtn, "background-color");
		expButtonColor ="rgba(220, 53, 69, 1)";
		Assert.assertEquals(actual, expButtonColor, "Style error");
		return true;

	}

}