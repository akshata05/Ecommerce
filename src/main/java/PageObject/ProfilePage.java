package PageObject;

import org.openqa.selenium.By;

public class ProfilePage extends BasePage {
	By profileLink=By.xpath("//span[text()='Profile']");
	By deleteBook=By.xpath("//span/a[text()='Git Pocket Guide']//ancestor::div[2]//following-sibling::div[3]//span");
	By ok=By.xpath("//*[@id=\"closeSmallModal-ok\"]");
	public void GoToProfile()
	{
		ClickWebElement(profileLink,"Click on the book store link");
	}
	public void DeleteBook()
	{
		ClickWebElement(deleteBook,"Click on delete button");
		ClickWebElement(ok,"Confirm deletion by clicking on delete button");
		AcceptAlert();
	}
}
