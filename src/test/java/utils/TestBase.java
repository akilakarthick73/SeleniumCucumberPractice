package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src/test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser_properties = prop.getProperty("browser");
		if(driver==null)
		{
			if(browser_properties.equalsIgnoreCase("Chrome"))
			{				
		
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src/test//resources//chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setBinary("C:\\Users\\91888\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		
				driver = new ChromeDriver(options);
			}
			else if(browser_properties.equalsIgnoreCase("firefox"))
			{
				
			}
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		}
		return driver;
		}
	}
