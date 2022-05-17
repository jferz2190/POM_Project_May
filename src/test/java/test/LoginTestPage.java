package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
	

public class LoginTestPage {
	WebDriver driver;
	@Test
	public void validUserShouldBeAbletoLogin() {
		//class name
		//creating instance

		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();
		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.verifyDashboardPage();
		dashBoardPage.clickCustomerMenu();
		dashBoardPage.clickAddCustomerMenu();
		//BrowserFactory.tearDown();
		
	}

}
