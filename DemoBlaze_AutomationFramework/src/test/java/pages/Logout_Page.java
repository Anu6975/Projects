package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_Page {
	
	WebDriver driver;
	
	public Logout_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By logoutLink = By.linkText("Log out");
	
	public void clickLogout() {
		driver.findElement(logoutLink).click();
	}

}
