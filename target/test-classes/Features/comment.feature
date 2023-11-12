Feature:Comment functionality 
 
@tag1     #new page not load sometime
Scenario:
  verification of comment  post in news 
    
Given user on login page & login
When  select any news and comment it
Then verify comment is successfully uploaded 


@tag2     
Scenario:
  verification of comment count is inceases  in news 
    
Given user on login page & login
When  select any news and comment it
Then verify comment count is increses

@tag3     
Scenario:
  verification of comment  post in blogs 
    
Given user on login page & login
When  select any blog and comment it 
Then verify comment is successfully uploaded in blogs


@tag4 #comment icon not clickable
Scenario:
  verification of option comment box in blogs 
    
Given user on login page & login
When  select any blog  
Then click on optinal comment icon