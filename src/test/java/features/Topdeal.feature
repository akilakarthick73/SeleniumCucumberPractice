Feature: Topdeal functionality

@smoke13
	Scenario: Validate display of veg/fruitname under veg/fruit column
	Given user is on greencart landing page
	Then user searched same shortname in offers page
	And user Validate display of display of veg/fruitname under veg/fruit column


	@regression
	Scenario Outline: Verify place order functionality 
	Given user is on greencart landing page
	When user search with short name <term> and extracted actual name
	And the user clicks on add to cart button
	And the user click the cart button
	And the user click PROCEED TO CHECKOUT
	And the user click Place Order 
	And the user Select India from choose country drop down
	And the user click check box 
	And the user click processed 
	And user Validate display of order succeful Message "Thank you, your order has been placed successfully " 
	Examples: 
      | term     |
      | Beetroot |
 


	@regression
	Scenario Outline: Verify place order errormsg 
	Given user is on greencart landing page
	When user search with short name <term> and extracted actual name
	And the user clicks on add to cart button
	And the user click the cart button
	And the user click PROCEED TO CHECKOUT
	And the user click Place Order 
	And the user Select India from choose country drop down
	And the user click processed 
	And user Validate the error Message 
 Examples: 
      | term     |
      | Beetroot |

@regression
	Scenario: Validate Backgroud colour
	Given user is on greencart landing page 
	Then user searched same shortname in offers page
	And user validate the colour

@regression
Scenario: Validate the delivery date 
Given user is on greencart landing page 
Then user searched same shortname in offers page
And the user clear the date cloum
And the user select the date 
Then user the select the today date 


 
@regression5

 
Scenario: Validate the javascriptexecutor 

Given user is on greencart landing page 
Then user Scroll down 
@regression9999

 
Scenario:  the javascriptexecutor 

Given user is on greencart landing page 
Then user Scroll down 

	

	