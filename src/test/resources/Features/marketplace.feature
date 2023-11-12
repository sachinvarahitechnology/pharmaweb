Feature: marketplace functionality 
 
@tag1  
Scenario: verification of marketplace category
  
Given user on login page
When click on market place
Then verify all category is clickable

@tag2  
Scenario Outline: verification of marketplace company sort by product
  
Given user on login page
When click on market place
When click on any category & search by product 
Then verify product is visible

@tag3 
Scenario: verification of chat functionality in marketplace company
  
Given user on login page
When click on market place
When click on any category & search by product
When click on any company 
Then check chat functionality 

@tag4  
Scenario: verification of mail functionality in marketplace company
  
Given user on login page
When click on market place
When click on any category & search by product
When click on any company 
Then check mail functionality 

@tag5  
Scenario Outline: verification of feature company in marketplace  
  
Given user on login page
When click on market place
Then check visiblility of the feature companies


@tag6  
Scenario: Show a message No Product List Available while loading the screen in products with no available products


Given user on login page
When click on market place
When click on any category & click on product
Then validate both are match
