package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {

	public WebDriver driver;
	public Landingpage(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("h4.product-name");
	By topdeallink=By.xpath("(//a[@class='cart-header-navlink'])[1]");
	
	public void search(String shortname) {
		driver.findElement(search).sendKeys(shortname);
	}
	public String productname() {
		return driver.findElement(productname).getText().split("-")[0].trim();
	}
	public void topdeallink() {
		driver.findElement(topdeallink).click();
	}
}
