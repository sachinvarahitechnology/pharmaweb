Feature: Job profile functionality 
 
@tag1
Scenario: verification of Job profile functionality
  
Given user on login page & login
When click on menu bar
Then click on job profile 

@tag2    
Scenario: verification of Job profile functionality when fill all mendatory data
  
Given user on login page & login
When click on edit button & fill mendatory data
Then click on update 

@tag3  #bug   
Scenario: verification of Job profile functionality when enter invalied mail id
  
Given user on login page & login
When click on edit button &  enter valied mailid 
Then click on update

@tag4     
Scenario: verification of Job profile functionality when enter valied phoneNumber
  
Given user on login page & login
When click on edit button &  enter valied phonenumber 
Then click on update  

@tag5    #bug 
Scenario: verification of Job profile functionality when enter invalied phoneNumber
  
Given user on login page & login
When click on edit button &  enter invalied phonenumber 
Then click on update  

@tag6     
Scenario: verification of Job profile functionality when enter valied current position
  
Given user on login page & login
When click on edit button & enter valied position
Then click on update  

@tag7     
Scenario: verification of Job profile functionality when enter valied education
  
Given user on login page & login
When click on edit button & enter valied education 
Then click on update  

@tag8     
Scenario: verification of Job profile functionality when enter valied location
  
Given user on login page & login
When click on edit button & enter valied location 
Then click on update  

@tag9     
Scenario: verification of Job profile functionality when enter same phonenumber
  
Given user on login page & login
When click on edit button & enter same phonenumber 
Then click on update 


@tag10     
Scenario: verification of Job profile functionality when enter valied Address
  
Given user on login page & login
When click on edit button & enter valied address 
Then click on update

@tag11     
Scenario: verification of Job profile functionality when enter valied website
  
Given user on login page & login
When click on edit button & enter valied website 
Then click on update


 