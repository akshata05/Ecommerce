Feature: Add book to cart
		Logged in user should be able to add books to cart
Background: 
Given User navigates to demoqa website
And User clicks on the login button 
And User enters a valid username
And User enters a "Test12feb@123" password 
When User clicks on login button
Then User should be taken successful login page

Scenario Outline: User can add books to cart
And User selects book "<book>"  
When User clicks on Add To Cart button
And User accepts the alert 
Then The books get added to cart
Examples:
		|book|
		|Git Pocket Guide|
		|Speaking JavaScript|