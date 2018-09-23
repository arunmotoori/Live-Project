package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class HeadersPage {
	
	public HeadersPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement myAccountLink;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	@FindBy(name="search")
	public static WebElement searchBox;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement searchButton;
	
	@FindBy(xpath="(//i[contains(@class,'fa-shopping-cart')])[1]")
	public static WebElement viewCartIconOption;
	
	public static void searchProduct(String product) {
		Waits.waitUntilElementLocated(10, searchBox);
		Elements.typeText(searchBox, product);
		Elements.click(searchButton);
		
	}
	
	public static void navigateToCartPage(){
		Waits.waitUntilElementLocated(10,viewCartIconOption);
		Elements.click(viewCartIconOption);
		
	}
	
}
