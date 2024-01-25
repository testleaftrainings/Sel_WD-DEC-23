Feature: Login functionality

Scenario: Login functionality with positive set of data

Given Launch the browser
And Load the url as http://leaftaps.com/opentaps
And Enter the username as demosalesmanger
And Enter the password as crmsfa
When Click on the login button
Then User land in the login sucessful page