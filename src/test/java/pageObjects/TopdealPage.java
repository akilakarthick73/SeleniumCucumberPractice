package pageObjects;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TopdealPage {

	public WebDriver driver;
	
	
	public TopdealPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	private By Validathevegandfruit = By.xpath("//th[1]//span[text()='Veg/fruit name']/../../../following-sibling::tbody//tr//td[1]");
	By headers = By.xpath("//div[@class='tableWrapper']//table//thead//th//span");
	By Placeorderbutton =By.xpath("//button[text()='Place Order']");
	By Selectcountrydropdown =By.xpath("//label[text()='Choose Country']/following-sibling::div/select");
	By checkboxselect =By.xpath("//input[@class='chkAgree']");
	By processedbutton =By.xpath("//button[text()='Proceed']");
	By validatemsg =By.xpath("//span[contains(text(),'Thank you, your order has been placed successfully')]");
	By Errormessage =By.xpath("//span[@class='errorAlert']");
	By pagemenucolour =By.xpath("//select[@id='page-menu']");
	By Dateclear=By.xpath("//button[@class='react-date-picker__clear-button react-date-picker__button']");
	By Datepicker =By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']");

	//Methods
	
	public String vegandfruittopdeal() 
	
	{
		String fruitname = "";
		List<WebElement> headerList = driver.findElements(headers);
		for(int i=1;i<=headerList.size();i++)
		{
			if(headerList.get(i).getText().contains("fruit name"))
			{
				List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableWrapper']//table//tbody//tr//td"));
				fruitname = values.get(i).getText();
				
			}
			
		}
		System.out.println(fruitname);
		return fruitname;
	
	
	}

	public void placeorder()
	{
	
	
	WebDriverWait wait  =	new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(Placeorderbutton));
	
	driver.findElement(Placeorderbutton).click();
	 
	}

	public void Selectcountry()
	{
		WebDriverWait wait  =	new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Selectcountrydropdown));	
		Select country = new Select(driver.findElement(Selectcountrydropdown));

		country.selectByVisibleText("India");
}
	
	public void checkbox()
	{
		driver.findElement(checkboxselect).click();
	}
	
	public void Processed()
	{
		driver.findElement(processedbutton).click();
	}
	public Boolean Validatethanksmsg()
	{	 
		
	 return driver.findElement(validatemsg).isDisplayed();
	 
	}
	
	public Boolean Validaterrormsg()
	{	 
		
	 return driver.findElement(Errormessage).isDisplayed();
	 
	}
	
	public String validatepagemenucolour()
	{	 
		
	WebElement next =driver.findElement(pagemenucolour);
	String s=next.getCssValue("background-color");
	
	System.out.println(s);
	return s;
	
	
	}
	public void Deliverydate ()
	{
		driver.findElement(Dateclear).click();
	}
	
	public void Datepickerclick ()
	{
		driver.findElement(Datepicker).click();
	}
	
	public void Dateclick ()
	{	

		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE,1);
		//April 11, 2024
		SimpleDateFormat dateformat = new SimpleDateFormat("MMMM dd, yyyy");
		String date = dateformat.format(today);
		System.out.println(date);
		
		WebElement todayDate =driver.findElement(By.xpath("//div[@class='react-calendar__month-view']//button//abbr[@aria-label='"+date+"']"));
		
		WebDriverWait wait  =	new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='react-calendar__month-view']//button//abbr[@aria-label='"+date+"']")));	
		todayDate.click();
	}
	
	
}


	
	 