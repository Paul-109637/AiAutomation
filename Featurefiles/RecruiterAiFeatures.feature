@tag
Feature: Recruiter AI features
Validation of Recruiter AI

@RecruiterAiLogin
Scenario: Verify Recruiter AI Login functionality
Given user launchapplication
When user enter valid credentials
And Close Browser
@RecruiterAiLogout		
Scenario:Recruiter Verify Recruiter Ai Logout Functionality
Given user launchapplication
When user enter valid credentials
When user click on logout
And Close Browser
@CreateNewJob
Scenario: verify Recruiter AI Create New Job functionality
Given user launchapplication
When user enter valid credentials
And User clicks on Jobs Menu
And select create new job section
And click on Start button of form
And select office Address of Company
And click on Add New Office button to add new office Address
And add Job Title
And select Job Status
And Select Country Location
And Select City location
And add skills
And add Qualification
And choose Employment type
And select minimum experience
And select maximum experience
And add no of vacancies
And add Job Discription
And add Job Requirements
