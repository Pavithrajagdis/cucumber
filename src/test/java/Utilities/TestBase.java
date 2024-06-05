package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
	public WebDriver driver;
	public WebDriver webDriverManager() throws InterruptedException, IOException {
		
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/golbal.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		
	if(driver == null)
	{
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")){
	System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	Thread.sleep(5000);
		}
		else 
			if(prop.getProperty("browser")=="firefox") {
				//code for firefox browser
		}
		
	}
	return driver;
	}
}
