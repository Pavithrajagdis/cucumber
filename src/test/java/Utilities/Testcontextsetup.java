package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.Pageobjectmanager;

public class Testcontextsetup {
	
	public WebDriver driver;
	public String getofferproduct;
	public String Productname1;
	public String vegname;
	public String Quantity;
	public Pageobjectmanager pbm;
	public TestBase tb;
	public Generic gen;
	public String country1;
	
	
	public Testcontextsetup() throws InterruptedException, IOException  {
		tb=new TestBase();
		pbm=new Pageobjectmanager(tb.webDriverManager());
		gen=new Generic(tb.webDriverManager());
	}

}
