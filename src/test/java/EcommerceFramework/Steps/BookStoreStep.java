package EcommerceFramework.Steps;

import PageObject.BookStore;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class BookStoreStep extends DriverFactory {
	BookStore book=new BookStore();
	
	@Given("^User enters book name in search field$")
	public void user_enters_book_name_in_search_field() throws Throwable {
	    book.SearchBook();
	}

	@Given("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
	   book.ClickSearchButton();
	}

	@Then("^User shoulde see the filtered book$")
	public void user_shoulde_see_the_filtered_book() throws Throwable {
	   
	}
	@Then("^User selects book \"([^\"]*)\"$")
	public void user_selects_book(String arg1) throws Throwable {
		book.SelectABookAndAddToCart(arg1);
	}

	@When("^User clicks on Add To Cart button$")
	public void user_clicks_on_Add_To_Cart_button() throws Throwable {
	    book.AddToCart();
	}
	@When("^User accepts the alert$")
	public void user_accepts_the_alert() throws Throwable {
	    book.AcceptTheAlert();
	}


	@Then("^The books get added to cart$")
	public void the_books_get_added_to_cart() throws Throwable {
	    
	}

}
