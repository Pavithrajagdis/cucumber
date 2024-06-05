package Utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic {
public WebDriver driver;

public Generic(WebDriver driver) {
	this.driver=driver;
}
	public void switchtochildwindow() {
		Set<String> handler=driver.getWindowHandles();
	    Iterator<String> it=handler.iterator();
	    String parent=it.next();
	    String child=it.next();
	    driver.switchTo().window(child);
		
	}
}
