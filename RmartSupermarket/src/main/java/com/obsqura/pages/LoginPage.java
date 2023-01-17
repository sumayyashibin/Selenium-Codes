package com.obsqura.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.obsqura.utilities.ExcelUtility;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class LoginPage {
	WebDriver driver;
	PageUtility page=new PageUtility();
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameField;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordField; 
	

	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	private WebElement buttonSignIn; 
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement yourMessg; 
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement waterMarkUser; 
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement waterMarkPassword; 
	
	@FindBy(xpath="//a[@href='#']//child::img[@class='img-circle']")
	private WebElement admin; 
	
	@FindBy(xpath="//button[@class='close']")
	private WebElement close; 
	
	public void validUserNameAndPassword() throws IOException{
		String userName,password;
		boolean isAdmin;
		userName=ExcelUtility.getString(0, 0, System.getProperty("user.dir") +constants.Constants.EXCELFILE, "loginDetails");
		password=ExcelUtility.getString(1, 0, System.getProperty("user.dir") +constants.Constants.EXCELFILE, "loginDetails");
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		page.clickOnElement(buttonSignIn);
		isAdmin=admin.isDisplayed();
		page.clickOnElement(admin);
		Assert.assertTrue(isAdmin, "not clicked");;
	}
	public void invalidLoginDetails(String userName,String password) throws IOException {
		String actualMsg;
		boolean alertMessg;
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		WaitUtility.waitForElementClickable(driver, buttonSignIn);
		buttonSignIn.click();
		actualMsg = yourMessg.getText();
		alertMessg= yourMessg.isDisplayed();
		page.clickOnElement(close);
		Assert.assertTrue(alertMessg,"Alert message not shown");
		
	}
	
	public void waterMarkOnField() throws IOException {
		boolean userNameMark,passwordMark;
		userNameMark = waterMarkUser.isDisplayed();
		passwordMark=waterMarkPassword.isDisplayed();
		Assert.assertTrue(userNameMark);
		Assert.assertTrue(passwordMark);

	}
	

}
