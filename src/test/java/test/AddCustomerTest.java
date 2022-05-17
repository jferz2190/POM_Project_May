package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToCreateCustomer() {
		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName("demo@Techfios.com");
		login.insertPassword("abc123");
		login.clickSigninButton();
		
		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.verifyDashboardPage();
		dashBoardPage.clickCustomerMenu();
		dashBoardPage.clickAddCustomerMenu();
		
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContact();
		addCustomerPage.insertFullName("Selenium");
		addCustomerPage.selectCompanyDropDown("Techfios");
		addCustomerPage.insertEmailAddress("demo@techfios.com");
		
	}
	
	

}
