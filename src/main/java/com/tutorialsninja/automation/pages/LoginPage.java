package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage() {
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	@FindBy(id="input-email")
	public static WebElement emailField;
	
	@FindBy(id="input-password")
	public static WebElement passwordField;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement loginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement warningMessage;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotPasswordLink;
	
	public static void doLogin(String username,String password) {
		
	     Elements.typeText(emailField,username);
	     Elements.typeText(passwordField,password);
	     Elements.click(loginButton);
		
	}
	
	public static boolean verifyErrorMessages(){
		
		boolean x = Elements.VerifyTextEquals(warningMessage,"Warning: No match for E-Mail Address and/or Password.");
		boolean y = Elements.VerifyTextEquals(warningMessage,"Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.");
		return x || y;
		
	}
	
	

}
