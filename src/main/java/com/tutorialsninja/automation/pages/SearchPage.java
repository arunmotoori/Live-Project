package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class SearchPage {

	public SearchPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement samsungSyncMasterProduct;
	
	@FindBy(css="input[id='button-search']+h2+p")
	public static WebElement noResultsMessage;
	
	@FindBy(xpath="(//span[text()='Add to Cart'])[1]")
	public static WebElement addToCartFirstOption;
	
	public static void addFirstProductToCart() {
		
		Waits.waitUntilElementLocated(10,addToCartFirstOption);
		Elements.click(addToCartFirstOption);
	
	}
	
	
	
	
}
