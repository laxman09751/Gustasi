Feature: Gustasi Registration Application
Scenario: Gustasi Registration with invalid details
Given users enter into the Signup page
When User click on the create your chef store
When User enter the details into the below fields
|First name			|Lucky									|
|Last name			|k												|
|Phone Number 	|92000000000							|
|Email					|baa@gmail.com						|
|password				|12345678									|
|City						|Vijaywada								|
And User click on terms and conditions
And User clicks on Create Account
And User enters the OTP
And User click on terms and conditions Commissions and payment policies
And user click on Proceed
And user click on individual
And user enter the Display name "Lakshman"
And user upload the Display image
And user clicks on save and next 