Feature: search functionality 
 
@tag1  
Scenario: verification of company is search in marketplace
  
Given user on login page & login
When search company by name 
Then verify result get proper

@tag2  
Scenario:
  verification of product is search in marketplace
  
Given user on login page & login
When search product by name 
Then verify result get proper by product

@tag3  
Scenario:
  verification of location is search in marketplace
  
Given user on login page & login
When search company by location  
Then verify result get proper by location 

@tag4  
Scenario:
  verification of title is search in news
  
Given user on login page & login
When search company by title in news  
Then verify result get proper in newstitle 

@tag5
Scenario:    
  verification of category is search in news
  
Given user on login page & login
When search company by category in news  
Then verify result get proper in newscategory 


@tag6
Scenario:    
  verification of search in event by title/location
  
Given user on login page & login
When search company by title/location in event   
Then verify result get proper in event 


@tag7 #bug -result not found
Scenario:    
  verification of search blogs by title
  
Given user on login page & login
When search blogs by title    
Then verify result get proper in blogstitle