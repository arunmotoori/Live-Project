$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality scenarios",
  "description": "",
  "id": "login-functionality-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16148845544,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Verify whether the User is able to login with valid credentials"
    },
    {
      "line": 4,
      "value": "#\tGiven I launch the application"
    },
    {
      "line": 5,
      "value": "#\tAnd I navigate to Account Login page"
    },
    {
      "line": 6,
      "value": "#\tWhen I login to the application using username as \"ravi.kiran1@gmail.com\" and valid password as \"rkiran\""
    },
    {
      "line": 7,
      "value": "#\tThen I should see that the User should be able to successfully login"
    },
    {
      "line": 9,
      "value": "#Scenario: Verify that the User is not able to login with invalid credentials"
    },
    {
      "line": 10,
      "value": "#\tGiven I launch the application"
    },
    {
      "line": 11,
      "value": "#\tAnd I navigate to Account Login page"
    },
    {
      "line": 12,
      "value": "#\tWhen I login to the application using username as \"abcd@gmail.com\" and valid password as \"rkiran\""
    },
    {
      "line": 13,
      "value": "#\tThen I should see an error message informing about invalid credentials"
    },
    {
      "line": 14,
      "value": "#"
    },
    {
      "line": 15,
      "value": "#Scenario: Verify that the User is not able to login without providing credentials"
    },
    {
      "line": 16,
      "value": "#\tGiven I launch the application"
    },
    {
      "line": 17,
      "value": "#\tAnd I navigate to Account Login page"
    },
    {
      "line": 18,
      "value": "#\tWhen I login to the application using username as \"\" and valid password as \"\""
    },
    {
      "line": 19,
      "value": "#\tThen I should see an error message informing about invalid credentials"
    }
  ],
  "line": 21,
  "name": "Verify whether User is able to reset his forgoten password",
  "description": "",
  "id": "login-functionality-scenarios;verify-whether-user-is-able-to-reset-his-forgoten-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I navigate to Account Login page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I reset the forgoten password for the email address \"ravi.kiran@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I should see a message informing that the details have been sent to the email address",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 13458703355,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_navigate_to_Account_Login_page()"
});
formatter.result({
  "duration": 4243266855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravi.kiran@gmail.com",
      "offset": 53
    }
  ],
  "location": "Login.i_reset_the_forgoten_password_for_the_email_address(String)"
});
formatter.result({
  "duration": 2840150550,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_should_see_a_message_informing_that_the_details_have_been_sent_to_the_email_address()"
});
formatter.result({
  "duration": 68395558,
  "status": "passed"
});
formatter.after({
  "duration": 2224693160,
  "status": "passed"
});
});