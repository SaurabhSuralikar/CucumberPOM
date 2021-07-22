package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLogin {

	
	@Given("USer is on application")
	public void u_ser_is_on_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User appl");
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clicks on sign in page");
	}

	@Then("User displayed login screen")
	public void user_displayed_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User displayed login screen");
	}

	@When("user enters {string} in userName field")
	public void user_enters_in_user_name_field(String userName) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User Enters "+ userName );
	}

	@When("user enters\"{int}\" in password field")
	public void user_enters_in_password_field(Integer Password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Enters "+ Password );
	}
	
	@When("user enters\"{double}\" in password field")
	public void user_enters_in_password_field(Double Password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Enters "+ Password );
	}

	@Then("User gets login failed error message with {string} with {string}")
	public void user_gets_login_failed_error_message_with_with(String userName, String Password) {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("User failed to Login WIth    " + userName+"   "+ Password);
	}

}
