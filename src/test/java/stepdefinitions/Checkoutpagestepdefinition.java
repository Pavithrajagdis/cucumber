package stepdefinitions;

import org.testng.Assert;

import Utilities.Testcontextsetup;
import io.cucumber.java.en.Then;
import pageobjects.Checkoutpage;

public class Checkoutpagestepdefinition {

	Testcontextsetup testcontextsetup;
public Checkoutpage check;

	public Checkoutpagestepdefinition(Testcontextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		//Checkoutpage check=testcontextsetup.pbm.getcheckoutpage();
	}
	@Then ("User searched for same vegtablename in checkout page")
	public void user_searched_for_same_vegeatblename_in_checkout_page() {
		Checkoutpage check=testcontextsetup.pbm.getcheckoutpage();
		testcontextsetup.vegname=check.Prodname();
		System.out.println(testcontextsetup.vegname);
		testcontextsetup.Quantity=check.quantity1();
		System.out.println(testcontextsetup.Quantity);
	}
    @Then("verify enter the promotional code and place the order")
    public void verify_the_promotional_CODE_and_place_order() throws InterruptedException {
    	Checkoutpage check=testcontextsetup.pbm.getcheckoutpage();
    	Thread.sleep(2000);
    	check.promocode();
    	Thread.sleep(5000);
    	//Assert.assertEquals(check.promocode(),"Rahulshetty");
    	check.apply();
    
    	Thread.sleep(2000);
    	check.placeorder();
    	Thread.sleep(2000);
    }
}
