$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/jpet.feature");
formatter.feature({
  "name": "jpet Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to buy an item",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "when the user in the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SampleSteps.when_the_user_in_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the  image fish",
  "keyword": "When "
});
formatter.match({
  "location": "SampleSteps.the_user_clicks_on_the_image_fish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he navigates to the products page",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.he_navigates_to_the_products_page()"
});
formatter.result({
  "status": "passed"
});
});