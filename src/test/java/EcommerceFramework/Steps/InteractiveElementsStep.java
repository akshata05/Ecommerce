package EcommerceFramework.Steps;

import static org.junit.Assume.assumeTrue;

import PageObject.InteractWithElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class InteractiveElementsStep {
	InteractWithElements element =new InteractWithElements();
	@Given("^User selects Element Tab$")
	public void user_selects_Element_Tab() throws Throwable {
	 element.NavigateToElementPage();
	    
	}
	@Given("^User navigates to checkbox menu$")
	public void user_navigates_to_checkbox_menu() throws Throwable {
	 element.NavigateToCheckboxPage();
	    
	}

	@Given("^User checks the home checkbox$")
	public void user_checks_the_home_checkbox() throws Throwable { 
	    element.SelectCheckBox();
	}
	@Given("^User navigates to radio menu$")
	public void user_navigates_to_radio_menu() throws Throwable {
	 element.NavigateToRadioPage();
	    
	}


	@When("^User checks the yes radio option$")
	public void user_checks_the_yes_radio_option() throws Throwable {
	    
	    element.SelectRadioButton();
	}
	
	@Then("^A message is displayed \"([^\"]*)\"$")
	public void a_message_is_displayed(String arg1) throws Throwable {
	    
	    Boolean value=element.CompareMessage(arg1);
	    Assert.assertTrue(value);
	}
}
