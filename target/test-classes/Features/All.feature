Feature: All functionality 
 
@tag1    
Scenario:
  verification of author is same when you click on blogs
    
Given user on login page
When click on all
Then verify all features show shortly

@tag2    
Scenario:  verification of  view all button
    
Given user on login page
When click on all
Then verify all icon is clickable
Then verify is go their redirect page

@tag3   
Scenario:  verification of  Dummy blog image comes or not

Given user on view all page
Then validate image is same or not 

@tag4
Scenario:  verification of  author name & timing are mismatch or not

Given user on view all page
When author name in blogs 
Then when you click on blog author name is same or not
