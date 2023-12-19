package pageFactoryPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='form']/div[1]/a/img")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		Actions a = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"ext-gen19\"]"));
		a.doubleClick(we).perform();
		we.sendKeys(Keys.BACK_SPACE);
		//a.sendKeys(Keys.BACK_SPACE);
	}
}
