package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class CheckoutPage {
	
	public CheckoutPage() {
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	@FindBy(id="input-payment-firstname")
	public static WebElement firstNameField;
	
	@FindBy(id="input-payment-lastname")
	public static WebElement lastNameField;
	
	@FindBy(id="input-payment-address-1")
	public static WebElement addressField;
	
	@FindBy(id="input-payment-city")
	public static WebElement cityField;
	
	@FindBy(id="input-payment-postcode")
	public static WebElement postalCodeField;
	
	@FindBy(id="input-payment-country")
	public static WebElement countryField;
	
	@FindBy(id="input-payment-zone")
	public static WebElement regionStateField;
	
	@FindBy(id="button-payment-address")
	public static WebElement continueButton;	
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueButtonDeliveryDetails;
	
	@FindBy(id="button-shipping-method")
	public static WebElement continueButtonDeliveryMethod;
	
	@FindBy(name="agree")
	public static WebElement termsAndConditionsCheckBox;
	
	@FindBy(id="button-payment-method")
	public static WebElement continueButtonPaymentMethod;
	
	@FindBy(id="button-confirm")
	public static WebElement confirmOrderButton;
	
	public static void fillBillingDetails() {
		
		Waits.waitUntilElementLocated(10, continueButton);
		Elements.click(continueButton);
	
	}
	
	public static void fillDeliveryDetails() {
		
		Waits.waitUntilElementLocated(10, continueButtonDeliveryDetails);
		Elements.click(continueButtonDeliveryDetails);
		
	}
	
	public static void fillDeliveryMethodDetails() {
		
		Waits.waitUntilElementLocated(10, continueButtonDeliveryMethod);
		Elements.click(continueButtonDeliveryMethod);
	}
	
	public static void fillPaymentMethodDetails() {
		
		Waits.waitUntilElementLocated(10, termsAndConditionsCheckBox);
		Elements.click(termsAndConditionsCheckBox);
		Elements.click(continueButtonPaymentMethod);
		
	}
	
	public static void confirmTheOrder() {
		
		Waits.waitUntilElementLocated(10, confirmOrderButton);
		Elements.click(confirmOrderButton);
		
	}
	
	
	
}
