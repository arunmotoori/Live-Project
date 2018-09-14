package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.config.PropertyFileReader;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.reader=new PropertyFileReader();
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
		
		
	    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable arg1) {
		
		
	   
	}

	@When("^I select the Privacy policy$")
	public void i_select_the_Privacy_policy()  {
		
		
	   
	}

	@When("^I click on Continue button$")
	public void i_click_on_Continue_button()  {
		
		
	    
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created() {
		
		
		
		
	    
	}

}
