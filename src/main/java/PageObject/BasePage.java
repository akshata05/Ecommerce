package PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.gherkin.model.Scenario;

import utils.DriverFactory;

public class BasePage extends DriverFactory{

	WebDriverWait wait=new WebDriverWait(getDriver(),30);
	public void SendKeys(By by,String value,String stepname)
	{
		try
		{
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(value);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void ClickWebElement(By by, String stepname)
	{
		try
		{
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		getDriver().findElement(by).click();
		}
		catch(Exception e)
		{
			
		}
	}
	public void scrollToViewElement(By by)
	{
		WebElement webElement = getDriver().findElement(by);
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", webElement);
		
	}
	public void AcceptAlert()
	{
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert=getDriver().switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {
			
		}
		
	}
	
	public String GetTextElement(By by)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		String text=driver.findElement(by).getText();
		return text;
	}
	public Boolean CompareText(By by,String expected)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		String actual=driver.findElement(by).getText();
		if(actual.toLowerCase().equals(expected.toLowerCase()))
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	public Boolean IsDisplayed(By by)
	{
		WebElement element=getDriver().findElement(by);
		if(element.isDisplayed())
		{
			return true;
		}
		else {
			return false;
		}
	}
	protected Boolean IsChecked(By by)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		WebElement checkBoxElement = getDriver().findElement(by);
		boolean isSelected = checkBoxElement.isSelected();
		if(isSelected == false) {
		 
		 return false;
		}
		else
		{
			return true;
		}
	}

}
