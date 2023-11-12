Feature:Setting functionality 
 
@tag1 #bug
Scenario:
  verification of  setting options
  
Given user on login page & login
When click on menu bar & click ion setting
Then verify all feature is prese or not


@tag2 
Scenario:
  verification of change pass in setting 
  
Given user on login page & login
When click on menu bar & click ion setting
Then click on change password & verify password is change

@tag3 #bug
Scenario:
  verification of rate us functionality
  
Given user on login page & login
When click on menu bar & click ion setting
Then click on rate Us option 

@tag4
Scenario:
  verification of privacy & policy functionality
  
Given user on login page & login
When click on menu bar & click ion setting
Then click on privacy and verify

@tag5 #bug
Scenario:
  verification of help functionality
  
Given user on login page & login
When click on menu bar 
Then click on help & verify

@tag6 #bug
Scenario:
  verification of contactUs functionality
  
Given user on login page & login
When click on menu bar 
Then click on contactUs & verify 


@tag7 #bug not clickable
Scenario:
  verification of notification in setting 
  
Given user on login page & login
When click on menu bar & click ion setting
Then click on notification



 