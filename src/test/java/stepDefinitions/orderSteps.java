package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class orderSteps {
	
	public TestContextSetup testContextSetup;
	
	public orderSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}

	@When("the user clicks on add to cart button")
	public void the_user_clicks_on_add_to_cart_button() {
	   testContextSetup.pageobjectmanager.GetSearchPage().ClickAddToCart();
	}
	
	@When("the user navigates to carts page")
	public void the_user_navigates_to_carts_page() throws InterruptedException {
	  testContextSetup.pageobjectmanager.GetSearchPage().NavigateCartsPage();
	}
	
	@Then("the user validates the display of apply and placeorder button")
	public void the_user_validates_the_display_of_apply_and_placeorder_button() {
		Assert.assertTrue(testContextSetup.pageobjectmanager.GetOrdersPage().ValidateApplyButton());
		Assert.assertTrue(testContextSetup.pageobjectmanager.GetOrdersPage().ValidatePlaceOrderButton());
		
	}
	
	  
}
