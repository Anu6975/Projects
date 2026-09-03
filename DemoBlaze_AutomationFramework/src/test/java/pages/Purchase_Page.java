package pages;

import org.openqa.selenium.*;

public class Purchase_Page {
	
	WebDriver driver;
	
	public Purchase_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	By name = By.id("name");
	By country = By.id("country");
	By city = By.id("city");
	By creditCard = By.id("card");
	By month = By.id("month");
	By year = By.id("year");
	By purchaseButton = By.xpath("//button[text()='Purchase']");
	By orderConfirm=By.xpath("//button[text()='OK']");

	
	
	public void enterName() {
	    driver.findElement(name).sendKeys("Rohit");
	}

	public void enterCountry() {
	    driver.findElement(country).sendKeys("US");
	}

	public void enterCity() {
	    driver.findElement(city).sendKeys("NewYork");
	}

	public void enterCreditCard() {
	    driver.findElement(creditCard).sendKeys("card");
	}

	public void enterMonth() {
	    driver.findElement(month).sendKeys("November");
	}

	public void enterYear() {
	    driver.findElement(year).sendKeys("sdnkfh");
	}

	public void clickPurchase() {
	    driver.findElement(purchaseButton).click();
	}
	
	public void clickOk() {
		driver.findElement(orderConfirm).click();
	}
	
	
}
