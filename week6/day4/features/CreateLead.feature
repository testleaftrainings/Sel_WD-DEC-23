Feature: Lead functionality

@positive @createLead @dynamicData @functional
Scenario Outline: Create lead with positive set of data

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
Given Enter the company name <cname>
And Enter the first name <fname>
And Enter the last name <lname>
When Click on the create lead button
Then Verify the lead is created
#Given Close the browser

Examples:
|lname|cname|fname|
|sekar|Testleaf|Gokul|
|M|Qeagle|Babu|
|R|Testleaf|Hari|