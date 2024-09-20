package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserUtil {
	public static RemoteWebDriver getDriver() {
		RemoteWebDriver driver;
		String browsername="Chrome";
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		return driver;
		}
	
	}

