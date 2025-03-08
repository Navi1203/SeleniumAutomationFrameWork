Feature: Automating the Amazon feature

  Background:
    Given Launch the Web page


  
  Scenario Outline: Verify Succesfull login
    Then Enter username "<username>" and password "<password>"
    And Click on submit button
    Then Verify the login is successful by checking "<title>"

Examples: 
| username  								| password 			| title  				|
| xxxxxxxxxxxxxxx@gmail.com	| yyyyyyyxxxxx	| Hello, Naveen |
