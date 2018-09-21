package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ForgotPasswordPage {
	
	public ForgotPasswordPage() {
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	@FindBy(id="input-email")
	public static WebElement emailField;
	
	@FindBy(css="input[class$='btn-primary']")
	public static WebElement continueButton;
	
	public static void resetPassword(String email) {
		
		Elements.typeText(emailField,email);
		Elements.click(continueButton);
		
	}
	

}
