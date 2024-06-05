package stepdefinitions;

import java.io.IOException;

import Utilities.Testcontextsetup;
import io.cucumber.java.en.Then;
import pageobjects.Countrypage;

public class Countrypagestepdefinition {

	Testcontextsetup testcontextsetup;
	public Countrypage check;

		public Countrypagestepdefinition(Testcontextsetup testcontextsetup) {
			this.testcontextsetup=testcontextsetup;
			//Checkoutpage check=testcontextsetup.pbm.getcheckoutpage();
		}
		@Then("select the country finish shopping")
		public void select_the_country_finish_shopping() throws InterruptedException, IOException {
			Countrypage con=testcontextsetup.pbm.getcountrypage();
			Thread.sleep(4000);
			con.textbox();
			Thread.sleep(2000);
			con.checkbox();
			con.Proceed();
			con.Grabtext();
			//con.ss();
		}
}
