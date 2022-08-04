package testcases;

import org.testng.annotations.Test;

import core.Base;
import pages.AutoPage;
import pages.HomePage;
import pages.StartPage;
import utils.Reporting;

public class TC_002_CreateAutoQuote extends Base {

	public TC_002_CreateAutoQuote() {
		testcasename = this.getClass().getSimpleName();
		testcase.put("testcasename", testcasename);
		description = "To check the sample functionality of the application";
	}

	HomePage homepage;
	Reporting reporting;
	AutoPage auto;
	StartPage start;

	@Test
	public void testcase() {
		try {
			homepage = new HomePage(testcase);
			reporting = new Reporting(testcase);
			auto = new AutoPage(testcase);
			start = new StartPage(testcase);

			// Launch application
			homepage.launchApp();
			
			//Click on auto quote
			homepage.clickAuto();
			
			//Enter the zip code
			auto.enterZipCodeandProceed();
			
			//Fill the details in the start page
			start.fillStartDetails();
			
			
		} catch (Exception e) {
			teardownexception(reporting, e);
		}
	}
}
