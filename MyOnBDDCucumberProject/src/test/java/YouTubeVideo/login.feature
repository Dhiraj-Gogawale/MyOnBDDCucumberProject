Feature: Free CRM Login Feature

Scenario: Free CRM Login Test Scenario

Given user is Already on Login Page
When title of login page is Free CRM
Then user enters username and password
Then user clicks on login button
And user is on home page


Scenario: Home Page Test Scenario

Given user is Already on Login Pageone
When title of login page is Free CRMone
Then user enters username and passwordone
Then user clicks on login buttonone
Given user is Already on Home Page
Then user clicks on Calendar
And user clicks on Contacts


#To Comment in Feature File use hash

# Simple Data Driven – without Examples Keyword
Scenario: Simple data Driven Without Example Keywords

Given user is Already on Login Page SDDWOEK
When title of login page is Free CRM SDDWOEK
Then SDDWOEK user enters "dhiraj.gogawale08@gmail.com" and "DhirajCRM"
Then user clicks on login button SDDWOEK
And user is on home page SDDWOEK



# Simple Data Driven – with Examples Keyword
# Note if we are using Examples Keyword then we have to use Scenario Outline.
Scenario Outline: Simple data Driven With Examples Keyword

Given user is Already on Login Page With Examples Keyword
When title of login page is Free CRM With Examples Keyword
Then user enters "<username>" and "<password>" With Examples Keyword

Examples:
     | username | password |
     | dhiraj.gogawale08@gmail.com | DhirajCRM |
     | sooraj.kurup@gmail.com | SoorajCRM |
     | tom.t@gmail.com | tomCRM |
     | sam.s@gmail.com | samCRM |
     
     
     
 Scenario Outline: Simple data Driven With Examples Keyword Enter Contact Details
 
Given user is Already on Login Page With Examples KeywordTwo
When title of login page is Free CRM With Examples KeywordTwo
Then user enters "<username>" and "<password>" With Examples KeywordTwo
Then user clicks on login button ith Examples KeywordTwo
And user is on home page With Examples KeywordTwo
And user clicks on Contacts button With Examples KeywordTwo
Then user enters the "<firstname>" and "<lastname>" and "<companyname>" With Examples KeywordTwo

Examples:
     | username | password | firstname | lastname | companyname |
     | dhiraj.gogawale08@gmail.com | DhirajCRM | Dhiraj | Gogawale | Wipro |
     
