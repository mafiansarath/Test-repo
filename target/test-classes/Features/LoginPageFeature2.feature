#Sample feature file
@Regression
Feature: This feature file to test the login page scenarios

#@Sanity
#Scenario: This scenario is to test the login functionality
#	Given Launch browser and load the url
#	When Provide valid username and password then hit login
#	Then Validate if the user logged in and close browser
#	
#@Sanity
#Scenario: This scenario is to test the login functionality with invalid credential
#	Given Launch browser and load the url
#	When Provide invalid username and password then hit login
#	Then Validate if the user is not logged in and close browser
	
Scenario: This scenario is to test the create new account functionality
	Given Launch browser and load facebook url
	When Provide valid account information and create
	|Candidate|RegNo|Phy|Che|Math|Grade|
	|Kishore|1254|89|93|84|A|
	|Sharmila|1255|88|90|87|A|
	|Vaseela|1256|99|94|95|A+|	
	Then Validate if the account created and close browser
	
#Scenario Outline: This scenario is to test the login functionality
#	Given Launch browser and load the url
#	When Provide valid "<Username>" and "<Password>" then hit login
#	Then Validate if the user logged in and close browser
#	
#Examples: 
#	|Username|Password|
#	|standard_user|secret_sauce|
#	|problem_user|secret_sauce|
#	|error_user|secret_sauce|