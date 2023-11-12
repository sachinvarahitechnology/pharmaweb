Feature:news functionality 
 
@tag1   
Scenario:

  verification of news is clilckble
  
Given user on login page
When click on news
Then verify all category is clickable

@tag2  
Scenario:

  verification of news is has different imgae
  
Given user on login page
When click on news
Then verify all images are different

@tag3 
Scenario Outline:
  verification of news seen by category
  
Given user on login page
When click on news
Then  news select by category


@tag4 
Scenario:
  verification of news seen with time
  
Given user on login page
When click on news
Then visible with time

@tag5   
Scenario Outline:
  verification of news seen with time
  
Given user on login page
When click on news
Then visible yesterday news


@tag6  #pending
Scenario:
  verification of news same when you scroll down & category wise
  
Given user on login page
When click on news
When scroll all category & count news
#Then same count for diff category section 