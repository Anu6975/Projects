package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	public WebDriver driver;
	
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	@BeforeMethod
	public void launch() {
		setup();
	}
	
	@AfterMethod
	public void close() {
		tearDown();
	}
}
