Feature: Automating Leaftap Application - Edit Lead

Background:
Given Launch the Browser
And Max the Browser
And Set TimeOuts
And Launch the URL
And Enter userName as DemoSalesManager
And Enter passWord as crmsfa
And Click on SubmitButton
And Click on Crmsfa
And Click on Leads Link

Scenario Outline: TC002 Editing a lead Positive flow
Given Click on findLeads
And Click on EmailTab
And Enter the Email id as <email>
And Click on FindLeads Button
And Click on first resulting LeadId
And Click on Edit Button
And Enter CName as <updatedName>
When Click on Update Button
Then Verify Lead is updated
And Verify Lead id is Not Changed

Examples:
|email|updatedName|
|xyz1@gmail.com|UpdatedCompany1|
|xyz2gmail.com|UpdatedCompany2|