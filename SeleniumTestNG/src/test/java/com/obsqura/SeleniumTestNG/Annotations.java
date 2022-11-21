package com.obsqura.SeleniumTestNG;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite- First Method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test -This will always execute prior to Before Class, ,Before Method and Test Method ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class -This method is executed before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Before Method -It will be executed before method");
	}

	@Test
	public void testCase1() {
		System.out.println("This is my First Test Case 1");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method -After test execution");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class -This method is executed after Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test -This will always execute later to After Method, After Class ");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite-Last Method");
	}

}
