package testLeaf_BaseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;
	String browser ="chrome";
	
	//@BeforeMethod
	
	@BeforeTest
	public void openBrowser() {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Wrong Browser");
		}
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//@AfterMethod
	public void closeBrowser() {
		if (driver!=null) {
			driver.close();
		}
	}
}
