Feature: Registraiton functionality scenarios

Scenario: Verify whether the User is able to register into the Application by providing all the fields
	Given I launch the application
	And I navigate to Account Registration page
	When I provide all the below valid details
			|FirstName	|LastName	|Email								|Telephone	|Password	|
			|Ravi				|Kiran 		|ravi.kiran@gmail.com	|9243812312	|rkiran		|
	And I select the Privacy policy
	And I click on Continue button
	Then I should see that the User Account has successfully created 