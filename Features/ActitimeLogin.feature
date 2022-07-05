Feature: loginfeature.
Background:
 Given user open the broswer
When user enter the url as "http://127.0.0.1:81/login.do"


Scenario: login with valid crenditals.
Then user enter the username as "admin" and password as "manager"
And user click on the login 
Then user verify the title of the webpage.
And user click on logout 
Then user close the broswer

Scenario Outline: login into actitime with ivalid crenditals.
Then user enter the username as "<username>" and password as "<password>"
And user click on the login 
Then user verify the title of the webpage.
And user click on logout 
Then user close the broswer
Examples:
|username| 							|password|
|admin|									|manager|
|admin|		|manager|
||											|	|
