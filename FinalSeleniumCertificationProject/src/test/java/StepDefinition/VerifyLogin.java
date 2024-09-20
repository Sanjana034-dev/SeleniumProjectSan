package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LogIn;
import Pages.SignupOne;
import Utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyLogin {
	public RemoteWebDriver driver;
    LogIn login;
    
    
    
	@Given("User opens demoblaze through google")
	public void user_opens_demoblaze_through_google() {
		 driver = BrowserUtil.getDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoblaze.com/index.html");  
	        login = new LogIn(driver);
	}

	@Then("Click on Login")
	public void click_on_login() {
	    login.ClickLogin();
	}

	@Then("Enter username {string}")
	public void enter_username(String username) {
	   login.Enterloginusername(username);
	}

	@Then("Enter password {string}")
	public void enter_password(String password) {
		login.Enterloginpassword(password);
	}

	@Then("Click on Login button")
	public void click_on_login_button() {
	   login.ClickSignButton();
	}
	@Then("Password incorrect message should be displayed")
	public void password_incorrect_message_should_be_displayed() {
	  login.alerthandle();
	}
	
	@Then("Username incorrect message should be displayed")
	public void username_incorrect_message_should_be_displayed() {
		login.alerthandle();
	}
	@Then("Greeting message should be visible")
	public void greeting_message_should_be_visible() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement GreetElement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nameofuser']")));
        String greetingText = GreetElement.getText();
        System.out.println("Greeting message: " + greetingText);
        driver.quit();
        
	
	}
	
}
