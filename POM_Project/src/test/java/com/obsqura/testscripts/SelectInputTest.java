package com.obsqura.testscripts;

import org.testng.annotations.Test;

import com.obsqura.pages.BaseDriver;
import com.obsqura.pages.SelectInputPage;

public class SelectInputTest extends BaseDriver {
	SelectInputPage obj;
	@Test
	public void verifySelectInputColorUsingVisibleText() {
		obj = new SelectInputPage(driver);
		obj.verifySelectInputByVisibleText();
	}
	@Test
	public void verifySelectInputColorUsingIndex() {
		obj = new SelectInputPage(driver);
		obj.verifySelectInputByIndex();
	}
	@Test
	public void verifySelectInputColorUsingValue() {
		obj = new SelectInputPage(driver);
		obj.verifySelectInputByValue();
	}
	@Test
	public void verifyTwoInputFieldColorAndGetMsg() {
		obj = new SelectInputPage(driver);
		obj.verifyTwoInputField();
	}


}
