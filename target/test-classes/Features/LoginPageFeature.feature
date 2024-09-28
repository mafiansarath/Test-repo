#Sample feature file

Feature: This feature file to test the login page scenarios

Scenario: This scenario is to test the login functionality
	Given Launch browser and load the url
	When Provide valid username and password then hit login
	Then Validate if the user logged in and close browser