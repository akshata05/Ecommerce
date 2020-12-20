Feature: User should be able to search for book in Book Store


Scenario: Login in to account with valid credentials
Given User navigates to demoqa website
And User enters book name in search field
And User clicks on search button
Then User shoulde see the filtered book



Scenario: Login in to account with valid credentials
Given User navigates to demoqa website
And User clicks on the login button 
And User enters a valid username
And User enters a "Test12feb@123" password 
When User clicks on login button
Then User should be taken successful login page

