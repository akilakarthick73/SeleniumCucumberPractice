Feature: Search functionality

  @smoke2
  Scenario Outline: Search experience of home and offers page
    Given user is on greencart landing page
    When user search with short name <term> and extracted actual name
    Then user searched same shortname in offers page

    Examples: 
      | term |
      | Tom  |

   @regression
  Scenario: Check Cart
    Given user is on greencart landing page
    When the user click the cart button
    Then user check weather cart empty or not

  @smoke4
  Scenario Outline: Validate Brocolli Price
    Given user is on greencart landing page
    When user search with short name <term> and extracted actual name
    When user get the price
    And the user clicks on add to cart button
    And the user click the cart button
    And the user click PROCEED TO CHECKOUT
    Then user Validate the Price

    Examples: 
      | term     |
      | Brocolli |

  @smoke5
  Scenario Outline: Add Cauliflower in Cart
    Given user is on greencart landing page
    When user search with short name <term> and extracted actual name
    And user change manuvally from 1 to 5

    Examples: 
      | term        |
      | Cauliflower |

  @smoke6
  Scenario: Validate the flight header and Greenkart Header
    Given user is on greencart landing page
    When user click flight Booking
    And user switch the window
    And user Validate the Flight header
    And the user switch Parent window
    And the user Validate the Greencart header
    Then close the Child window

  @smoke7
  Scenario: Validate the Pumpkin
    Given user is on greencart landing page
    When the user scroll to Pumpkin
    And the user click the cart button

  @smoke8
  Scenario: Validate the pagination
    Given user is on greencart landing page
		Then user searched same shortname in offers page
		And the user validate the pagination list one and two is disabled and three is displayed 
		
	@smoke9
	Scenario Outline: Validate the Pagesize
	 Given user is on greencart landing page
	 Then user searched same shortname in offers page
	 And the user Select the pagesize as "<Size>"	 
	 And the user validate Pageresult is displayed for <PageCount>
	 
	  Examples: 
      | Size        |PageCount|
      | 5						 |  5		|
      | 10					 |10		|
      | 20					 | 20		|
	
@smoke10
	Scenario Outline: Validate the Pagesize
	 Given user is on greencart landing page
	 When user search with short name <term> and extracted actual name
	 Then  user validate the two result retrived Raspberry  and  Strawberry
	 And the user validate the total number of result <size> 
	Examples:  
    | term  | size|
   	| berry |	2|



	@smoke11
	Scenario: Validate the alphabetically order
	Given user is on greencart landing page
	Then user searched same shortname in offers page
	And the user validate alphabetically order

	@smoke12

	Scenario: Validate the Promo code 
		Given user is on greencart landing page
    When user search with short name <term> and extracted actual name
    And user change manuvally from 1 to 5
    And the user clicks on add to cart button
    And the user click the cart button
    And the user click PROCEED TO CHECKOUT
    And user add promo code in "<promocode>"
    And user click apply button 
    Then user validate the applied message is "<MESSAGE>"
    
    
    
     Examples: 
      | term     |promocode|		MESSAGE				|
      | Cucumber |rahulshettyademy	|Invalid code ..!|
 
 





 

	 
		