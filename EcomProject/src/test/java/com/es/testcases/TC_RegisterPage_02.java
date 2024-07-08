package com.es.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ec.base.BaseClass;
import com.ec.pages.RegistrationPage;

public class TC_RegisterPage_02 extends BaseClass{
	
	@Test(priority = 1)
	public void test1() {
		TC_LinkTest_01 tc1=new TC_LinkTest_01();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		
		RegistrationPage rp=new RegistrationPage(driver);
        rp.registerUser("Chetan", "Jinde", "narayan21@gmail.com");
        
        rp.UserPass("7972842585@Cj", "7972842585@Cj");
        
        rp.register();
        
	}

	@Test(priority = 3)
	public void testUserVerify() {
		RegistrationPage rp=new RegistrationPage(driver);
		String actualUser=rp.user();
	    System.out.println("Actual user is :"+actualUser);
	    String expectUser="narayan21@gmail.com";
	    System.out.println("Expected user is :"+expectUser);
	    
	    Assert.assertEquals(actualUser, expectUser);
	    
	    
	}

}
