package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public void loginPage(WebDriver driver) {
		this.driver = driver;
		
	}

	// webElement
	@FindBy(how = How.XPATH, using = "//input[@id='username']")	WebElement USERNAME;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")	WebElement PASSWORD;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success block full-width']")	WebElement SIGNIN_BUTTON;

	// Intractable Method
	public void insertUserName(String userName) {
		USERNAME.sendKeys(userName);
	}
	public void insertPassword(String passWord) {
		PASSWORD.sendKeys(passWord);
	}
	public void clickSigninButton() {
		SIGNIN_BUTTON.click();
	}
}
