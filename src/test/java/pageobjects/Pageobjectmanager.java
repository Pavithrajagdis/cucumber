package pageobjects;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public WebDriver driver;
	public Landingpage landingpage;
	public Offerspage offer;
	public Greenkartpage green;
	public Checkoutpage check;
	public Countrypage con;
	
	public Pageobjectmanager(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public Landingpage getlandingpage() {
		
		landingpage=new Landingpage(driver);
		return landingpage;
	}
	
	public Offerspage getOfferspage() {
		offer=new Offerspage(driver);
		return offer;
	}
	
	public Greenkartpage getgreenkartpage() {
		green=new Greenkartpage(driver);
		return green;
	}
	public Checkoutpage getcheckoutpage() {
		check=new Checkoutpage(driver);
		return check;
	}
	public Countrypage getcountrypage() {
		con=new Countrypage(driver);
		return con;
	}
}
