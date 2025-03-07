Feature: Login functionality





Scenario: Login with valid credentials
Given User has navigated to login page
When User enters valid emial into email field
And User enters valid password into the password field
And User clicks on Login button
Then User should get logged