Feature: Lead functionality

@regression
Scenario: Create lead with positive set of data

#Given Launch the browser
#And Load the url as 'http://leaftaps.com/opentaps'
Given Enter the 'username' as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then User land in the login sucessful page
When Click on crmsfa
Then User land in  the Welcome page
When Click on the leads tab
And Click on the create lead
Given Enter the company name Testleaf
And Enter the first name Gokul
And Enter the last name Sekar
When Click on the create lead button
Then Verify the lead is created
#Given Close the browser