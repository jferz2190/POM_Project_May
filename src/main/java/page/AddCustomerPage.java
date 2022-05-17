package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	
WebDriver driver;
	
	public AddCustomerPage(WebDriver driver)  {
		this.driver = driver;
	
	}
	@FindBy (how = How.XPATH, using = "//h5[text()='Add Contact']") WebElement ADD_CONTACT_HEADER;
	@FindBy (how = How.XPATH, using = "//input[@id='account']") WebElement FULL_NAME;
	@FindBy (how = How.XPATH, using = "//select[@id='cid']") WebElement COMPANY;
	@FindBy (how = How.XPATH, using = "//input[@id='email']") WebElement EMAIL;
	@FindBy (how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_NUMBER;
	@FindBy (how = How.XPATH, using = "//input[@id='address']") WebElement HOME_ADDRESS;
	@FindBy (how = How.XPATH, using = "//input[@id='city']") WebElement CITY;
	@FindBy (how = How.XPATH, using = "//input[@id='state']") WebElement STATE;
	@FindBy (how = How.XPATH, using = "//input[@id='zip']") WebElement ZIPCODE;
	@FindBy (how = How.XPATH, using = "//select[@id='country']") WebElement COUNTRY;
	@FindBy (how = How.XPATH, using = "//ul[@class='select2-selection__rendered']/li/input") WebElement TAGS;
	@FindBy (how = How.XPATH, using = "//select[@id='currency']") WebElement CURRNCY;
	@FindBy (how = How.XPATH, using = "//select[@id='group']") WebElement GROUP;
	@FindBy (how = How.XPATH, using = "") WebElement SAVE_BUTTON;
	
	
	public void verifyAddContact() {
		
		waitForElement(driver, 5, ADD_CONTACT_HEADER );
		Assert.assertEquals(ADD_CONTACT_HEADER.getText(), "Add Contact" , "Page not found");
		
	}
	
	
	


	public void insertFullName(String fullName) {
		//String InsertedName = fullName + rndNumGenerator(999);
		FULL_NAME.sendKeys(fullName + rndNumGenerator(999));
		
	}
	
	public void selectCompanyDropDown(String company) {
		selectFromDropdown(COMPANY, company);
		
	}
	
	public void insertEmailAddress(String email) {
		EMAIL.sendKeys(rndNumGenerator(999) + email);
		
	}
	public void insertPhoneNumber(String phoneNumber) {
		PHONE_NUMBER.sendKeys(phoneNumber);
		
	}
	
	
	
		}
