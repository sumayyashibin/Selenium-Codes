package com.obsqura.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.rmartbase.Base;

public class LoginDetailsTest extends Base {
	@Test
	public void checkLogin() throws IOException {
		LoginPage obj=new LoginPage(driver);
		obj.validUserNameAndPassword();

	}
	@Test(dataProvider="SearchProvider")
	public void invalidUserNameAndPassword(String userName,String password) throws IOException {
		LoginPage obj1=new LoginPage(driver);
		obj1.invalidLoginDetails(userName,password);
	
	}
	@Test
	public void waterMarkUserName() throws IOException {
		LoginPage obj2=new LoginPage(driver);
		obj2.waterMarkOnField();
	}
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "admin","admn" }
        
        };

    }

}
