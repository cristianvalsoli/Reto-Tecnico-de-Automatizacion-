#autor: Cristian Ivan Valdez Solis
  @stories
Feature: Academy Choucair As a user, I want to create a personal user account with my data (credentials) on utest.com.
  @scenario1
  Scenario: Create a user account on Utest.com
    Given  that  cristian wants to start a personalized learning path in tests

    When you enter your personal data in the user creation form
      |name|surname|email|month|day|year|languages|city|code|country|os pc|osVersion|osLanguage|mobileBrand|mobileModel|mobileOs|userPassword|confirmPassword|acceptNews|terms| privacyPolicy|
      |cristian ivan|Valdez|doncris5514@gmail.com|August|21|1998|[Spanish]|Pasto|528503|Colombia|Windows|10|Spanish|Samsung|Galaxy Discover|Android 4.0|r3Zb1H8TwtK#|r3Zb1H8TwtK#|1|1| 1|
    Then send the completed form
    |page|
    |link of the page with successful registration|
