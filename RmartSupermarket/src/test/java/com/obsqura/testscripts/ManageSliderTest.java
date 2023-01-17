package com.obsqura.testscripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageSliderPage;
import com.obsqura.rmartbase.Base;

public class ManageSliderTest extends Base {
	LoginPage login;
	ManageSliderPage msp;
	
	@Test
	public void sliderManage() throws IOException {
		login=new LoginPage(driver);
		login.validUserNameAndPassword();
		msp=new ManageSliderPage(driver);
		msp.manageSliderOption();
		
	}
	
	@Test(dataProvider="SearchProvider")
	public void linkField(String lk) throws IOException {
		login=new LoginPage(driver);
		login.validUserNameAndPassword();
		msp=new ManageSliderPage(driver);
		msp.enterLink(lk);
		
	}
	@Test(dataProvider="SearchProvider")
	public void saveLink(String lk) throws IOException {
		login=new LoginPage(driver);
		login.validUserNameAndPassword();
		msp=new ManageSliderPage(driver);
		msp.enterLink(lk);
		msp.saveLinkButton();
		
	}
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "www.amazon.com"}
        
        };

    }

}
