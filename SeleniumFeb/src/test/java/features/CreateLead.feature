Feature: Automating Leaftap Application - Creating Lead

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

Scenario Outline: TC001 Creating a lead Positive flow
Given Click on CreateLead link
And Enter compName as <cName>
And Enter firstName as <fName>
And Enter lastName as <lName>
And Select Industry
And Enter eMail as <eMail>
When Click on CreateLead button
Then Verify Lead creation is Success
And Verify Page Title contains View Lead

Examples:
|cName|fName|lName|eMail|
|CapGemini|Siva|G|xyz1@gmail.com|
|HSBC|Siva|G|xyz2@gmail.com|