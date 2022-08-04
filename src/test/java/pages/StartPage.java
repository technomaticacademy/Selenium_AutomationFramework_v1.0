package pages;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import utils.Datatable;
import utils.GenericReusbales;
import utils.ObjectHandlers;
import utils.Reporting;

public class StartPage extends GenericReusbales {
	String sheetName = this.getClass().getSimpleName();
	String environment;
	WebDriver driver;

	Datatable datatable;
	ObjectHandlers object;
	Reporting reporting;
	HashMap testcase;

	public StartPage(HashMap testcase) {
		this.testcase = testcase;
		this.testcase.put("sheetName", sheetName);
		this.driver = (WebDriver) testcase.get("driver");
		this.environment = (String) testcase.get("environment");
		instantiate();
	}

	public void instantiate() {
		datatable = new Datatable(testcase);
		object = new ObjectHandlers(testcase);
		reporting = new Reporting(testcase);
	}


	public void fillStartDetails() throws Exception {
		
		String FName = "//input[@id='NameAndAddressEdit_embedded_questions_list_FirstName']";
		String LName = "//input[@id='NameAndAddressEdit_embedded_questions_list_LastName']";
		String DOB = "//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']";
		String StreetNumber = "//input[@id='NameAndAddressEdit_embedded_questions_list_MailingAddress']";
		String apt = "//input[@id='NameAndAddressEdit_embedded_questions_list_ApartmentUnit']";
		String Okay ="//button[text()='Okay, start my quote.']";
		
		
		
		object.set(By.xpath(FName),datatable.getCellData("FirstName"),"First name");
		object.set(By.xpath(LName),datatable.getCellData("LastName"),"Last name");
		object.set(By.xpath(DOB),datatable.getCellData("DOB"),"DOB");
		
		object.waitForElementToBeClickable(By.xpath(StreetNumber));
		object.click(By.xpath(StreetNumber),"Street Number");
		object.set(By.xpath(StreetNumber),datatable.getCellData("StreetNumber"),"Street Number");
		
		object.set(By.xpath(apt),datatable.getCellData("Apt"),"Apt");
		object.click(By.xpath(Okay),"Okay, start my quote");
		
		
		
	}

	
	
	

}
