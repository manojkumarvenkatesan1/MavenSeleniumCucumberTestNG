package stepdefinitionPack;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages.GherkinDocument.Feature.Step.DataTable;
import pagePack.LeafHomePage;
import webactionsPack.Webactions;

public class Stepdefinition3 extends LeafHomePage {


	LeafHomePage leafHome;
	@Given("^load the webpage$")
	public void load_the_webpage() {
	  
		Webactions.driverUsage().get("http://leafground.com/");
		
	}

	@When("^Click on \"([^\"]*)\" button$")
	public void click_on_button(String string) {
	    leafHome.clickO(string);
	}

	@When("Enter the text")
	public void enter_the_text(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
	    leafHome.enterText("Email", );
	}
}
