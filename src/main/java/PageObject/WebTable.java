package PageObject;

import org.openqa.selenium.By;

public class WebTable extends BasePage{
	By webTables=By.xpath("//span[text()=\"Web Tables\"]");
	By addRecord=By.xpath("//*[@id=\"addNewRecordButton\"]");
	By firstName=By.xpath("//*[@id=\"firstName\"]");
	By lastName=By.xpath("//*[@id=\"lastName\"]");
	By email=By.xpath("//*[@id=\"userEmail\"]");
	By age=By.xpath("//*[@id=\"age\"]");
	By salary=By.xpath("//*[@id=\"salary\"]");
	By department=By.xpath("//*[@id=\"department\"]");
	By submit=By.xpath("//*[@id=\"submit\"]");
	String value="//div[text()='%s']";
	
	public void NavigateToWebTables()
	{
		ClickWebElement(webTables, "Click on webtables");
	}
	
	public void ClickAddButton()
	{
		ClickWebElement(addRecord, "Click on addrecord");
	}
	
	public void AddFirstName(String name)
	{
		SendKeys(firstName, name, "Add first name");
		
	}
	public void AddLastName(String name)
	{
		SendKeys(lastName, name, "Add lastname");
		
	}
	public void AddEmail(String email)
	{
		SendKeys(this.email, email, "Add email");
		
	}
	public void AddAge(String age)
	{
		SendKeys(this.age, age, "Add age");
		
	}
	public void AddSalary(String salary)
	{
		SendKeys(this.salary, salary, "Add salary");
		
	}
	public void AddDepartment(String department)
	{
		SendKeys(this.department, department, "Add salary");
		
	}
	
	public void ClicksubmitButton()
	{
		ClickWebElement(submit, "Click on submit");
	}
	
	public Boolean CheckValue(String text)
	{
		By checkValueIsPresent=By.xpath(String.format(value, text));
		return IsDisplayed(checkValueIsPresent);
	}

}
