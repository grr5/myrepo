Feature: Verifying admin can add employee
    As an Admin
    I want to see add employee option
    so that I can add an employee

  @addEmployee
  Scenario: Admin can add employee
    Given Admin is logged in
    When Admin selects "PIM" module
    Then Admin should be on the "Employee Information" Page
    When selects Add Employee
    Then Admin should be on the "Add Employee" Page
    When Admin select create login details checkbox
    And Admin fills the add employee form with below details
      |Rajesh|Patel|jigi.patel|jigipatel|jigipatel|finance traniee|
    And selects Save
    Then Admin should be on the "Personal Details" Page
    Then Admin should see employee details in employee list
