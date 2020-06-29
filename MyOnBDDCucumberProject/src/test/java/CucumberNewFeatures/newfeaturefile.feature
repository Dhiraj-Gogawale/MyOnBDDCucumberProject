Feature: Free CRM Login Feature


Scenario: Enter Deals Details of User by using List

Given user is Already on Login Page
When title of login page is Free CRM
Then user enters username and password
| dhiraj.gogawale08@gmail.com | DhirajCRM |
Then user clicks on login button
And user is on home page and click Deals
| test deals |




Scenario: Enter Deals Details of User using Map

Given user is Already on Login Page Using Map
When title of login page is Free CRM Using Map
Then user enters username and password Using Map
| username | password |
| dhiraj.gogawale08@gmail.com | DhirajCRM |
Then user clicks on login button _Using_Map
And user is on home page and click Deals Using Map
| title |
