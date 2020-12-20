package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory 
{
	public static WebDriver driver;
	public WebDriver getDriver()
	{
	try
	{
	ReadConfigFile file =new ReadConfigFile();
	String browserName=file.getBrowser();
		switch(browserName)
		{
			case "chrome":
				if(null==driver)
				{
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--incognito");
					driver=new ChromeDriver(options);
					driver.manage().window().maximize();
					driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
					
				}
				break;
		}
	}
	catch(Exception e)
	{
		System.out.println("Fail to open browser "+e.getMessage());
	}
	return driver;
	}
}


