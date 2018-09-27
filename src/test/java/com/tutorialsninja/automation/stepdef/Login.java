package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeadersPage;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	HeadersPage headerPage=new HeadersPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	LoginPage loginPage = new LoginPage();
	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
	
	@And("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page() {
		Elements.click(HeadersPage.myAccountLink);
		Elements.click(HeadersPage.login);
	   
	}

	@When("^I login to the application using username as \"([^\"]*)\" and valid password as \"([^\"]*)\"$")
	public void i_login_to_the_application_using_username_as_and_valid_password_as(String username, String password)  {
		
		LoginPage.doLogin(username,password);
	    
	}


	@Then("^I should see that the User should be able to successfully login$")
	public void i_should_see_that_the_User_should_be_able_to_successfully_login()  {
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.affiliateRegistrationLink));
	   
	}
	
	@Then("^I should see an error message informing about invalid credentials$")
	public void i_should_see_an_error_message_informing_about_invalid_credentials()  {
		
		Assert.assertTrue(LoginPage.verifyErrorMessages());
	    
	}
	
	@When("^I reset the forgoten password for the email address \"([^\"]*)\"$")
	public void i_reset_the_forgoten_password_for_the_email_address(String email)  {
		
		Elements.click(LoginPage.forgotPasswordLink);
		ForgotPasswordPage.resetPassword(email);
	}

	@Then("^I should see a message informing that the details have been sent to the email address$")
	public void i_should_see_a_message_informing_that_the_details_have_been_sent_to_the_email_address() {
	   
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.warningMessage,"An email with a confirmation link has been sent your email address."));
		
	}

}
