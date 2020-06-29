@Grouptesting
Feature: Grouping of Test cases in Cucumber-BDD according to user created annotations

@SmokeTest @RegressionTest
Scenario: Free CRM Login Test with valid user
Given this is valid login test

@SmokeTest
Scenario: Free CRM Login Test with invalid user
Given this is invalid login test

@RegressionTest
Scenario: Create a contact
Given This is contact test case

@ImpTest @SmokeTest
Scenario: Create a deal
Given This is deal test case

@ImpTest @RegressionTest
Scenario: Create a task
Given This is task test case

@ImpTest
Scenario: Create a case
Given this is case test case

@ImpTest @SmokeTest @RegressionTest
Scenario: Verify left panel link
Given clicking on left panel link

@RegressionTest
Scenario: Search a deal
Given this is search a deal test

@SmokeTest
Scenario: Search a contact
Given this is search contact test

@ImpTest
Scenario: Search a case
Given this is search case test

@ImpTest @SmokeTest @RegressionTest
Scenario: Search a task
Given this is search a task test