package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManageCategoryPage {
	WebDriver driver;
	PageUtility page=new PageUtility();
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li[12]/a")
	WebElement manageCategoryMenu;
	
	@FindBy(xpath = "//ul[@class='nav nav-treeview']//li/a")
	WebElement subCategoryMenu;
	
	public void subCategory() {
		page.getClickElement(manageCategoryMenu);
		String subCat=subCategoryMenu.getAttribute("href");
		
		
		
	}


}
