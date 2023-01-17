package com.obsqura.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageCategoryPage;
import com.obsqura.rmartbase.Base;

public class ManageCategoryTest extends Base {
	LoginPage obj;
	ManageCategoryPage mc;

	@Test
	public void verifySubCategory() throws InterruptedException, IOException {
		obj = new LoginPage(driver);
		obj.validUserNameAndPassword();
		mc = new ManageCategoryPage(driver);
		mc.subCategory();
	}


}
