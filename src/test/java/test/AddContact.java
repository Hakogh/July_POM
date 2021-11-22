package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomer;
import page.Dashboard;
import page.LoginPage;
import util.BrowserFactory;

public class AddContact {

	WebDriver driver;
	String FULL_NAME = "TestNG";
	String COMPANY_NAME = "Techfios";
	String EMAIL = "abc234@techfios.com";
	String PHONE_NUMBER = "35252523";
	String COUNTRY = "Algeria";

	@Test
	public void validCustomerShouldBeAbleToAddCustomer() {

		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.insertUserName("demo@techfios.com");
		login.insertPassWord("abc123");
		login.clickSign();

		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

		dashboard.verifyDashboard();
		dashboard.clickCustoer();
		dashboard.addCustomer();
		
		AddCustomer addCustomer = PageFactory.initElements(driver, AddCustomer.class);
		
		addCustomer.insertFullName("TestNG");
		addCustomer.selectCompany("Techfios");
		addCustomer.insertEmail("abc234@techfios.com");
		addCustomer.insertPhone("35252523");
		addCustomer.selectCountry("Algeria");
		
		

	}

}
