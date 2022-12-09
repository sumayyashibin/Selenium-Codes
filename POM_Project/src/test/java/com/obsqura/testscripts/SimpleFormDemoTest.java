package com.obsqura.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.BaseDriver;
import com.obsqura.pages.SimpleFormDemoPage;

public class SimpleFormDemoTest extends BaseDriver {
	SimpleFormDemoPage obj;

	@Test
	public void enterMessageAndVerifySingleInputField() throws IOException {
		obj = new SimpleFormDemoPage(driver);
		obj.singleInputField();
	
	}
	@Test
	public void enterMessageAndVerifyTwoInputField() throws IOException {
		obj = new SimpleFormDemoPage(driver);
		obj.twoInputField();
	}
}
