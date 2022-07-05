Feature: customer creation.
Background:
Given user open the broswer
When user enter the url as "http://127.0.0.1:81/login.do"
Then user enter the username as "admin" and password as "manager"
And user click on the login 
Then user verify the title of the webpage.

Scenario: create customer with valid crediantals
Then user click on projects and customers 
And user click on addnewcustomerbutton
Then user enter the customer name as "gtw"
And user click on create customer 
Then user retrive the success message 
And user click on logout
Then user close the broswer

Scenario Outline: creating multiple customer 
Then user click on projects and customers 
And user click on addnewcustomerbutton
Then user enter the customer name as "<customername>"
And user click on create customer 
Then user retrive the success message 
And user click on logout
Then user close the broswer

Examples:
|customername|
|khad786r@gmail.com|
|khaderbashsk8897gmail.com|
|khaderbashashaik9030@gmail.com|
||
