package pages;
import org.openqa.selenium.*;

public class SignUp_Page  {
	WebDriver driver;
	By signupLink = By.id("signin2");
	By signupUsername = By.id("sign-username");
	By signupPassword = By.id("sign-password");
	By signUpButton = By.xpath("//button[text()='Sign up']");
	
//	public static String username = "anuja@1511";
	public static String username = "user" + System.currentTimeMillis();
	public static String password = "anuja@04";
	
	public SignUp_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void signupClick() {
		driver.findElement(signupLink).click();
	}
	
	public void signupUsername() {
		driver.findElement(signupUsername).sendKeys(username);
	}
	
	public void signupPassword() {
		driver.findElement(signupPassword).sendKeys(password);
	}
	
	public void signupButtonClick() {
		driver.findElement(signUpButton).click();
	}

}
