@Regression
Feature: This feature is to test amazon home page functionalities.

Background: 
	Given Launch browser and load amazon url

@Smoke
Scenario: This scenario is to test mobile search
#	Given Launch browser and load amazon url
	When Search with mobile keyword in the homepage
	Then Validate if the results are for mobile search
	
Scenario: This scenario is to test laptop search
#	Given Launch browser and load amazon url
	When Search with laptop keyword in the homepage
	Then Validate if the results are for laptop search
	
#Scenario: This scenario is to test the iPhone purchase with CC
#	Given Launch browser and load amazon url
#	And Login to the valid account
#	When search iphone14 model and add to cart
#	But provide invalid credit card details and submit order 
#	Then Validate if the order placed and order id
#	And Log out from the account and close browser