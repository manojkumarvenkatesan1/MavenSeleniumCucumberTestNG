package runnerPack;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGxmlRunner {

	public static void main(String[] args) {
		
		//creating an object of TestNG
		TestNG TNGObj=new TestNG();
		
		//define a list
		List<String> TNGobjlist=new ArrayList<String>();
		
		//add values to the list
		TNGobjlist.add("C:\\Users\\manoj\\Eclipse Workspace\\eclipse photon\\PureMavenSeleniumCucumberTestNG\\TestNG_XMLfiles\\TNGtestcases.xml");
		
		//set the TNGObj to run
		TNGObj.setTestSuites(TNGobjlist);
		
		//call the run method
		TNGObj.run();
	}
}
