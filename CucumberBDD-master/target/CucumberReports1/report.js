$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature for OHRM site",
  "description": "As a admin\nI want to see login page\nSo that I can login successfully",
  "id": "login-feature-for-ohrm-site",
  "keyword": "Feature"
});
formatter.before({
  "duration": 62781484560,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Admin can login successfully with valid credentials",
  "description": "",
  "id": "login-feature-for-ohrm-site;admin-can-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Admin login with below details",
  "rows": [
    {
      "cells": [
        "admin"
      ],
      "line": 10
    },
    {
      "cells": [
        "aediMNjU"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "admin select login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Admin should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Admin should welcome message as \"Welcome Admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.admin_is_on_login_page()"
});
formatter.result({
  "duration": 10294184709,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.admin_login_with_below_details(DataTable)"
});
formatter.result({
  "duration": 1328841960,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.admin_select_login()"
});
formatter.result({
  "duration": 4851486420,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.admin_should_login_successfully()"
});
formatter.result({
  "duration": 531001147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Admin",
      "offset": 33
    }
  ],
  "location": "StepDefs.admin_should_welcome_message_as(String)"
});
formatter.result({
  "duration": 731581669,
  "status": "passed"
});
formatter.after({
  "duration": 467868187,
  "status": "passed"
});
});