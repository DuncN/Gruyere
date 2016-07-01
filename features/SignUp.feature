Feature: New user can sign up to Google Gruyere

  As a new user to Google Gruyere
  I want to be able to create a new account
  So that I can take advantage of Gruyere's capabilities

  Scenario Outline: New user can successfully sign up for Google Gruyere
    Given I am on "http://google-gruyere.appspot.com/358859087229/newaccount.gtl" page
	And I have entered <userName> and <password>
	When I click on the "Create Account" button
    Then I land on the "Account created" page
	
	Examples:
	|userName|password|
	|Duncs1|password1 |
	
  Scenario Outline: User can successfully sign in to Google Gruyere
    Given I am on "http://google-gruyere.appspot.com/358859087229/login" page
	And I have entered <userName> and <password>
	When I click on the "Login" button
    Then I land on the "Gruyere: Home" page
	
	Examples:
	|userName|password|
	|Duncs1|password1 |
