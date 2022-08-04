package testcases;

import org.testng.annotations.Test;

import core.Base;
import pages.AutoPage;
import pages.HomePage;
import utils.Reporting;

public class TC_001_CreateAutoQuote extends Base {

	public TC_001_CreateAutoQuote() {
		testcasename = this.getClass().getSimpleName();
		testcase.put("testcasename", testcasename);
		description = "To check the sample functionality of the application";
	}

	HomePage homepage;
	Reporting reporting;
	AutoPage auto;

	@Test
	public void testcase() {
		try {
			homepage = new HomePage(testcase);
			reporting = new Reporting(testcase);
			auto = new AutoPage(testcase);

			//Launch the URL
			homepage.launchApp();
			
			//click on auto
			homepage.clickAuto();
		
			//Enter Zip code and click on Get Quote
			auto.enterZipCodeandProceed();
			
			//Fill the personal info
			
			
			//Fill the vehicle info
			
			
			
			homepage.closeApp();

		} catch (Exception e) {
			teardownexception(reporting, e);
		}
	}
}
