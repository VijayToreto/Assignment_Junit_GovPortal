#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: NPCI Government Registration Portal
  

   @tag2
  Scenario Outline: To Verify the Registration Portal
    Given Given User opens chrome browser and redirect to (indi.gov) website
    When User will enter "<Username>", "<E-mail address>","<First Name>", "<Last Name>"
    And "<Country>", "<State>", "<PIN Code>", "<Education>","<Captcha>"
    And  User Click on create new account
    Then account created successfully

    Examples:  
      | Username   | E-mail address   | First Name  | Last Name | Country | State      | PIN Code | Education                            | Captcha | 
      | Kylian00   | abc111@gmail.com |  Kylian     | Mbappe    |  India  | Tamil Nadu | 631502   | Graduate/Post Graduate-Professional  | 9p7akz  | 
      | Erling01   | def222@gmail.com |  Erling     | Haaland   |  India  | Kerala     | 242366   | Vocational                           | 6m333t  |
      | Vinicous11 | ghi333@gmail.com	|  Vinicious  | Junior    |  India  | Karnataka  | 465743   | Higher Secondary Education           | e7m5ew  |
      | Cris10     | jkl444@gmail.com |  Cristiano  | Ronaldo   |  India  | Telangana  | 572464   | Elementary Education                 | 99c2cb  |
       
    