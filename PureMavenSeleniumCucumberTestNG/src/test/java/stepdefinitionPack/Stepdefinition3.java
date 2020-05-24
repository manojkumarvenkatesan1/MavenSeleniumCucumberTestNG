package stepdefinitionPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjectManager.PageObjectsManager;
import pagePack.LeafHomePage;

public class Stepdefinition3{


	
	LeafHomePage leafHome;
	WebDriver driver;
	PageObjectsManager pageObjManager;
	
	@Before
	public void prerequisite()
	{
		driver=new ChromeDriver();
	}
	
	@Given("^load the webpage$")
	public void load_the_webpage() throws Throwable 
	{ 
		driver.get("http://leafground.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@When("^Click on \"([^\"]*)\" button$")
	public void click_on_button(String string) throws Throwable 
	{
	    //leafHome.clickO(string);
		pageObjManager=new PageObjectsManager(driver);
		leafHome=pageObjManager.getLeafpage();
		leafHome.clickO(string);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^Enter the text$")
	public void enter_the_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
		pageObjManager=new PageObjectsManager(driver);
		leafHome=pageObjManager.getLeafpage();
	    leafHome.enterText("Email","jollymango@gmail.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void afterRun()
	{
		driver.close();
	}
}
