package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Cart_Page{
	WebDriver driver;
	By cartLink = By.linkText("Cart");
	By laptopLink = By.xpath("//*[@id='tbodyid']/tr[1]/td[2]");
	By mobileLink = By.xpath("//*[@id='tbodyid']/tr[2]/td[2]");
	
	By placeorderButton= By.xpath("//button[text()='Place Order']");
	
	public Cart_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void cartLinkClick() {
		driver.findElement(cartLink).click();
	}

	public void verifyProducts() {
		Assert.assertTrue(!driver.findElements(laptopLink).isEmpty(), "Sony vaio i5 was not found in cart");
		Assert.assertTrue(!driver.findElements(mobileLink).isEmpty(), "Samsung galaxy s6 was not found in cart");
		clickPlaceOrderButton();
	}
	
	public void clickPlaceOrderButton() {
		driver.findElement(placeorderButton).click();
	}
}
