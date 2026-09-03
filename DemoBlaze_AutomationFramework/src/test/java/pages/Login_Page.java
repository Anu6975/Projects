package pages;

import org.openqa.selenium.*;

public class Login_Page {
	WebDriver driver;
	
	By loginLink = By.id("login2");
	By loginUsername = By.id("loginusername");
	By loginPassword = By.id("loginpassword");
	By loginButton = By.xpath("//button [text()='Log in']");
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loginLinkClick() {
		driver.findElement(loginLink).click();
	}
	
	public void loginUsername(String username) {
		driver.findElement(loginUsername).sendKeys(username);
	}
	
	public void loginPassword(String password) {
		driver.findElement(loginPassword).sendKeys(password);
	}
	
	public void loginButtonClick() {
		driver.findElement(loginButton).click();
	}
	
	public boolean isLoggedIn() {
	    return !driver.findElements(By.linkText("Log out")).isEmpty();
	}
	
	public boolean isLoginFailed() {

	    try {
	        driver.switchTo().alert();
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	

}
