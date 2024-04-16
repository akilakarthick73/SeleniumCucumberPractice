package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TopdealPage;
import utils.TestContextSetup;

public class TopdealSteps {
	public WebDriver driver;
	public TopdealPage topdealPage;
	public String price1;
	
	TestContextSetup testContextSetup;
	
	
	public TopdealSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		topdealPage = testContextSetup.pageobjectmanager.GetTopdealPage();
		
	}

@Then("user Validate display of display of veg\\/fruitname under veg\\/fruit column")
public void user_validate_display_of_display_of_veg_fruitname_under_veg_fruit_column()

{
	String x= topdealPage.vegandfruittopdeal();
	System.out.println(x);

}
@When("the user click Place Order")
public void the_user_click_place_order() 
{

topdealPage.placeorder();
}
@When("the user Select India from choose country drop down")
public void the_user_select_india_from_choose_country_drop_down() 

{
	topdealPage.Selectcountry();
}
@When("the user click check box")
public void the_user_click_check_box() 
{
	topdealPage.checkbox();
}
@When("the user click processed")
public void the_user_click_processed() 
{
	topdealPage.Processed();
}
@When("user Validate display of order succeful Message {string}")
public void user_validate_display_of_order_succeful_message(String Expextedmsg) 

{
	//String Actualmsg = topdealPage.Validatethanksmsg();
	Assert.assertTrue(topdealPage.Validatethanksmsg());
}


@When("user Validate the error Message")
public void user_validate_the_error_message()
	{
		Assert.assertTrue(topdealPage.Validaterrormsg());
}

@Then("user validate the colour")
public void user_validate_the_colour() 
{
	topdealPage.validatepagemenucolour();
	String Actualmsg=topdealPage.validatepagemenucolour();
	Assert.assertEquals("rgba(61, 129, 23, 1)", Actualmsg );
	 
}

@Then("the user clear the date cloum")
public void the_user_clear_the_date_cloum()
{
	topdealPage.Deliverydate();
}
@Then("the user select the date")
public void the_user_select_the_date()
{
	topdealPage.Datepickerclick();
}

@Then("user the select the today date")
public void user_the_select_the_today_date() 

{

	topdealPage.Dateclick();
}

@Then("user Scroll down")
public void user_scroll_down() {
   
}




}