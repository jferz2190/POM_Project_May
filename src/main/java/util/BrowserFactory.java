package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserFactory {
	public static WebDriver driver;
	public static String browser="chrome";
	public static String url="https://www.techfios.com/billing/?ng=admin/";
	
//	@BeforeMethod
//	public void readFile() {
//		try {
//			InputStream input =new FileInputStream("src\\main\\java\\config\\config.properties");
//			Properties prop = new Properties();
//			prop.load(input);
//			browser=prop.getProperty("browser");
//			url=prop.getProperty("url");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	
	@Test
	public static WebDriver init() {
		
		if(browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	} else if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.chrome.driver", "drivers\\geckodriver_31.exe");
		driver = new FirefoxDriver();
	}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
		
	}
}
