package stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Testcontextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Landingpage;
import pageobjects.Offerspage;

public class offerpagestepdefinitions {

Testcontextsetup testcontextsetup;
//public WebDriver driver;
//public String offerproduct;
//public String Productname;
//private String Offerproduct;
public String getofferproduct;

public offerpagestepdefinitions(Testcontextsetup testcontextsetup) {
	this.testcontextsetup=testcontextsetup;
	}
@Then("^User searched for same shortname (.+) in offers page to check if the product exist$")
	public void User_searched_for_same_short_name_in_offers_page_to_check_if_the_product_exist(String shortName)throws InterruptedException
	{
	
	switchtoofferspage();
	Offerspage offer=testcontextsetup.pbm.getOfferspage();
	 //calling non static method of same class
    offer.search1(shortName);
    Thread.sleep(2000);
     getofferproduct = offer.offerproduct();
    System.out.println(getofferproduct);
    System.out.println("*******");
		
	}
public void switchtoofferspage() {
	//Landingpage landingpage=new Landingpage();
	Landingpage landingpage=testcontextsetup.pbm.getlandingpage();
	landingpage.topdeallink();
	testcontextsetup.gen.switchtochildwindow();
}

@Then("validate product name present landing is same as offer page")
 public void validate_product_name_present_landing_is_same_as_offer_page() {
	
	// Assert.assertEquals(testcontextsetup.offerproduct,testcontextsetup.Productname);
	 Assert.assertEquals(getofferproduct, testcontextsetup.Productname1);
	 
	
 }

}

