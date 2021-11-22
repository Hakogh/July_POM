package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomer;
import page.Dashboard;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	// how to call method 
	//inherit //object 
	//by the name of class 
	
	// Should have driver by it self
	WebDriver driver;
	
	
	String USERNAME = "demo@techfios.com";
	String PASSWOR = "abc123";
	
	@Test
	public void verifieUserShouldBeAbleToLogin () {
		
	driver = BrowserFactory.init();
	
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	
	
	login.insertUserName("demo@techfios.com");
	login.insertPassWord("abc123");
	login.clickSign();
	
	Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
	
	dashboard.verifyDashboard();
	
	
	
	
	BrowserFactory.treatDown();
		
	}
}
