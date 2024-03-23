package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchPage {

	public WebDriver driver;
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	private By search = By.xpath("//input[@type='search']");
	private By homePage = By.cssSelector("h4.product-name");
	private By AddtoCartButton = By.xpath("//button[text()='ADD TO CART']");
	private By CartButton = By.className("cart-icon");
	By ProceedButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	private By Searchbutton =By.xpath("//button[@class='search-button']");
	By increaseCartButton = By.cssSelector("a.increment");
	By cartempty =By.xpath("//h2[text()='You cart is empty!']");
	By Productprice =By.xpath("//p[@class='product-price']");
	By Checkout =By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By priceamount=By.xpath("//p[@class='amount'][1]");
	By quantity= By.cssSelector("input.quantity");
	By Pumpkinaddtocart=By.xpath("//h4[contains(text(),'Pumpkin')]/following-sibling::div//button");
	By Pagenation =By.xpath("//ul[@class='pagination pull-right']//li");
	By Pagesize =By.xpath("//select[@id='page-menu']");
	By Pagesizevailate=By.xpath("//table[@class ='table table-bordered']//tbody//tr");
	By Raspberryvalidate =By.xpath("//h4[contains(text(),'Raspberry')]");
	By Strawberryvalidate =By.xpath("//h4[contains(text(),'Strawberry ')]");
	By validateberry =By.xpath("//div[@class='product']");
	By validatesorticon =By.xpath("//span[@class='sort-icon sort-descending']");
	By sortingvalidation =By.xpath("//table[@class ='table table-bordered']//tbody//tr//td[1]");
	By enterpromocode =By.xpath("//input[@class='promoCode']");
	By Applybutton=By.xpath("//button[text()='Apply']");
	By Promocode =By.xpath("//span[@class='promoInfo']");
	//Methods
	
	public void PerformSearch(String searchvalue) throws InterruptedException
	{
		driver.findElement(search).sendKeys(searchvalue);
		driver.findElement(Searchbutton).click();
		Thread.sleep(1000);
	}
	
	public String Gettext()
	{
		return driver.findElement(homePage).getText();
		
	}
	
	public void ClickAddToCart()
	{
		driver.findElement(AddtoCartButton).click();
	}
	
	public void NavigateCartsPage() throws InterruptedException
	{
		driver.findElement(CartButton).click();
		driver.findElement(ProceedButton).click();
		Thread.sleep(1000);
	}
	
	public String GetDriverTitle()
	{
		return driver.getTitle();
	}
	
	public void increaseValue(int quantity)
	{
		int i =quantity-1;
		while(i>0)
		{
			driver.findElement(increaseCartButton).click();
			i--;
		}
	}
	public void ClicktoaddonCart() 
	
	{
		driver.findElement(CartButton).click();
	}
	
	public Boolean Vaildcart() 
	{
	     return driver.findElement(cartempty).isDisplayed();
	
	}
	
	public String getProductprice() 
	{
		return driver.findElement(Productprice).getText();
	}
	
	public void Processedcheckout() 
	{
		driver.findElement(Checkout).click();
	}
	
	public String vaildatetheamount() 
	{
		return driver.findElement(priceamount).getText();
	}
	public void changequantitydetails() 
	{
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("5");
	}
	
	public void MousescrolltoPumpkin() 
	{
		 WebElement tracker= driver.findElement(Pumpkinaddtocart);
		 new Actions(driver).moveToElement(tracker).perform();
		 driver.findElement(Pumpkinaddtocart).click();
	}
	
	public Boolean	ValidatePagenation() 
	{
		List<WebElement> Pagenationlist=driver.findElements(Pagenation);
		
		
		return Pagenationlist.get(2).getAttribute("class").contains("active")&Pagenationlist.get(1).getAttribute("class").contains("disabled")&Pagenationlist.get(0).getAttribute("class").contains("disabled");
		
	}
	
	public void selectpagesize(String size) 
	{
		
		Select Pageselect= new Select (driver.findElement(Pagesize));
		Pageselect.selectByValue(size);
		
	}
	public int pagesizevalidte() 
	{
		List<WebElement> Pagesizevalidationlsit=driver.findElements(Pagesizevailate);
		return Pagesizevalidationlsit.size();
		
	}	
	
	public Boolean  validateRaspberryandStrawberry() 
	{
		return driver.findElement(Raspberryvalidate).isDisplayed() & driver.findElement(Strawberryvalidate).isDisplayed();
		
	}
	public int validateberry() 
	{
		List<WebElement> validateberrylist=driver.findElements(validateberry);
		return validateberrylist.size();
	
	}
	public Boolean vaildateicon()
	{
		
		//driver.findElement(validatesorticon).click();
		List<WebElement> validationiconlist=driver.findElements(sortingvalidation);
		List<String> a=new ArrayList();
		List<String> b=new ArrayList();
		for (int i =0;i<=validationiconlist.size()-1;i++  ) 
		{
			a.add(validationiconlist.get(i).getText());
			b.add(validationiconlist.get(i).getText());
			
		}
		Collections.sort(a);
		int k=0;
		for (int j=0;j<=validationiconlist.size()-1;j++)
		{
		
			if (a.get(j).equals(b.get(j)))
			{
				k=0;
			}
			else
			{
				k=1;
			}
		}
		if(k==0);
		return true;		
	}
	public void Enterpromocodecheckbox(String promo)
	{
		WebDriverWait wait  =	new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(enterpromocode));
		driver.findElement(enterpromocode).sendKeys(promo);
	}
 
	
	public void applybuttonclick()
	{
		
		driver.findElement(Applybutton).click();
	}
	
	 public String validatepromecode()
	 {
		WebDriverWait wait  =	new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Promocode));
	return driver.findElement(Promocode).getText();
		 
		
		 
	 }
	 

	
}
