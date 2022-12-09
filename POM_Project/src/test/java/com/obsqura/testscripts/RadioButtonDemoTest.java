package com.obsqura.testscripts;

import org.testng.annotations.Test;

import com.obsqura.pages.BaseDriver;
import com.obsqura.pages.RadioButtonDemoPage;


public class RadioButtonDemoTest extends BaseDriver {
	RadioButtonDemoPage obj;
	@Test
	public void verifyRadioBuutonSelectedAndGetTheMsg() {
		obj = new RadioButtonDemoPage(driver);
		obj.verifyRadioButtonSelected();
	}
	@Test
	public void verifyGroupRadioButtonIsSelectedAndGetMsg() {
		obj = new RadioButtonDemoPage(driver);
		obj.verifyGroupRadioButtonSelected();
	}

}
