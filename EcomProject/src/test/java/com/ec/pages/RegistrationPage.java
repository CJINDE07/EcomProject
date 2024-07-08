package com.ec.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.fedcm.model.Account;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ec.base.BaseClass;

public class RegistrationPage extends BaseClass{
	
	public RegistrationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	   @FindBy (xpath = "//a[@class='ico-register']")
	   WebElement registerButton;
	   
	   @FindBy (id = "gender-male")
	   WebElement radio;
	   
	   @FindBy (id = "FirstName")
	   WebElement firstname;
	   
	   @FindBy (id = "LastName")
	   WebElement lastname;
	   
	   @FindBy (id = "Email")
	   WebElement email;
	   
	   @FindBy (id = "Password")
	   WebElement password;
	   
	   @FindBy (id = "ConfirmPassword")
	   WebElement Confirmpass;
	   
	   @FindBy (id = "register-button")
	   WebElement register;
		

		@FindBy (xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
		WebElement account;
		
	    public void registerUser(String first,String last,String mail) {
	    	registerButton.click();
	    	radio.click();
	    	firstname.sendKeys(first);
	    	lastname.sendKeys(last);
	    	email.sendKeys(mail);
	    }
	    
	    public void UserPass(String pass,String ConfirmPass) {
	    	password.sendKeys(pass);
	    	Confirmpass.sendKeys(ConfirmPass);
	    }
	
	   public void register() {
		   register.click();
	   }
	   
	   public String user() {
	   String acc= account.getText();
	   
	   return acc;
	   }
}
