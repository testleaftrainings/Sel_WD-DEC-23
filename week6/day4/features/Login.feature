Feature: Login functionality
#Background:
#Given Launch the browser
#Given Load the url as 'http://leaftaps.com/opentaps'

#Given Close the browser

@login @positive @functional
Scenario: Login functionality with positive set of data

#Given Launch the browser
#Given Load the url as 'http://leaftaps.com/opentaps'
And Enter the 'username' as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then User land in the login sucessful page
#Given Close the browser



@login @negative @smoke
Scenario: Login functionality with negative set of data

#Given Launch the browser
#Given Load the url as 'http://leaftaps.com/opentaps'
And Enter the 'username' as 'demoManager'
And Enter the password as 'crmsfa123'
When Click on the login button
But User land in the login sucessful page
#Given Close the browser


@login @negative @smoke
Scenario: Login functionality with one negative and one positive

#Given Launch the browser
#Given Load the url as 'http://leaftaps.com/opentaps'
And Enter the 'username' as 'demomanager'
And Enter the password as 'crmsfa'
When Click on the login button
But User land in the login sucessful page
#Given Close the browser