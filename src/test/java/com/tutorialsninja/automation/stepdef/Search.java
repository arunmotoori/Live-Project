package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersPage;
import com.tutorialsninja.automation.pages.SearchPage;

import cucumber.api.java.en.*;

public class Search {
	
	HeadersPage headersPage = new HeadersPage();
	SearchPage searchPage = new SearchPage();
	
	@When("^I search for a product say \"([^\"]*)\"$")
	public void i_search_for_a_product_say(String product)  {
		
		HeadersPage.searchProduct(product);
		   
	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results() {
		
		Assert.assertTrue(Elements.isDisplayed(SearchPage.samsungSyncMasterProduct));
	    
	}

}
