	
		Feature: Loginfeature
		
		Scenario: login with valid crendtial 
		Given user open the broswer 
		When user pass the url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
		Then user pass the email as "admin@yourstore.com" and password as "admin"
		And user click on the login button.
		Then  user verfiy the title of the dashboard 
		And user click on logout button
		Then user close the broswer
		
	Scenario Outline: login with invalid crendtial
	Given user open the broswer 
		When user pass the url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
		Then user pass the email as "<email>"  and password as "<password>"
		And user click on the login button.
		Then  user verfiy the title of the dashboard 
		And user click on logout button
		Then user close the broswer
	Examples:
	|email| 								|password|
	|admin@yourstore.com|		|admin|
	|khader@yourstor.com|		|khader|