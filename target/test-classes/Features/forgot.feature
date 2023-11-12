Feature: Forgot functionality 
 
@tag1 #bug (submit not clickable		)
Scenario Outline:
  verification of forgot password otp on register mail id
  
Given user on login page
When   forgot password link
Then  enter register mail id<id>
Then click on submit button

Examples:
 |     id 							    			   |     
 |   sachin@varahitechnologies.com  |