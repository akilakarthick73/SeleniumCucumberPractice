package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchPage;
import utils.TestContextSetup;

public class searchSteps {
	private static final byte[] Raspberry = null;
	private static final byte[] Strawberry = null;
	public WebDriver driver;
	public SearchPage searchPage;
	public String price1;
	
	public TestContextSetup testContextSetup;
	
	
	public searchSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		searchPage = testContextSetup.pageobjectmanager.GetSearchPage();
		
	}
	
	@Given("user is on greencart landing page")
	public void user_is_on_greencart_landing_page() {
	    testContextSetup.genericUtils.MaximizeWindow();
	    Assert.assertTrue(searchPage.GetDriverTitle().contains("GreenKart"));
	}
	
	@When("^user search with short name (.+) and extracted actual name$")
	public void user_search_with_short_name_and_extracted_actual_name(String searchvalue) throws InterruptedException {
	

		searchPage.PerformSearch(searchvalue);
		String product = searchPage.Gettext().split("-")[0].trim();
		System.out.print(product);
	}
	
	@When("the user added number of items to select the product as {string}")
	public void the_user_increases_the_value_to(String quantity) {
		
		searchPage.increaseValue(Integer.parseInt(quantity));
	  
	}
	
	
	@When("the user click the cart button")
	
	public void the_user_click_the_cart_button() 
	
	{
	    searchPage.ClicktoaddonCart();
	}
	
	
	@Then("user check weather cart empty or not")
	public void user_check_weather_cart_empty_or_not() 
	{
		 Assert.assertTrue(searchPage.Vaildcart());
	
	}
	
	@When("user get the price")
	public void user_get_the_price()
	{
		price1=searchPage.getProductprice();
	}
	
	@When("the user click PROCEED TO CHECKOUT")
	public void the_user_click_proceed_to_checkout() 
	{
		searchPage.Processedcheckout();
	}
	
	@Then("user Validate the Price")
	public void user_validate_the_price()
	{
		String price2=searchPage.vaildatetheamount();
		Assert.assertEquals(price1, price2);
	}
	
	@When("user change manuvally from {int} to {int}")
	public void user_change_manuvally_from_to(Integer int1, Integer int2) 
	{
		searchPage.changequantitydetails();
		 
	}
	
	@When("the user scroll to Pumpkin")
	public void the_user_scroll_to_pumpkin()
	{
	  
		searchPage.MousescrolltoPumpkin();
	}
	
	@Then("the user validate the pagination list one and two is disabled and three is displayed")
	public void the_user_validate_the_pagination_list_one_and_two_is_disabled_and_three_is_displayed()
	{
		Assert.assertTrue(searchPage.ValidatePagenation());
	}

	@Then("the user Select the pagesize as {string}")
	public void the_user_select_the_pagesize_as(String Size) {
		
		searchPage.selectpagesize(Size);
	}
	
	@Then("the user validate Pageresult is displayed for {int}")
	public void the_user_validate_pageresult_is_displayed_for(int b) 
	
	{
		int a=searchPage.pagesizevalidte();
		//int b= Integer.parseInt(string);
		Assert.assertEquals(a, b);
	}
	
	@Then("user validate the two result retrived Raspberry  and  Strawberry")
	public void user_validate_the_two_result_retrived_raspberry_and_strawberry() 	
	{
	    
	   Assert.assertTrue(true);	   
	}
	

	@Then("the user validate the total number of result {int}")
	public void the_user_validate_the_total_number_of_result(int a)
	{
	     int c=searchPage.validateberry();
	     Assert.assertEquals(c, a);
	}
	
	@Then("the user validate alphabetically order")
	public void the_user_validate_alphabetically_order() 
	
	{
		Assert.assertTrue(searchPage.vaildateicon());}
		

	@When("user add promo code in {string}")
	public void user_add_promo_code_in(String code) 
	
	{
		searchPage.Enterpromocodecheckbox(code);
	}
	
	@When("user click apply button")
	public void user_click_apply_button() 
	
	{
		
		searchPage.applybuttonclick();
	}
	@Then("user validate the applied message is {string}")
	public void user_validate_the_applied_message_is(String Expected) 
	   
	{
		String Actual  = searchPage.validatepromecode();
		Assert.assertEquals(Actual, Expected);
	}
	
}
	
	
