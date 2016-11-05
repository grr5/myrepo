Feature: Adding new skill
  As a admin
  I want to add new skill to an employee
  so that i can update skills

  @addskill
  Scenario: Admin can add skill
    Given Admin is logged in
    When admin select admin module
    And select qualifiications
    And select skills
    And select add button
    And enter details as below
    |java|good skill|
    And select save button
    Then admin should see skill in skills page

