Feature: Testing login functionlity in automationpractice

@Login
Scenario: User checking login using valid username and password
Given user launch the application
When user click login button
And user enter valid username in username field
And user enter valid password in password field
And user click on login button
Then user confirm whether it navigates to homepage screen

@Productadding 
Scenario: user add the product into cart
Given user select the category
When user select the product
And user add product into the cart
Then product proceed to checkout

@Placingorder
Scenario: user place the order
Given user check the product summary and proceed to checkout
When user choose the delivery address and proceed to checkout
And user agree the terms and conditions
And user proceeds the order
And user select the payment options
And finally user place the order
Then user logout from account

