Feature:homepage functionality 
 
@tag1
Scenario: verification of company logo
 
Given user on login page & login
Then  user on homepage
Then logo is displayed

@tag2
Scenario: verification of marketplace is clickable
 
Given user on login page & login
Then  user on homepage
Then  click on marketplace
Then verify feature is open


@tag3
Scenario: verification of event is clickable
 
Given user on login page & login
Then  user on homepage
Then  click on event
Then verify event feature is open
 
@tag4
Scenario: verification of news is clickable
 
Given user on login page & login
Then  user on homepage
Then  click on news
Then verify news feature is open

@tag5
Scenario: verification of blogs is clickable
 
Given user on login page & login
Then  user on homepage
Then  click on blogs
Then verify blogs feature is open
  
@tag6
Scenario: verification of jobs is clickable
 
Given user on login page & login
Then  user on homepage
Then  click on jobs
Then verify jobs feature is open

@tag7
Scenario: verification of All is clickable
 
Given user on login page & login
Then  user on homepage
Then  click on All
Then verify All feature is open

@tag8
Scenario: verification of notification is displayed
 
Given user on login page & login
Then  user on homepage
Then  click on notification icon
Then verify notification is visible
