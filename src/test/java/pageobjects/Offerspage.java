package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerspage {

	public WebDriver driver;
	public Offerspage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By search=By.xpath("//input[@id='search-field']");
	By offerproduct=By.xpath("(//tr/td)[1]");
	
	
	public void search1(String shortName) {
		driver.findElement(search).sendKeys(shortName);
	}
	public String offerproduct() {
		return driver.findElement(offerproduct).getText();
	}
}
