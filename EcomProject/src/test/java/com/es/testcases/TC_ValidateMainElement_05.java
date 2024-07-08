package com.es.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ec.base.BaseClass;
import com.ec.pages.HomePage;

public class TC_ValidateMainElement_05 extends BaseClass{

	@Test
	public void test1() {
		TC_LinkTest_01 tc1=new TC_LinkTest_01();
		tc1.linkTest();
	}

	@Test
	public void test2() {
		HomePage hp=new HomePage(driver);
		hp.validatetext();
	}
	
	@Test
	
	public void test3() {
		HomePage hp=new HomePage(driver);
		int expected =7;
		int actual=hp.elementCount();
		
		Assert.assertEquals(actual, expected);
	}
	
}
