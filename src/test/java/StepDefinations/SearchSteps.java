package StepDefinations;

import Implementation.Product;
import Implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;
	@Given("I have a Serach field on Amazon Page")
	public void i_have_a_serach_field_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 1 Inside Given ");
	}

	@When("I search the product with name {string} and price {int}")
	public void i_search_the_product_with_name_and_price(String ProductName, Integer Price) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 2 Inside When");
	    System.out.println("Search The product name with " +ProductName + " And Price " + Price );
	    product = new Product(ProductName,Price); 
	    
	    
	    
	}

	@Then("Product with name {string} should be dispayed")
	public void product_with_name_should_be_dispayed(String ProductName) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 3 Inside Then");
	    search=new Search();
	    String name=search.displayProd(product);
	    System.out.println("I search for the product" +name);
	    Assert.assertEquals("The msgI have printed", product.getProductName(),name);
	}

	@Given("I have a product name {string} with Price {int}")
	public void i_have_a_product_name_with_price(String ProductName, Integer Price) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("ProductName " +ProductName+ "Price "+ Price);
	}

	@When("I click on add to Cart")
	public void i_click_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Clicked on Cart");
	}

	@Then("The product {string} should be added to the cart")
	public void the_product_should_be_added_to_the_cart(String ProductName) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Product "+ProductName + "Added to the cart");
	}

	
	
}
