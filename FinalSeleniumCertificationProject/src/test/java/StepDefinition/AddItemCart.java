package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddItemCart {
	RemoteWebDriver driver;
	@Given("Open demoblaze")
	public void open_demoblaze() {
		driver = BrowserUtil.getDriver(); // Assign to class-level driver
        Reporter.log("Opening demoblaze through google browser");
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
	}
  
    

    @Then("Click on item samsung galaxy")
    public void click_on_item_samsung_galaxy() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Reporter.log("Selecting samsung galaxy s6");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Samsung galaxy s6']"))).click();
    }

    @Then("Click on add to cart")
    public void click_on_add_to_cart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Reporter.log("Adding samsung galaxy to cart");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']"))).click();
    }

    @Then("Confirmation will be displayed")
    public void confirmation_will_be_displayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String textMsg = alert.getText();
        Reporter.log("Alert message: " + textMsg); 
        Reporter.log("Confirmation displayed and cliced on ok");
        alert.accept();
    }

    @Then("Click ON CART")
    public void click_on_cart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Reporter.log("Viewing the added item in the cart");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Cart']"))).click();
    }
}