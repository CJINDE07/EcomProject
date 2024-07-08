package com.ec.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ec.base.BaseClass;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy (tagName = "a")
	List<WebElement> links;
	
	@FindBy (xpath = "//ul[@class='top-menu']/li")
	List<WebElement> mainElements;

	public int linkCount() {
	
	int totalLinks=links.size();
	return totalLinks;
}
	public int DispalyLinks() {
	int count=0;
	for(WebElement link:links)
	{
		if(link.isDisplayed()) {
			count++;
		}
	}
	return count;
}
	public void verifyLinks() {
	{
		for(WebElement elements:links)
			System.out.println(elements.getText());
		}
	}
	
	public int  elementCount() {
		int size=mainElements.size();
		return size;
	}
	
	public void validatetext() {
		for(WebElement element:mainElements) {
			System.out.println(element.getText());
		}
		
	}
}
