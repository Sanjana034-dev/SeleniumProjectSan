package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
	public RemoteWebDriver driver;

    public LogIn(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="login2")
    WebElement Login;
    @FindBy(id="loginusername")
    WebElement inputloginUsername;

    @FindBy(id="loginpassword")
    WebElement inputloginPassword;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement Loginbutton;

public void ClickLogin()
{
	Login.click();
}
public void Enterloginusername(String username)
{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
     wait.until(ExpectedConditions.elementToBeClickable(inputloginUsername)).sendKeys(username);
	
}

public void Enterloginpassword(String password)
{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
     wait.until(ExpectedConditions.elementToBeClickable(inputloginPassword)).sendKeys(password);
}

public void ClickSignButton()
{
	
	 Loginbutton.click();
	
}
public void alerthandle() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert=driver.switchTo().alert();
	String textmsg=alert.getText();
	 try {
         Thread.sleep(2000); // Wait for 2 seconds before clicking OK (not recommended in real tests)
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
	
	alert.accept();
	
}


	


public void SignRegisteration(String username,String password)  {
	ClickLogin();
	Enterloginusername(username);
	Enterloginpassword(password);
	ClickSignButton();
	
}
}
