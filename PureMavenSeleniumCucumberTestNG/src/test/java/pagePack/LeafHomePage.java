package pagePack;

import java.util.HashMap;

import org.openqa.selenium.By;

import webactionsPack.Webactions;

public class LeafHomePage {

	Webactions web;
	public static HashMap<String, String> pagemap;
	
	static
	{
		pagemap.put("Button Button", "//img[@alt='Buttons']");
		pagemap.put("Edit", "//img[@alt='Edit / Text Fields']");
		pagemap.put("Email", "//input[@id='email']");
	}
	
	public void enterText(String key, String value)
	{
		Webactions.driverUsage().findElement(By.xpath(pagemap.get(key))).clear();
		Webactions.driverUsage().findElement(By.xpath(pagemap.get(key))).sendKeys(value);
	}
	
	public void clickO(String key)
	{
		Webactions.driverUsage().findElement(By.xpath(pagemap.get(key))).click();
	}
}
