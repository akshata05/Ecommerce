Feature: when user adds arecord it should be availanle in table
Background: 
Given User navigates to demoqa website
And User selects Element Tab 

Scenario: Added record should be available in data table
Given User is in Webtable page 
And User clicks on add button  
And User enters data 
|Alex||Clare|ab@abc.com|23|23000|CS|      
When User clicks on submit button 
Then Records get saved
|Alex||Clare|ab@abc.com|23|23000|CS|


