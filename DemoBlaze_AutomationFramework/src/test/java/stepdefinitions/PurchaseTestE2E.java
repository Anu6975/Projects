package stepdefinitions;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.*;
import utilities.*;
import java.time.Duration;
import base.BaseTest;

public class PurchaseTestE2E extends BaseTest {
	SignUp_Page sup;
	Login_Page log;
	AddProduct_Page product;
	Cart_Page cart;
	AlertUtils alert;
	Purchase_Page purchased;
	Logout_Page logout;
	String username = SignUp_Page.username;
	String password = SignUp_Page.password;
	
	public void setRefernces() {
		sup=new SignUp_Page(driver);
		log = new Login_Page(driver);
		product = new AddProduct_Page(driver);
		cart = new Cart_Page(driver);
		purchased = new Purchase_Page(driver) ;
		logout = new Logout_Page(driver);
	
		alert = new AlertUtils(driver);
	}
	
	@Given("launched demoblaze website")
	public void launchDemoBlaze() {
		setup();
		setRefernces();
	}
	
	@And("User should be signed up")
	public void signup() throws InterruptedException {
		
		sup.signupClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		sup.signupUsername();
		sup.signupPassword();
		sup.signupButtonClick();


		alert.acceptAlert();	
	}
	
	@And("user is logged in")
	public void login() throws InterruptedException {
		log.loginLinkClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		log.loginUsername(username);
		Thread.sleep(3000);
		log.loginPassword(password);
		log.loginButtonClick();
	}
	
	@When("products are added to cart")
	public void product() throws InterruptedException {
		Thread.sleep(3000);
		product.phoneLink();
		product.phoneClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		product.phoneCart();
		
		Thread.sleep(3000);
		alert.acceptAlert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		
		product.navigateBack();
		product.navigateBack();
		Thread.sleep(3000);
		
		product.laptopLink();
		product.laptopClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		product.laptopCart();
		Thread.sleep(3000);
		alert.acceptAlert();
		
	}
	
	@Then("cart should contain added products")
	public void cart() {
		cart.cartLinkClick();
		cart.verifyProducts();
	}
	
	
	@And("user places the order by entering purchase information")
	public void purchaseInfo() {
		purchased.enterName();
		purchased.enterCountry();
		purchased.enterCity();
		purchased.enterCreditCard();
		purchased.enterMonth();
		purchased.enterYear();
		
	}
	
	@Then("purchase should be successful")
	public void purchaseOrder() throws InterruptedException {
		purchased.clickPurchase();
		Thread.sleep(3000);
		purchased.clickOk();
		
	}
	
	@And("user logs out")
	public void logout() throws InterruptedException {
		logout.clickLogout();
		Thread.sleep(3000);
		tearDown();
	}
	

}
