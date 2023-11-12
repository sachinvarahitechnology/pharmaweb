Feature:Saved functionality 
 
@tag1
Scenario:
  verification of save functionality
  
Given user on login page & login
When click on menu bar
When click on saved itom
Then verify all feature are available in saved itom

@tag2
Scenario:
  verification of saved company is coming in saved itom feature
  
Given user on login page & login
When  select any company and save it
Then verify it is coming in saved itom or not

@show_message
Scenario:
  verification of  message when not saved any news in sved news item
  
Given user on login page & login
When click on menu bar
Then verify  message is disaplyed or not

@tag3  
Scenario:
  verification of saved news is coming in saved itom feature(internal save icon)
  
Given user on login page & login
When  select any news and save it
Then verify news is coming in saved itom or not

 
@tag4  
Scenario:
  verification of saved news is coming in saved itom feature(external save icon)
  
Given user on login page & login
When  select any news and click on external savedicon
Then verify news is coming in saved itom or not


@tag5  
Scenario:
  verification of saved event is coming in saved itom feature(internal save icon)
  
Given user on login page & login
When  select any event and save it
Then verify event is coming in saved itom or not

@tag6
Scenario:
  verification of saved event is coming in saved itom feature(external save icon)
  
Given user on login page & login
When  select any event and click on external savedicon
Then verify that event is coming in saved itom or not

@tag7 #bug blog in not clickble
Scenario:
  verification of saved blog is coming in saved itom feature(internal save icon)
  
Given user on login page & login
When  select any blogs and save it
Then verify blogs is coming in saved itom or not


@tag8 #bug blog in not clickble 
Scenario:
  verification of saved blog is coming in saved itom feature(external save icon)
  
Given user on login page & login
When  select any blogs and click on external saved icon
Then verify blogs is coming in saved itom or not

@tag9 # bug save icon not clickable   
Scenario:
  verification of author is saved
  
Given user on login page & login
When user on author page
Then click on save icon & verify it is saved

@tag10 # bug save icon not clickable   
Scenario:
  verification of save job in saved job feature(internal save icon) 
  
Given user on login page & login
When select any job & save it 
Then verify it is saved or not

@tag11 # bug save icon not clickable   
Scenario:
  verification of save job in saved job feature(external save icon) 
  
Given user on login page & login
When select any job & click on external save icon 
Then verify it is saved or not
