package com.obsqura.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.MobileSliderPage;
import com.obsqura.rmartbase.Base;

public class MobileSliderTest extends Base {
	LoginPage obj;
	MobileSliderPage ms;

	@Test
	public void checkImageUpload() throws InterruptedException, IOException {
		obj = new LoginPage(driver);
		obj.validUserNameAndPassword();
		ms = new MobileSliderPage(driver);
		ms.verifyImageUpload();
	}

	@Test
	public void verifyErrorPopup() throws InterruptedException, IOException {
		obj = new LoginPage(driver);
		obj.validUserNameAndPassword();
		ms = new MobileSliderPage(driver);
		ms.uploadBigSizeImage();
		
	}

	@Test
	public void chkTitle() throws IOException {
		obj = new LoginPage(driver);
		obj.validUserNameAndPassword();
		ms = new MobileSliderPage(driver);
		ms.getTitle();
	}

	@Test
	public void chkStatus() throws IOException {
		obj = new LoginPage(driver);
		obj.validUserNameAndPassword();
		ms = new MobileSliderPage(driver);
		ms.chkStatusBtnPresent();
	}

	@Test
	public void chkbgcolor() throws InterruptedException, IOException {
		obj = new LoginPage(driver);
		obj.validUserNameAndPassword();
		ms = new MobileSliderPage(driver);
		ms.getBgColor();
	}

}
