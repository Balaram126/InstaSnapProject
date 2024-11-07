package com.Ecommerce.InstaSnap.Genericlibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	@BeforeClass
	public void Browsersetup() {
		Reporter.log("Browser launched succesfully");
		
	}
	
	@AfterClass
	public void Terminatebrowser() {
		Reporter.log("Browser closed succesfully");
	}
	
	@BeforeMethod
	public void Login() {
		Reporter.log("login  succesfully");
	}
	@AfterMethod
	public void Logout() {
		Reporter.log("logout  succesfully");
	}
}
