package pageobjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.apache.commons.io.FileUtils;

public class Countrypage {

	public WebDriver driver;
	public Countrypage(WebDriver driver) {
		this.driver=driver;
	}

	By textbox=By.xpath("//select[@style='width: 200px;']");
	By Checkbox=By.xpath("//input[@type='checkbox']");
	By Proceed=By.xpath("//button[text()='Proceed']");
	By Grabtext=By.xpath("//span[@style='color:green;font-size:25px']");
	
	public void textbox() {
		WebElement box=driver.findElement(textbox);
		Select sel=new Select(box);
		//sel.selectByValue("India");
		sel.selectByVisibleText("India");
	}
	public void checkbox() {
		driver.findElement(Checkbox).click();
	}
	public void Proceed() {
		driver.findElement(Proceed).click();
	}
	public String Grabtext() {
		return driver.findElement(Grabtext).getText();
	}
public void ss() throws IOException { 
TakesScreenshot ts1=(TakesScreenshot)driver;
File src=ts1.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("E:\\ss/green.png"));
}
}
