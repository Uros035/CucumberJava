Feature: Login into Application

Scenario Outline: Positive test validation login
Given Initialize the browser with chrome
And Navigate to "https://rahulshettyacademy.com/" site
And  Click on Login link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in
And close browsers


  Examples:
  |username             |password        |
  |urozz035@gmail.com   |volimsebe1234   |
  |urozz0356@gmail.com  |1volimsebe12345 |
