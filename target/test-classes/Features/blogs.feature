Feature: Blogs functionality 
 
@tag1     
Scenario:
  verification of author is same when you click on blogs
   
Given user on login page
When click on blogs
Then verify blogs with how is posted

@tag2     
Scenario:
  verification of author name with title 
    
Given user on login page
When click on blogs
Then verify author name & title

@tag3     
Scenario:
  verification of author like functionality 
    
Given user on login page
When click on blogs
Then verify like icon in author page

@tag4     
Scenario:
  verification of posted blog is present with time anad date
    
Given user on login page
When click on blogs
Then verify blog with time and date



@tag6      
Scenario:
  verification of  write blogs is successfully written
    
Given user on login page
When click on blogs
When click on write blogs and fillup all field click on submit 
Then write blog is posted 


@tag7
Scenario: verification of after write blog then it should open write blog page

Given user on write blog page 
When user is sign out
When again user login with valied credential 
Then validate user on write blog page

@tag8     
Scenario:  verification of author information in blogs(Instead of "About me," write "About Blogger.")
    
Given user on login page
When click on blogs
Then verify visible author information
