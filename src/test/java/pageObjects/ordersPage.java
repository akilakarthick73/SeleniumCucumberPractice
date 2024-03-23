package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ordersPage {

	public WebDriver driver;
	
	public ordersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	By ApplyButton = By.xpath("//button[text()='Apply']");
	By PlaceOrderButton = By.xpath("//button[text()='Place Order']");
	
	
	
	//Methods
	
	public Boolean ValidateApplyButton()
	{
		return driver.findElement(ApplyButton).isDisplayed();
	}
	
	public Boolean ValidatePlaceOrderButton()
	{
		return driver.findElement(PlaceOrderButton).isDisplayed();
	}
	
	
	
	

	
}
