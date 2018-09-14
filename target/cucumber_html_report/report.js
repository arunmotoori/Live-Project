$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registraiton functionality scenarios",
  "description": "",
  "id": "registraiton-functionality-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify whether the User is able to register into the Application by providing all the fields",
  "description": "",
  "id": "registraiton-functionality-scenarios;verify-whether-the-user-is-able-to-register-into-the-application-by-providing-all-the-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Account Registration page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I provide all the below valid details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Telephone",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "Ravi",
        "Kiran",
        "ravi.kiran@gmail.com",
        "9243812312",
        "rkiran"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select the Privacy policy",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should see that the User Account has successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 249609980,
  "error_message": "java.lang.NullPointerException\r\n\tat com.tutorialsninja.automation.stepdef.Register.i_launch_the_application(Register.java:18)\r\n\tat ✽.Given I launch the application(FeatureFiles/Register.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Register.i_navigate_to_Account_Registration_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.i_provide_all_the_below_valid_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.i_select_the_Privacy_policy()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.i_click_on_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.i_should_see_that_the_User_Account_has_successfully_created()"
});
formatter.result({
  "status": "skipped"
});
});