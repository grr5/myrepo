$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addEmployee.feature");
formatter.feature({
  "line": 1,
  "name": "Adding employee on OHRM Website",
  "description": "  As a Admin\n  I want to add employee\n  so that I can see that employee in employee list",
  "id": "adding-employee-on-ohrm-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13691386717,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Admin can add employee",
  "description": "",
  "id": "adding-employee-on-ohrm-website;admin-can-add-employee",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Admin is logged in on OHRM website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Admin select PIM modual and select Add Employee",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "select create login details checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter below details",
  "rows": [
    {
      "cells": [
        "Rajesh",
        "Patel",
        "jigi.patel",
        "jigipatel",
        "jigipatel",
        "finance traniee"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select Save",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Admin should see employee details in employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.admin_is_logged_in_on_OHRM_website()"
});
formatter.result({
  "duration": 7399402326,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.admin_select_PIM_modual_and_select_Add_Employee()"
});
formatter.result({
  "duration": 6330671931,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.select_create_login_details_checkbox()"
});
formatter.result({
  "duration": 687662773,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.enter_below_details(DataTable)"
});
formatter.result({
  "duration": 3563660319,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.select_Save()"
});
formatter.result({
  "duration": 60586,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.admin_should_see_employee_details_in_employee_list()"
});
formatter.result({
  "duration": 76373,
  "status": "passed"
});
formatter.after({
  "duration": 432360164,
  "status": "passed"
});
});