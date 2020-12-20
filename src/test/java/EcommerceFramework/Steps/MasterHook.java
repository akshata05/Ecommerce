package EcommerceFramework.Steps;

import java.io.File;
import java.io.IOException;
import java.lang.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.utils.FileUtil;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHook extends DriverFactory  {
	@Before
	public void setup()
	{
		driver=getDriver();
	}
	
	@Before("@First")
	public void DisplayFirst()
	{
		System.out.println("First");
	}
	@Before("@Second")
	public void DisplaySecond()
	{
		System.out.println("Second");
	}
	@After()
	public void tearDown(Scenario scenario)
	{
		try
		{
			if(driver!=null && scenario.isFailed())
			{
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				 File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				 File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/" + screenshotName + ".png");
				 Files.copy(sourcePath, destinationPath); 
				 Reporter.addScreenCaptureFromPath(destinationPath.toString());
				 
				 
			}
		
			if(scenario.getStatus().equals("passed")) 
			{
				
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				 File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				 System.out.println(sourcePath);
				 File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/" + screenshotName + "1.png");
				 System.out.println(destinationPath);
				 Files.copy(sourcePath, destinationPath);
				 Reporter.addScreenCaptureFromPath(destinationPath.toString());
			}
			
		if(driver!=null)
		{
			
			driver.close();
			driver.quit();
			driver=null;
		}
	}
		catch(Exception e)
		{
			System.out.println("Something went wrong..."+e.getMessage());
		}
		
		
	}
	


}
