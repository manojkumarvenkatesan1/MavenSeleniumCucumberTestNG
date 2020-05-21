package stepdefinitionPack;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition2 {

	@Given("^enter the time machine$")
	public void enter_the_time_machine() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("time machine travel");
	}

	@When("^Travel to \"([^\"]*)\"$")
	public void travel_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("travelling to the"+string);
	}

	@Then("^enjoy the journey$")
	public void enjoy_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enjoying the journey");
	}

}
