package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersPage;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	
	HeadersPage headersPage = new HeadersPage();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		//Base.reader=new PropertyFileReader();
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
		
		Elements.click(HeadersPage.myAccountLink);
		Elements.click(HeadersPage.register);
		
	    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {
		
		RegisterPage.enterAllDetails(dataTable);
	   
	}

	@When("^I select the Privacy policy$")
	public void i_select_the_Privacy_policy()  {
		
		Elements.click(RegisterPage.privacyPolicy);
	   
	}

	@When("^I click on Continue button$")
	public void i_click_on_Continue_button()  {
		
		Elements.click(RegisterPage.continueButton);
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created() {
		
		Elements.isDisplayed(AccountSuccessPage.successBreadCrumb);
	    
	}
	
	@When("^I click on Continue button without providing anything into the mandatory fields$")
	public void i_click_on_Continue_button_without_providing_anything_into_the_mandatory_fields() {
		
		Elements.click(RegisterPage.continueButton);
	   
	}

	@Then("^I should see that the User Account should not be created$")
	public void i_should_see_that_the_User_Account_should_not_be_created()  {
		
		Elements.isDisplayed(RegisterPage.registerBreadCrumb);
	    
	}

	@And("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields()  {
	
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainWarning,"Warning: You must agree to the Privacy Policy!"));
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.firstnameWarning,"First Name must be between 1 and 32 characters!"));
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.lastnameWarning,"Last Name must be between 1 and 32 characters!"));
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.emailWarning,"E-Mail Address does not appear to be valid!"));
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.telephoneWarning,"Telephone must be between 3 and 32 characters!"));
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.passwordWarning,"Password must be between 4 and 20 characters!"));

	}
	
	@And("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() {
		
		Elements.click(RegisterPage.yesToNewsletter);
	   
	}
	
	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(DataTable dataTable)  {
		
		RegisterPage.enterDuplicateDetails(dataTable);
	    
	}
	
	@Then("^I should see the warning message that the user is already created$")
	public void i_should_see_the_warning_message_that_the_user_is_already_created()  {
		
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainWarning,"Warning: E-Mail Address is already registered!"));
		 
	}

}
