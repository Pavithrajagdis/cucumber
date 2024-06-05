package stepdefinitions;

import Utilities.Testcontextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Greenkartpage;
import pageobjects.Landingpage;

public class Greenkartpagestepdefinition {
	Testcontextsetup testcontextsetup;

public Greenkartpagestepdefinition(Testcontextsetup testcontextsetup) {
	this.testcontextsetup=testcontextsetup;
}

@Given("Verify user is on Greenkartpage")
public void  verify_user_is_on_Greenkartpage() throws InterruptedException {

}

@When("^user searched with vegtablename (.+) in Greenkartpage$") //^ at the begining and $ atthe end bcz of dynamic string in table
public void user_searched_with_vegtablename_in_greenkartpage(String shortname) throws InterruptedException
{
	Greenkartpage green=testcontextsetup.pbm.getgreenkartpage();

	green.search(shortname);
	Thread.sleep(2000);
	testcontextsetup.Productname1=green.productname();
    System.out.println(testcontextsetup.Productname1); 
}
 @Then("increase the quantity of the product by three times and add it to the cart")
   public void increase_the_quantity() throws InterruptedException{
	 
	 Greenkartpage green=testcontextsetup.pbm.getgreenkartpage();
	 green.increment(2);
	 Thread.sleep(1000);
//	 green.increment();
//	 Thread.sleep(1000);
//	 green.increment();
	 Thread.sleep(1000);
	 green.Add2cart();
	 green.cart();
	 green.proceedtocheckout();
 }

}