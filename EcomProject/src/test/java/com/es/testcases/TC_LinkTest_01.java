package com.es.testcases;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.ec.base.BaseClass;

public class TC_LinkTest_01 extends BaseClass{
//Inheritance parent to child
	
	@Test
	public void linkTest() {
	
	driver.get("https://demowebshop.tricentis.com/");
	}
}
