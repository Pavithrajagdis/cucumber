package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.Testcontextsetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	Testcontextsetup testcontextsetup;
	public Hooks(Testcontextsetup testcontextsetup ) {
		
		this.testcontextsetup=testcontextsetup;
	}

	@After
	public void Afterscenario() throws InterruptedException, IOException {
		 testcontextsetup.tb.webDriverManager().quit();
	}
	@AfterStep
	public void addscreenshot(Scenario scenario) throws InterruptedException, IOException
	{
		WebDriver driver=testcontextsetup.tb.webDriverManager();
				if(scenario.isFailed())
			{
			TakesScreenshot ts=((TakesScreenshot)driver);
			File src =ts.getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(src);
			scenario.attach(filecontent, "image/png", "cucumber");
			
			}
	}
	
	
}
