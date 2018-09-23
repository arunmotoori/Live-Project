package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeadersPage;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {
	
	LoginPage loginPage = new LoginPage();
	HeadersPage headersPage = new HeadersPage();
	SearchPage searchPage = new SearchPage();
	ShoppingCartPage viewCartPage = new ShoppingCartPage();
	CheckoutPage checkoutPage = new CheckoutPage();
	OrderSuccessPage orderSuccessPage = new OrderSuccessPage();
	
	@Given("^I login to the application$")
	public void i_login_to_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
		Elements.click(HeadersPage.myAccountLink);
		Elements.click(HeadersPage.login);
		LoginPage.doLogin();
	    
	}

	@When("^I add any product to Bag and checkout$")
	public void i_add_any_product_to_Bag_and_checkout()  {
		
		HeadersPage.searchProduct(Base.reader.getProduct());
		SearchPage.addFirstProductToCart();
		HeadersPage.navigateToCartPage();
		ShoppingCartPage.navigateToCheckoutPage();
		CheckoutPage.fillBillingDetails();
		CheckoutPage.fillDeliveryDetails();
		CheckoutPage.fillDeliveryMethodDetails();
		CheckoutPage.fillPaymentMethodDetails();
	    
	}

	@And("^I place an order$")
	public void i_place_an_order() {
		
		CheckoutPage.confirmTheOrder();
	    
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  {
		
		Waits.waitUntilElementLocated(10, OrderSuccessPage.successBreadCrumb);
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.successBreadCrumb));
	    
	}

}
