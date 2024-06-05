package stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utilities.Testcontextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Landingpage;
import pageobjects.Offerspage;

public class landingpagestepdefinitions {
Testcontextsetup testcontextsetup;

//public String offerproduct;
//public String Productname1;

public landingpagestepdefinitions(Testcontextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
@Given("verify user is on Greenkart landingpage")
	public void  verify_user_is_on_Greenkart_landingpage() throws InterruptedException {
	
	}

@When("^user searched with shortname (.+) and extract actual name of product$") //^ at the begining and $ atthe end bcz of dynamic string in table
	public void user_searched_with_short_name_and_extract_actual_name_of_product(String shortname) throws InterruptedException
	{
	Landingpage landingpage=testcontextsetup.pbm.getlandingpage();
	
	landingpage.search(shortname);
		Thread.sleep(2000);
		testcontextsetup.Productname1=landingpage.productname();
	    System.out.println(testcontextsetup.Productname1);   
	}
}
