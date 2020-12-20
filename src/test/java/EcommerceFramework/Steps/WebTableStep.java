package EcommerceFramework.Steps;

import java.util.List;

import PageObject.WebTable;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class WebTableStep extends DriverFactory{

	WebTable table=new WebTable();
	
	@Given("^User is in Webtable page$")
	public void User_is_in_Webtable_page() throws Throwable {
	  table.NavigateToWebTables();
	}

	@Given("^User clicks on add button$")
	public void User_clicks_on_add_button() throws Throwable {
		table.ClickAddButton();
	}
	

	@When("^User clicks on submit button$")
	public void User_clicks_on_submit_buttonn() throws Throwable {
	    table.ClicksubmitButton();
	}
	
	@Given("^User enters firstName \"([^\"]*)\"$")
	public void user_enters_firstname(String arg1) throws Throwable {
		
	}

	@Then("^Records get saved \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void records_get_saved(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		table.CheckValue(arg1);
	    table.CheckValue(arg2);
	    table.CheckValue(arg3);
	    table.CheckValue(arg4);
	    table.CheckValue(arg5);
	    table.CheckValue(arg6);
	}
	
	@Given("^User enters data$")
	public void user_enters_data(DataTable arg1) throws Throwable {
	   List<List<String>> data=arg1.raw();
	   table.AddFirstName(data.get(0).get(0));
		table.AddLastName(data.get(0).get(2));
		table.AddEmail(data.get(0).get(3));
		table.AddAge(data.get(0).get(4));
		table.AddSalary(data.get(0).get(5));
		table.AddDepartment(data.get(0).get(6));
	}

	@Then("^Records get saved$")
	public void records_get_saved(DataTable arg1) throws Throwable {
		List<List<String>> data=arg1.raw();
		table.CheckValue(data.get(0).get(0));
		table.CheckValue(data.get(0).get(2));
		table.CheckValue(data.get(0).get(3));
		table.CheckValue(data.get(0).get(4));
		table.CheckValue(data.get(0).get(5));
		table.CheckValue(data.get(0).get(6));
	}
}
