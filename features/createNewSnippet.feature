Feature: New user can create new snippet in Google Gruyere

  As a user of Google Gruyere
  I want to be able to create a new snippet
  So that I can celebrate & share the joys of the internet with others

  Scenario Outline: User can successfully create a snippet
    Given I am logged in as <userName>
	And I am on "http://google-gruyere.appspot.com/358859087229/newsnippet.gtl" page
	And I have entered <text> into the new snippet field
	When I click on the "Submit" button
    Then I land on "http://google-gruyere.appspot.com/358859087229/newsnippet.gtl" page
	And <text> is dislayed as a snippet
	
	Examples:
	|userName|text|
	|duncs8|Hello World!|
	
  Scenario Outline: Newly created snippet is available on the users snippet page
    Given I am logged in as <userName>
	And I am on "http://google-gruyere.appspot.com/358859087229/snippets.gtl" page
    Then <text> is dislayed as a snippet
	
	Examples:
    |userName|text|
	|duncs8|Hello World!|
	