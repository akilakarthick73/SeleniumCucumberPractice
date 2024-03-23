package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchPage;
import pageObjects.homePage;
import utils.TestContextSetup;

public class homeSteps {
	
	TestContextSetup testContextSetup;
	
	public homeSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		
	
}
	@Then("user searched same shortname in offers page")
	public void user_searched_same_shortname_in_offers_page() {
		
		testContextSetup.pageobjectmanager.GetHomePage();
		testContextSetup.genericUtils.SwitchWindow();
	}
}
	
	
