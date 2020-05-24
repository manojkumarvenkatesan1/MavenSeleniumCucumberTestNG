package pageObjectManager;

import org.openqa.selenium.WebDriver;

import pagePack.LeafHomePage;

public class PageObjectsManager {

	private WebDriver driver;
	private LeafHomePage leafpage;
	
	public PageObjectsManager(WebDriver driver)
	{
		this.driver=driver;
	}

	public LeafHomePage getLeafpage() {
		if(leafpage==null)
		{
			leafpage=new LeafHomePage(driver);
		}
		return leafpage;
	}
	
}
