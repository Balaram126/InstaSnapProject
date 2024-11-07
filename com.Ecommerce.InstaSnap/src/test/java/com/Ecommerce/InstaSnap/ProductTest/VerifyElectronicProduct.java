package com.Ecommerce.InstaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.InstaSnap.Genericlibrary.BaseTest;

public class VerifyElectronicProduct extends BaseTest {
	
	@Test(priority = 1)
	public void createproduct() {
		Reporter.log("electronic product created",true);
	}
	
	@Test(priority = 2,invocationCount = 2,dependsOnMethods = "createproduct")
	public void updateproduct() {
		Reporter.log("electronic product updated",true);
		
	}

}
