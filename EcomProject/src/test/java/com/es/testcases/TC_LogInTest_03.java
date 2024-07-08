package com.es.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ec.base.BaseClass;
import com.ec.pages.LoginPage;



public class TC_LogInTest_03 extends BaseClass{
	public LoginPage lp;
	
	@Test(priority = 1)
	public void test1() {
		TC_LinkTest_01 tc1=new TC_LinkTest_01();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		lp=new LoginPage(driver);
		lp.loginCredentials("narayan21@gmail.com", "7972842585@Cj");
		lp.login();
	}
	
	@Test(priority = 3)
	public void test3() {
		lp=new LoginPage(driver);
		
		String actUserID=lp.accountVerify();
		System.out.println("Actual User ID is :"+actUserID);
		
		String expectedID="narayan21@gmail.com";
		System.out.println("Expected UserID i :"+expectedID);
		Assert.assertEquals(actUserID,expectedID );
		
		
	}
}
