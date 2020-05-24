package pagePack;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeafHomePage {

	WebDriver driver;
	public static HashMap<String, String> pagemap;
	
	public LeafHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	static
	{
		pagemap=new HashMap<String, String>();
		pagemap.put("Button Button", "//img[@alt='Buttons']");
		pagemap.put("Edit", "//img[@alt='Edit / Text Fields']");
		pagemap.put("Email", "//input[@id='email']");
	}
	
	public void enterText(String key, String value)
	{
		driver.findElement(By.xpath(pagemap.get(key))).clear();
		driver.findElement(By.xpath(pagemap.get(key))).sendKeys(value);
	}
	
	public void clickO(String key)
	{
		driver.findElement(By.xpath(pagemap.get(key))).click();
	}
	
	
}
