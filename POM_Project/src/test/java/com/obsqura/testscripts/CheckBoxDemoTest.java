package com.obsqura.testscripts;

import org.testng.annotations.Test;

import com.obsqura.pages.BaseDriver;
import com.obsqura.pages.CheckBoxDemoPage;

public class CheckBoxDemoTest extends BaseDriver {
	CheckBoxDemoPage obj;
	@Test
	public void verifySingleCheckBox() {
		obj=new CheckBoxDemoPage(driver);
		obj.singleCheckBoxDemo();
		obj.multipleCheckBoxDemo();
		
	}
	

}
