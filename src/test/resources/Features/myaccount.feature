Feature: myaccount functionality 

@tag1
Scenario: verification of myaccount
 
Given user on homepage 
When click on menu bar
When click on myaccount
Then open profilepage

@tag2 
Scenario: verification of myaccount image
 
Given open  on profilepage 
When click on pencil icon & attach image
Then verify image successfully uploaded    

@tag3  
Scenario: verification of update profile information
 
Given user on homepage 
When click on menu bar
Then click on myaccount & fillup all field
Then profile updated succesfully

@tag4 
Scenario Outline: verification of update phone number with valid data
  
Given user on profile page 
When edit phonenumber<phoneNumber>
Then profile updated succesfully

Examples:
|   phoneNumber 	|
|		9852365478		|


@tag5 #bug
Scenario Outline: verification of update phone number with invalid data
  
Given user on profile page 
When edit phonenumber<phoneNumber>
Then profile updated succesfully
Then get error 

Examples:
|   phoneNumber 	|
| 	125Sach	 			|
|	12365478963     |
|		$^&&*((				|


@tag8  
Scenario Outline: verification of update current position with valid data
  
Given user on profile page 
When edit currentposition <position>
Then profile updated succesfully
 
Examples:
|   position 	|
| 	 QA 			|
 

@tag9   #bug
Scenario Outline: verification of update current position with invalid data
  
Given user on profile page 
When edit currentposition<position>
Then profile updated succesfully
Then get error

Examples:
|   position 	|
| 	123654		|

@tag10 
Scenario Outline: verification of update education with valid data
  
Given user on profile page 
When edit education<education>
Then profile updated succesfully

Examples:
|   education   	|
|		BSC						|
 
 
 @tag11 #bug
Scenario Outline: verification of update education with invalid data
  
Given user on profile page 
When edit education<education>
Then profile updated succesfully
Then get error 

Examples:
|   education   	|
| 	125Sach	 			|
|		^&*(**((			|


@tag13 
Scenario Outline: verification of update location with valid data
  
Given user on profile page 
When edit location<location>
Then profile updated succesfully

Examples:
|   location   	|
|		Pune				|


 

 
 



