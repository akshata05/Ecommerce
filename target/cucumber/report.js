$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login in to account",
  "description": "Exisitng user should be able to login to account using valid credentials",
  "id": "login-in-to-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7603848200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to demoqa website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_demoqa_website()"
});
formatter.result({
  "duration": 6242155400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 160480300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_username()"
});
formatter.result({
  "duration": 367613100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login in to account with valid credentials",
  "description": "",
  "id": "login-in-to-account;login-in-to-account-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User enters a \"Test12feb@123\" password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should be taken successful login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Test12feb@123",
      "offset": 15
    }
  ],
  "location": "LoginSteps.user_enters_a_valid_password(String)"
});
formatter.result({
  "duration": 384328300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 277569100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_taken_successful_login_page()"
});
formatter.result({
  "duration": 200523300,
  "status": "passed"
});
formatter.after({
  "duration": 913979600,
  "status": "passed"
});
formatter.before({
  "duration": 5830565100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to demoqa website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_demoqa_website()"
});
formatter.result({
  "duration": 6361682300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 244679200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_username()"
});
formatter.result({
  "duration": 401973000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login in to account with invalid credentials",
  "description": "",
  "id": "login-in-to-account;login-in-to-account-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User enters a \"invalid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should be presented with unsuccessful message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 15
    }
  ],
  "location": "LoginSteps.user_enters_a_valid_password(String)"
});
formatter.result({
  "duration": 351957600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 359772700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_presented_with_unsuccessful_message()"
});
formatter.result({
  "duration": 201385900,
  "status": "passed"
});
formatter.after({
  "duration": 922304900,
  "status": "passed"
});
});