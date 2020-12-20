package PageObject;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;



public class InteractWithElements extends BasePage {
By elementMenu=By.xpath("//div[text()='Elements']");
By checkboxPage=By.xpath("//span[text()='Check Box']");
By homeCheckBoxOption=By.xpath("//span[text()='Home']");
By radioPage=By.xpath("//span[text()='Radio Button']");
By yesOption=By.xpath("//label[text()='Yes']");
By message =By.xpath("//*[@id=\"app\"]//p");
By checkBoxMessage=By.xpath("//*[@id=\"result\"]");

public void NavigateToCheckboxPage()
{
	
	ClickWebElement(checkboxPage, "Navigate to checkbox page");
}
public void NavigateToElementPage()
{
	ClickWebElement(elementMenu, "Navigate to menu page");
}

public void NavigateToRadioPage()
{
	ClickWebElement(radioPage, "Navigate to radio page");
}

public void SelectCheckBox()
{
	ClickWebElement(homeCheckBoxOption, "Check the check box");
	
}
public void SelectRadioButton()
{
	ClickWebElement(yesOption, "Check the yes option");
	
}
public Boolean CompareMessage(String expectedMessage)
{
	Boolean value=CompareText(message, expectedMessage);
	return value;
}
public Boolean CompareChechkboxMessage(String expectedMessage)
{
	Boolean value=CompareText(checkBoxMessage, expectedMessage);
	return value;
}
}
