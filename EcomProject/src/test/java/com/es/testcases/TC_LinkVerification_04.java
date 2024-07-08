package com.es.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ec.base.BaseClass;
import com.ec.pages.HomePage;

public class TC_LinkVerification_04 extends BaseClass{
	
	@Test
	public void test1() {
		TC_LinkTest_01 tc1=new TC_LinkTest_01();
		tc1.linkTest();
	}
	@Test
	public void test2() {
		HomePage hp=new HomePage(driver);
		
		int expectedLinks=95;
		System.out.println("expected links ="+expectedLinks);
		int acutalLinks=hp.linkCount();
		System.out.println("Actual links = "+acutalLinks);
		
		Assert.assertEquals(acutalLinks, expectedLinks);
	}
	
	@Test
   public void test3() {
	   HomePage hp=new HomePage(driver);
	   int Display=hp.DispalyLinks();
	   System.out.println("The Display Links Count = "+Display);
	   
	   
   }
}
