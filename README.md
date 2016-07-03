# Gruyere
Experimenting with Selenium Webdriver on the Google Gruyere web app

# Refactoring required

## Selenium Webdriver
- Get the tests to actually fail when the expected string is not returned! (e.g. as it would in Selenium Grid)
- Define the page objects to increase maintainability
- Implement TakesScreenshot on failure
- Create random username for sign up
- Find a better way targeting snippets once created
- Remove comments

## Cucumber
- Collaborate with the team :-)
- Define the page objects to increase maintainability
- Create Step Defs

#Testing Notes
My testing notes can be found on mindmup here:
https://www.mindmup.com/#m:g10B6XpjHEuIY4RWlk2aldpdmdRZ2c

For the purposes of this ecxercise, I started to use Cucumber as I have framework already set up & we use it for collaborating around stories at work. Unfortunately there was too much company data / information in the framework, so I switched to Selenium WebDriver.

Also, as I was not collaborating with others on the development of this product, I saw using Cucumber as slightly overkill - I'd be using it as a test tool rather than the collaboration tool it is intended to be.

This required me to set it up on my personal machine from scratch - the tests currently don't behave exactly as I'm used to when they are being executed in the testing framework.
