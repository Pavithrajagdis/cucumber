package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Greenkartpage {

	public WebDriver driver;
	public Greenkartpage(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("h4.product-name");
	By increment=By.xpath("//a[@class='increment']");
	By Add2cart=By.xpath("//button[text()='ADD TO CART']");
	By cart=By.xpath("//img[@alt='Cart']");
	By proceedtocheckout=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	public void search(String shortname) {
		driver.findElement(search).sendKeys(shortname);
	}
	public String productname() {
		return driver.findElement(productname).getText().split("-")[0].trim();
	}
	
	public void increment(int quantity) {
		int i=quantity;
		
		for(i=0;i<=1;i++)
		{
			driver.findElement(increment).click();
			
		}
		
		//driver.findElement(increment).click();
	}
	public void Add2cart() {
		driver.findElement(Add2cart).click();
	}
	public void cart() {
		driver.findElement(cart).click();
	}
   public void proceedtocheckout() {
	   driver.findElement(proceedtocheckout).click();
   }
}
