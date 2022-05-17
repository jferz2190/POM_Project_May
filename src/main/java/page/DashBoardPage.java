package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		
	}
	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']") WebElement DASHBOARD_HEADER;
	@FindBy (how =How.XPATH, using ="//span[text()='Customers']") WebElement CUSTOMER_MENU;
	@FindBy (how = How.XPATH, using ="//a[text()='Add Customer']") WebElement ADD_CUSTOMER_MENU;
	
	public void verifyDashboardPage() {
		Assert.assertEquals(DASHBOARD_HEADER.getText(),"Dashboard", "Page not found");
		}
	
	public void clickCustomerMenu() {
		CUSTOMER_MENU.click();
		}

	public void clickAddCustomerMenu() {
		ADD_CUSTOMER_MENU.click();
		}
}


