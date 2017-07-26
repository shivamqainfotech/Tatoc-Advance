@tag
Feature: Automating Tatoc Advance
	

@tag1
Scenario: I want to automate Tatoc Advance
Given I am on tatoc page and select advance course
	And I hover over to MenuTwo and click on goNext button from the drop down and reached to queryGate page
When  I enter name and pass key obtained from DB and click proceed a video player must appear
 And  I click on video to play
Then  wait untill video playback is finished then click Proceed to go to next page
