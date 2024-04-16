package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public homePage hmpage;
	public SearchPage searchPage;
	public ordersPage orderPage;
	public TopdealPage TopdealPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	public homePage GetHomePage()
	{
		hmpage = new homePage(driver);
		return hmpage;
	}
	
	public SearchPage GetSearchPage()
	{
		searchPage = new SearchPage(driver);
		return searchPage;
	}
	
	
	public ordersPage GetOrdersPage()
	{
		orderPage = new ordersPage(driver);
		return orderPage;
	}
	
	public TopdealPage GetTopdealPage()
	{
		TopdealPage = new TopdealPage(driver);
		return TopdealPage;
	}
} 


