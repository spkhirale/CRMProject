$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Simple Data Driven without Example keyword",
  "description": "",
  "id": "simple-data-driven-without-example-keyword",
  "keyword": "Feature"
});
formatter.before({
  "duration": 179212,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM Login Page",
  "description": "",
  "id": "simple-data-driven-without-example-keyword;free-crm-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "kiran@gmail.com",
        "123456"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Open the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on user menu",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on add user",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "fill the value in form",
  "rows": [
    {
      "cells": [
        "uname",
        "mobile",
        "email",
        "pwd"
      ],
      "line": 13
    },
    {
      "cells": [
        "aniljha",
        "3467823946",
        "anil237@gmail.com",
        "anil123"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#Then click on submit button"
    }
  ],
  "line": 16,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinitionExam1.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 12163368358,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionExam1.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 13361923,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionExam1.username_and_password(DataTable)"
});
formatter.result({
  "duration": 286019363,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionExam1.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1291177816,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionExam1.open_the_home_page()"
});
formatter.result({
  "duration": 17132077,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionExam1.click_on_user_menu()"
});
formatter.result({
  "duration": 295800606,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionExam1.click_on_add_user()"
});
formatter.result({
  "duration": 227075717,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionExam1.fill_the_value_in_form(DataTable)"
});
formatter.result({
  "duration": 4847438419,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionExam1.close_the_browser()"
});
formatter.result({
  "duration": 2337065461,
  "status": "passed"
});
formatter.after({
  "duration": 112106,
  "status": "passed"
});
});