package com.ec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ec.base.BaseClass;

public class LoginPage extends BaseClass{
	

	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
		@FindBy (xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
		WebElement loginButton;
	
		@FindBy (id = "Email")
		WebElement UserId;
	
		@FindBy (id = "Password")
		WebElement  password;
		
		@FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
		WebElement logincontinue;
		
		@FindBy (xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
		WebElement account;
	
		
		public void loginCredentials(String id,String pass) {
			loginButton.click();
			UserId.sendKeys(id);
			password.sendKeys(pass);
			
		}
		
		public void login() {
			logincontinue.click();
		}
	
		public String accountVerify() {
			
			  String acc= account.getText();
			   
			   return acc;
		}

}
