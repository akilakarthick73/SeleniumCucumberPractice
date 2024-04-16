Feature: Order item functionality

  Scenario Outline: Validate order functionality
  Given user is on greencart landing page
  When user search with short name <term> and extracted actual name
  And the user added number of items to select the product as "3"
  And the user clicks on add to cart button
  And the user navigates to carts page
  Then the user validates the display of apply and placeorder button

  Examples:
  |term|
  |Tom |