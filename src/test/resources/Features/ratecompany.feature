Feature: Rate Company functionality 
 
@tag1  #bugs
Scenario:
  verification of rate companies 
  
Given user on login page & login
When click on menu bar
Then click on Rated companies 

@tag2   
Scenario:
  verification of rating when you select any company 
  
Given user on login page & login
When click on marketplace & select company
Then click on Ratnign and verify 
