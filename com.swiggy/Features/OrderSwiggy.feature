Feature: Order food in swiggy

Scenario: Order food in swiggy
Given user in the landing page 
When he type delivery location as Hyderabad and select the first option from the auto-complete box
And Click on the first restaurant shown under Top restaurant chains in Hyderabad'
And Click on Add button corresponding to first listed dish
And Hover over Cart in the top right corner
And Click on Check Out in the sub-menu
Then Verify the text "To place your order now, log in to your existing account or sign up." Is visible on next page