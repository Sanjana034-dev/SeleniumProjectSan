package Pages;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BrowserUtil;

public class SignupOne {
	 public RemoteWebDriver driver;

	    public SignupOne(RemoteWebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }



@FindBy(id="signin2")
WebElement Signup;
@FindBy(id="sign-username")
WebElement inputUsername;

@FindBy(id="sign-password")
WebElement inputPassword;

@FindBy(xpath = "//button[text()='Sign up']")
WebElement Signbutton;



public void ClickSign()
{
	Signup.click();
}
public void Enterusername(String username)
{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
     wait.until(ExpectedConditions.elementToBeClickable(inputUsername)).sendKeys(username);
	
}

public void Enterpassword(String password)
{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
     wait.until(ExpectedConditions.elementToBeClickable(inputPassword)).sendKeys(password);
}

public void ClickSignButton()
{
	
	Signbutton.click();
	
}

public void alerthandle() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert=driver.switchTo().alert();
	String textmsg=alert.getText();
	
	alert.accept();
	
}

public void SignRegisteration(String username,String password)  {
	ClickSign();
	Enterusername(username);
	Enterpassword(password);
	ClickSignButton();
	alerthandle();
	
}

}


	





