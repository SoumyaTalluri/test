Feature: Admin page
Scenario: Going to Admin page

Given User is login page
When title of page is orangehrm
Then Enter Username and password
And click on button

Given User is in Organisation page
When user is in general information page
Then Enter the details
And click on save button



