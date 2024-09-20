package StepDefinition;
import Pages.SignupOne;

import Utilities.BrowserUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;



public class VerifyFirstSignup {
	
	
	public RemoteWebDriver driver;
    SignupOne signup;
    
     
    @Given("user opens {string} through google browser2")
    public void user_opens_through_google_browser2(String url) {
        driver = BrowserUtil.getDriver(); 
        driver.manage().window().maximize();
        driver.get(url);
        
        // Initialize SignupPage with the current driver
        signup = new SignupOne(driver);
    }

    @When("clicks on the signup button")
    public void clicks_on_the_signup_button1() {
    	signup.ClickSign();
    	
    }

    @And("enters username {string}")
    public void enters_username(String username) {
    	signup.Enterusername(username);
    
    }

    @And("enters password {string}")
    public void enters_password(String password) {
    	signup.Enterpassword("password");
    	
    }

    @Then("clicks on the signup button2")
    public void user_clicks_on_the_signup_button2() {
    	
    	signup.ClickSignButton();
    	
    
    }

    @Then("should see a signup confirmation message")
    public void a_signup_confirmation_should_popup_and_click_ok() {
    	signup.alerthandle();
    	
    }
    @Then("should see a Existing user message")
    public void should_see_a_existing_user_message() {
    	signup.alerthandle();
    }
    
 
    

    
    
    	    
    
}
    


        
    
    

   
        
    
