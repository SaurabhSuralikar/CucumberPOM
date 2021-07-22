package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("user wants to select  a car type {string} from the app")
	public void user_wants_to_select_a_car_type_from_the_app(String carType) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1:I booked a  car "+carType);
	    
	}

	@When("user selets a car {string} and pickup point {string} to destination {string}")
	public void user_selets_a_car_and_pickup_point_to_destination(String carType, String pickuppt, String destinpt) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2:I bokked a car "+carType +" From "+pickuppt+"To "+destinpt);
	}

	@Then("Driver starts the journy")
	public void driver_starts_the_journy() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3:The journy started");
	}

	@Then("Driver ends teh journy")
	public void driver_ends_teh_journy() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4:The journy Ended");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer bill) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 5:I paid the bill "+bill);
	}
	
	
}
