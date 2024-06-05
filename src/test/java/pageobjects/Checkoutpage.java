package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {

	public WebDriver driver;
	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
	}
	By Prodname=By.xpath("//p[@class='product-name']");
	By quantity=By.xpath("//p[@class='quantity']");
	By promocode=By.xpath("//input[@class='promoCode']");
	By apply=By.xpath("//button[text()='Apply']");
	By placeorder=By.xpath("//button[text()='Place Order']");
	
	
	public String Prodname() {
	return driver.findElement(Prodname).getText().split("-")[0].trim();
	//return Vegetable;
	}
	public String quantity1() {
		return driver.findElement(quantity).getText();
	}
	public void promocode() {
	driver.findElement(promocode).sendKeys("Rahulshetty");
	//driver.findElement(promocode).isDisplayed();
		
	}
	public void apply() {
		driver.findElement(apply).click();
		//driver.findElement(apply).isDisplayed();
	}
	public void placeorder() {
		driver.findElement(placeorder).click();
	}
	
	
}
