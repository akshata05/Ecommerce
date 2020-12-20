Feature: User should be able to search for book in Book Store

Background:
Given User navigates to demoqa website
And User selects Element Tab 

Scenario: Check the check box
And User navigates to checkbox menu 
And User checks the home checkbox


Scenario: Select radio button
And User navigates to radio menu  
When User checks the yes radio option
Then A message is displayed "You have selected Yes"
