package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProduct_Page {
	
	WebDriver driver;
	
	public AddProduct_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	//Phone
	By phoneLink = By.linkText("Phones");
	By phoneClick = By.linkText("Samsung galaxy s6");
	By phoneCart = By.linkText("Add to cart");
	
	//Laptop
	By laptopLink = By.linkText("Laptops");
	By laptopClick = By.linkText("Sony vaio i5");
	By laptopCart = By.linkText("Add to cart");
	
	
	
	public void phoneLink() {
		driver.findElement(phoneLink).click();
	}
	
	public void phoneClick() {
		driver.findElement(phoneClick).click();
	}
	
	public void phoneCart() {
		driver.findElement(phoneCart).click();
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void laptopLink() {
		driver.findElement(laptopLink).click();
	}
	
	public void laptopClick() {
		driver.findElement(laptopClick).click();
	}
	
	public void laptopCart() {
		driver.findElement(laptopCart).click();
	}
	
	
}
