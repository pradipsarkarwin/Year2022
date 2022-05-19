@amazon

Feature: Create an account

Scenario Outline: verify the error message by creating a invalid account 

Given user on amazon homepage 
When user clicks on hello sign in button
And user click on create an amazon account
And user enter name as "<yourName>"
And user enter email as "<eMail>"
And user enter password as "<password>"
And user enter repassword as "<rePassword>"
And user clicks on continue button
Then user varifies the error message

Examples: 
|yourName	|eMail							|password				|rePassword		|
|addidas	|adddd123@aol.com		|dipsarkar990		|dipsarkar990	|
|STPL			|vanss@msn.com			|coolbuddy049		|coolbuddy049	|
|wework		|gogoli@gmil.com		|gogigogi12			|gogigogi12		|