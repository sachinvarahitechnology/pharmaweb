Feature:signUP functionality 
 
@tag1
Scenario Outline:
  verification of sign up link
  
Given user on login page
When  click on sign up link 
Then  signup page is open
 
 
@tag2
Scenario:

  verifiction of get error when all required field by not entering the data
  
Given user on login page
When  click on sign up link 
Then  signup page is open
Then  click on sign up button
Then get error

@tag3
Scenario:

  verifiction of sign up successfully when all required field entering the data
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter all mendatory data
And click on sign up button

@tag4
Scenario Outline:
  verification first name in sign up with valid name
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter first name<firstname>
And click on sign up button

 Examples:
 | firstname   |     
 |  Sachin     |
  
@tag5   #Bug
Scenario Outline:
  verification first name in sign up with numeric value & special symbol
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter first name<firstname>
And click on sign up button
And get errorr

 Examples:
 | firstname   |     
 | 123456      |
 | $%^&**      |
 
 @tag7
Scenario Outline:
  verification last name in sign up with valid name
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter last name<lastname>
And click on sign up button

 Examples:
 | lastname    |     
 |  gadekar    |
 
@tag8 #bug
Scenario Outline:
  verification last name in sign up with numeric value & special symbol
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter last name<lastname>
And click on sign up button
And get errorr

 Examples:
 | lastname    |     
 | 123456      |
 | $%^&**      |
 
@tag10
Scenario Outline:
  verification user name in sign up with valid name
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter user name<username>
And click on sign up button

 Examples:
 |   username         |     
 |  Sachin gadekar    |


 @tag11 #bug
Scenario Outline:
  verification user name in sign up with numeric value & special symbol
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter user name<username>
And click on sign up button
And get errorr

 Examples:
 | username    |     
 | 123456      |
 | $%^&**      |
 
 
 @tag14
Scenario Outline:
  verification phone number in sign up with valied data
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter  mobile number<number>
And click on sign up button
 
 Examples:
 | number      |     
 | 1234561123  |
 
 @tag15
Scenario Outline:
  verification mailid in sign up with invalied data
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter invalie mailid<id>
And click on sign up button
And get errorr

 Examples:
 | id      |     
 | sachin   |
 
 @tag16
Scenario Outline:
  verification mail id in sign up with valied data
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter  valid mail id<id>
And click on sign up button
 
 Examples:
 | id      |     
 | sachin@varahitechnologies.com  |
 | pradnya@varahitechnologies.com |
 
 @tag18
Scenario Outline:
  verification company name in sign up with valied data
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter  valid  company name<company_name>
And click on sign up button
 
 Examples:
 | company_name       |     
 |  varahi technology  |

@tag19 #bug
Scenario Outline:
  verification company name sign up with invalied data
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter invalie company name<companyname>
And click on sign up button
And get errorr

 Examples:
 | companyname   |     
 | 12563*0       |
 
 @tag20
Scenario Outline:
  verification designation name in sign up with valied data
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter  valid  designation name<designation_name>
And click on sign up button
 
 Examples:
 |  designation_name      |     
 |  QA Tester				      |
 
 @tag21 #bug
Scenario Outline:
  verification designation name sign up with invalied data
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter invalie designation name<designation_name>
And click on sign up button
And get errorr

 Examples:
 |  designation_name   |     
 |   125635236         |
 
 @tag22
Scenario Outline:
  verification password sign up with less than 8 cherecter
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter password<password_2>
And click on sign up button
And get errorr

 Examples:
 |  password_2   |     
 |    Sac@950    |
 |   Hello9503   |
  
 
 
 @tag24
Scenario Outline:
  verification of tab functionality in sign up page
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
And use tab functionality  
 
 @tag26
Scenario Outline:
  verification confirm password same as password
  
Given user on login page
When  click on sign up link 
Then  signup page is open 
Then enter password<password_2>
And enter conform password<confirm_password_2>
And validate both same or not
 
 Examples:
 |  password_2   | confirm_password_2  |  
 |    Sachin@950 |   Sachin@950        |
