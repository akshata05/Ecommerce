Feature: Login in to account
		Exisitng user should be able to login to account using valid credentials
Background: 
Given User navigates to demoqa website
And User clicks on the login button 
And User enters a valid username

Scenario: Login in to account with valid credentials
And User enters a "Test12feb@123" password 
When User clicks on login button
Then User should be taken successful login page

Scenario: Login in to account with invalid credentials
And User enters a "invalid" password
When User clicks on login button
Then User should be presented with unsuccessful message