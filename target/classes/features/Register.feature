Feature: Register functionality

Scenario: Register with the credentials
Given user navigates to register page;
When user enters the firstname in the register field
And user enters the lastname in the register field
And user enters the email in the register field
And user enters the telephone in the register field
And user enters the password in the regiser field
And user enters the confirm password field register field
And user click on privacy policy in the register field
And user click on submit button in the register field
Then user should get account creation