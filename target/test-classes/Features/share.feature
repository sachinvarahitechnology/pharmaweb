Feature:Share functionality 
 
@tag1    
Scenario Outline:
  verification of share icon
    
Given user on login page
When click on market place
When select any company & go company profile
Then click on share icon

@tag2    
Scenario:
  verification of share marketplace 
    
Given user on login page
When click on market place
When select any company & go company profile
Then click on share icon
Then share diff media & get title 

@tag3    
Scenario Outline:
  verification of share functionality in news(#internal)
    
Given user on login page
When click on news
When click on any news 
Then click on share icon
Then share diff media & get title

@tag4    
Scenario:
  verification of share functionality in news(#external)
    
Given user on login page
When click on news
Then click on share icon first news
Then share diff media & get title 

@tag5    
Scenario Outline:
  verification of share functionality in event(#internal)
    
Given user on login page
When click on event
When click on any event
Then click on share icon 
Then share diff media & get title 

@tag6    
Scenario Outline:
  verification of share functionality in event(#external)
    
Given user on login page
When click on event
Then click on share icon first event
Then share diff media & get title 

@tag7    
Scenario Outline:
  verification of share functionality in blogs(#internal)
    
Given user on login page
When click on blogs
When click on any blogs
Then click on share icon 
Then share diff media & get title

@tag8    
Scenario Outline:
  verification of share functionality in blogs(#external)
    
Given user on login page
When click on blogs
Then click on share icon first blogs
Then share diff media & get title 

@tag9    #bug -share icon not clickable
Scenario Outline:
  verification of share functionality in blogs author page 
    
Given user on login page
When click on blogs
When click on any blogs
Then  click on author name
Then share diff media & get title
 
  