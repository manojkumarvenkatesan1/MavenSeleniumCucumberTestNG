package stepdefinitionPack;

import org.testng.annotations.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition1 {

	
	@Given("open web browser and load URL and enter the webpage")
	public void open_web_browser_and_load_URL_and_enter_the_webpage() {
	    System.out.println("given is executed");
	}

	@When("user clicks on button web element")
	public void user_clicks_on_button_web_element() {
		System.out.println("when is executed");
	}

	@When("user click on goto homepage button")
	public void user_click_on_goto_homepage_button() {
		System.out.println("when2 is executed");
	}

	@Then("user navigates to homepage")
	public void user_navigates_to_homepage() {
		System.out.println("then is executed");
	}
	
	@Test
	public void testngmethod2()
	{
		System.out.println("TestNG Method has been triggered");
	}
	
}
