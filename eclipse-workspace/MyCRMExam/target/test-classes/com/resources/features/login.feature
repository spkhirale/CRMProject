Feature: Simple Data Driven without Example keyword
Scenario: Free CRM Login Page
Given user is already on login page
When title of login page is Free CRM
Then user enters username and password
| username        | password |
| kiran@gmail.com | 123456   |
Then user clicks on login button
Then Open the home page 
Then click on user menu
Then click on add user
Then fill the value in form 
| uname    | mobile     | email             | pwd      |
| aniljha  | 3467823946 | anil237@gmail.com | anil123  |
#Then click on submit button
Then close the browser

#| username        | password | uname    | mobile     | email             | pwd      |
#| kiran@gmail.com | 123456   | aniljha  | 3467823946 | anil237@gmail.com | anil123  | 
#| anil@gmail.com  | 324562   | majnu    | 4563748901 | majnubhi@yahoo.in | manjnu45 |
                             
                             
                             