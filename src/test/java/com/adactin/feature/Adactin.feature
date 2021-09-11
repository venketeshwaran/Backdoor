Feature: Testing Adactin Application end to end process

Scenario: verify the user able to login the application

Given User launch the application

When User enter the valid username in the username field

And User enter the valid password in the password field

And User clicks on the login button

Then User verify the homepage navigates to search hotel