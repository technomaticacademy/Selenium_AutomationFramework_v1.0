package testcases;

import org.testng.annotations.Test;

import core.Base;
import pages.HomePage;
import utils.Reporting;

public class TC_002 extends Base {

	public TC_002() {
		testcasename = this.getClass().getSimpleName();
		testcase.put("testcasename", testcasename);
		description = "To check the sample functionality of the application";
	}

	HomePage homepage;
	Reporting reporting;

	@Test
	public void testcase() {
		try {
			homepage = new HomePage(testcase);
			reporting = new Reporting(testcase);

			homepage.launchApp();
			homepage.closeApp();

		} catch (Exception e) {
			teardownexception(reporting, e);
		}
	}
}
