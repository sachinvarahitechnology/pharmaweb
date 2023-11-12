Feature: Event functionality 
 
@tag1   
Scenario: verification of event is clilckble

Given user on login page
When click on event
Then verify all category is clickable

@tag2
Scenario: verification of event visible with date
  
Given user on login page
When click on event
Then verify all event is display with date

@tag3   
Scenario: verification of Allevent is clickable 
   
Given user on login page
When click on event
Then verify all event is clickable

@tag4   
Scenario: verification of location is clickable
    
Given user on login page
When click on event
Then verify location is clickable

@tag5   
Scenario: verification of event with website its visible
    
Given user on login page
When click on event
Then verify event with its website

@advertisement
Scenario: add advertise instead of map in event

Given user on login page
When click on event
Then verify advertisement

@map
Scenario:  verify Map in eventdetails

Given user on login page
When click on event
When click on any event
Then verify map in eventdetails

