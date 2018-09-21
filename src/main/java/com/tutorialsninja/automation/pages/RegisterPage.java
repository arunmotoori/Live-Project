package com.tutorialsninja.automation.pages;

import java.util.Map;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(css="input[type='Submit'][value='Continue']")
	public static WebElement continueButton;
	
	@FindBy(linkText="Register")
	public static WebElement registerBreadCrumb;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstnameWarning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement lastnameWarning;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement emailWarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephoneWarning;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordWarning;
	
	@FindBy(css="label[class='radio-inline']:first-child")
	public static WebElement yesToNewsletter;
	
	public static void enterAllDetails(DataTable dataTable) {
		
		Map<String,String> map = dataTable.asMap(String.class, String.class);
		Elements.typeTextIfElementPresent(firstName,map.get("FirstName"));
		Elements.typeTextIfElementPresent(lastName,map.get("LastName"));
		Elements.typeTextIfElementPresent(email,System.currentTimeMillis()+map.get("Email"));
		Elements.typeTextIfElementPresent(telephone,map.get("Telephone"));
		Elements.typeTextIfElementPresent(password, map.get("Password"));
		Elements.typeTextIfElementPresent(confirmPassword, map.get("Password"));
		
	}
	
	
	public static void enterDuplicateDetails(DataTable dataTable) {
		
		Map<String,String> map = dataTable.asMap(String.class, String.class);
		Elements.typeTextIfElementPresent(firstName,map.get("FirstName"));
		Elements.typeTextIfElementPresent(lastName,map.get("LastName"));
		Elements.typeTextIfElementPresent(email,map.get("Email"));
		Elements.typeTextIfElementPresent(telephone,map.get("Telephone"));
		Elements.typeTextIfElementPresent(password, map.get("Password"));
		Elements.typeTextIfElementPresent(confirmPassword, map.get("Password"));
		
	}
	
}
