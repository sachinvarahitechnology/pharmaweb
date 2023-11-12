Feature: login functionality 
 
@tag1
Scenario Outline:
 user should be login with valid data
 
Given user on login page
When  user provide <username>and <password> 
And  click on button
Then login successfully 

 Examples:
 |username                        |    password   |   
 |"tejaswinipawara29@gmail.com"|   "Tanavi@123"  	|
 | "sachin@varahitechnologies.com"| 	"123456@"	|
 
 
@tag2 
 Scenario Outline:
  user should be login with valid mailid and invalid password 
 
Given user on login page
When  user provide <username>and <password> 
And  click on button
Then  get error

 Examples:
 |username                        |    password   |   
 |"tejaswinipawara29@gmail.com"   |   "Tanavi@12" |
 | "sachin@varahitechnologies.com"| 	"123456@"  |

@tag3
 Scenario Outline:
 user should be login with invalid mailid and valid password 
  
  Given user on login page
When  user provide <username>and <password> 
And  click on button
Then  get error

 Examples:
 |username                        |    password    |   
 |"tejaswinipawara29@gmailc.om"   |   "Tanavi@123" |
 | "sachin@varahitechnologiesco.m"| 	"1234566@"   |
 
@tag4
 Scenario Outline:
  user should be login with invalid mailid and invalid password 
  
  Given user on login page
When  user provide <username>and <password> 
And  click on button
Then  get error

 Examples:
 |username                        |    password   |   
 |"tejaswinipawara29@gmailc.om"   |   "Tanavi@123" |
 | "sachin@varahitechnologiesco.m"| 	"123456"    |
 
 @tag6
 Scenario Outline:
   verification of remember button
   
  Given user on login page  
  When  user provide <username>and <password>
  Then click on remember button
  Examples:
 |username                        |    password   |   
 |"sachin@varahitechnologies.com" |   "1234566@"  |
 
 
 @tag7
 Scenario Outline:
   verification of term & condition link
   
  Given user on login page  
  When  user provide <username>and <password>
  Then  click on term & condition link
  Then  open all term & condition policy
  Examples:
 |username                        |    password   |   
 |"sachin@varahitechnologies.com" |   "1234566@"  |
 
  @tag8
 Scenario Outline:
   verification of eyes icon
   
  Given user on login page  
  When  user provide <username>and <password>
  Then  click on eyes icon
  Then  password is displayed
  Examples:
 |username                        |    password   |   
 |"sachin@varahitechnologies.com" |   "1234566@"  |
 
 
@tag9
Scenario Outline:
 user should be login with valid data
 
Given user on login page
When  user provide <username>and <password> 
And  click on button
Then login successfully 

 Examples:
 |username                        |    password   |   
 |"tejaswinipawara29@gmail.com"|   "Tanavi@123"  	|
 | "sachin@varahitechnologies.com"| 	"1234566@"	|
 
@display_message 
Scenario Outline:
 If the email is not registered, display a message asking the user to register
 
Given user on login page
When  user provide <username>and <password> 
Then get message 

 Examples:
 |username                        |    password   |   
 |"sandeep@varahitechnologies.com"| 	"1234566@"	|
 