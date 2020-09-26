Feature: User add multiple items in Compare List

Scenario: User select Summer Dresses

Given user is on home page
When user select on summer dresses 
And add first dress to compare list 
And add second dress to compare list
And add third third to compare list
And user ensure the name of selected dresses
And user compare between their prices 
And user ensure that features components for each dress is displayed
Then user add choosen dress to cart