package StepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UserRegSteps {
	

@Given("User enters forlowing data")
public void user_enters_forlowing_data(DataTable Details) {
    System.out.println("User on reg page");
    List<Map<String ,String>> userlst=Details.asMaps(String.class, String.class);
    System.out.println(userlst);
            System.out.println(userlst.get(0).get("name"));
//    for (List<String> e: userlst)
//    { 
//    	System.out.println(e);
//    }
}

@Then("user registration should be successful")
public void user_registration_should_be_successful() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User Able to LOgin Successfully");
    
}

}
