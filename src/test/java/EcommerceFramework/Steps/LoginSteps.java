package EcommerceFramework.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory{




@Given("^User navigates to demoqa website$")
public void user_navigates_to_demoqa_website() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    getDriver().get("https://demoqa.com/books");
    Thread.sleep(8000);
}



@Given("^User clicks on the login button$")
public void user_clicks_on_the_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	getDriver().findElement(By.xpath("//*[@id=\"login\"]")).click();
}


@Given("^User enters a valid username$")
public void user_enters_a_valid_username() throws Throwable {
	Thread.sleep(200);
    // Write code here that turns the phrase above into concrete actions
	getDriver().findElement(By.xpath("//*[@id='userName']")).sendKeys("Test12feb");
}


@Given("^User enters a \"([^\"]*)\" password$") 
public void user_enters_a_valid_password(String arg1) throws Throwable 
{
	Thread.sleep(200);
    // Write code here that turns the phrase above into concrete actions
	getDriver().findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(arg1);
}


@When("^User clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
	Thread.sleep(200);
    // Write code here that turns the phrase above into concrete actions
	getDriver().findElement(By.xpath("//*[@id=\"login\"]")).click();
}


@Then("^User should be taken successful login page$")
public void user_should_be_taken_successful_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(200);
    
}


@Then("^User should be presented with unsuccessful message$")
public void user_should_be_presented_with_unsuccessful_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(200);
    
}



}
