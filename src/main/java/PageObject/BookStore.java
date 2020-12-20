package PageObject;

import org.openqa.selenium.By;

public class BookStore extends BasePage{

	By bookstoreLink=By.xpath("//span[text()='Book Store']");
	By searchInput=By.xpath("//*[@id=\"searchBox\"]");
	By clickSearchButton=By.xpath("//*[@id=\"basic-addon2\"]");
	String selectBook="//a[text()='%s']";
	By addToCart=By.xpath("//button[text()='Add To Your Collection']");
	By backToBookStore=By.xpath("//button[text()='Back To Book Store']");
	
	public void GoToBookStore()
	{
		ClickWebElement(bookstoreLink,"Click on the book store link");
	}
	public void SearchBook()
	{
		SendKeys(searchInput,"Git Pocket Guide","Search a book");
		
	}
	public void ClickSearchButton()
	{
		ClickWebElement(clickSearchButton,"Click on search button");
	}
	public void SelectABookAndAddToCart(String book)
	{
		By expectedBook=By.xpath(String.format(selectBook, book));
		ClickWebElement(expectedBook,"Select a book");
	}
	
	public void AddToCart() {
		scrollToViewElement(addToCart);
		ClickWebElement(addToCart,"Add to collection");
		
	}
	public void AcceptTheAlert()
	{
		AcceptAlert();
		ClickWebElement(backToBookStore,"Go back to store");
	}
	
	
}
