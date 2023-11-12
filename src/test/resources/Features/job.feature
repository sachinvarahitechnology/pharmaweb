Feature: Jobs functionality 
 						

@tag1
Scenario: verification of jobs only Name & review show

Given user on login page & login
When click on job 
Then  verify job name & review is showing

 
@logo
Scenario: Fix the logo not showing on the job list page
  
Given user on login page & login
When click on job
Then  verify job logo


@rating_feature 
Scenario: Implement the rating feature for the job list. 
Given user on login page & login
When click on job
When click on any job
Then validate rateus function

@add_review 
Scenario: validate review when you post it 
 
Given user on login page & login
When click on job
When add review
Then validate  you review

@Job_post 
Scenario: validate Job Post
 
Given user on login page & login
When click on job
When post job functionality
Then verify it is uploded or not

@use_filter 
Scenario: validate result when you use filter
 
Given user on login page & login
When click on job
When click on filter 
Then put credential validate result
