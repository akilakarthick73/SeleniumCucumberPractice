package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class homePage {

	public WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	By topDeals = By.xpath("//a[text()='Top Deals']");
	
	//Methods
	
	
	
	
}
