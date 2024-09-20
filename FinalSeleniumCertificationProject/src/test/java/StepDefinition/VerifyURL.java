package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

import Utilities.BrowserUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyURL {
	RemoteWebDriver driver;
	@Given("user opens {string} through google browser")
	public void user_opens_through_google_browser(String string) {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		 Reporter.log("Opening demoblaze through google browser");
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("https://demoblaze.com/index.html");
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		
		
	
	}


	
	

}
