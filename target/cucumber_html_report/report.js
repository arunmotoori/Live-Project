$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Orders.feature");
formatter.feature({
  "line": 1,
  "name": "End to end scenarios for placing orders",
  "description": "",
  "id": "end-to-end-scenarios-for-placing-orders",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13676374326,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify whether user is able to place an order",
  "description": "",
  "id": "end-to-end-scenarios-for-placing-orders;verify-whether-user-is-able-to-place-an-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I add any product to Bag and checkout",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I place an order",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should see that the order is placed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Orders.i_login_to_the_application()"
});
formatter.result({
  "duration": 6850212610,
  "status": "passed"
});
formatter.match({
  "location": "Orders.i_add_any_product_to_Bag_and_checkout()"
});
formatter.result({
  "duration": 10212368858,
  "status": "passed"
});
formatter.match({
  "location": "Orders.i_place_an_order()"
});
formatter.result({
  "duration": 1516480803,
  "status": "passed"
});
formatter.match({
  "location": "Orders.i_should_see_that_the_order_is_placed_successfully()"
});
formatter.result({
  "duration": 1364196916,
  "status": "passed"
});
formatter.after({
  "duration": 2164911270,
  "status": "passed"
});
});