package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Utilities.BrowserUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PurchaseItem {
	RemoteWebDriver driver;

	@Given("Open demoblazesite")
	public void open_demoblazesite() {
		driver = BrowserUtil.getDriver(); // Assign to class-level driver
        Reporter.log("Opening demoblaze through google browser");
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
	}
	@Given("add item to cart")
	public void add_item_to_cart() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Samsung galaxy s6']"))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']"))).click();
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        String textMsg = alert.getText();
	        Reporter.log("Alert message: " + textMsg); 
	        Reporter.log("Item added to cart");
	        alert.accept();
	}

	@Then("Click on cart")
	public void click_on_cart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Reporter.log("Viewing the added item in the cart");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Cart']"))).click();
	}

	@And("Click on place order")
	public void click_on_place_order() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Reporter.log("Placing order for the item added in the cart");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']"))).click();
	}

	@And("Add all the details")
	public void add_all_the_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Reporter.log("Filling up the details for order confirmation");
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']"))).sendKeys("Paul");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='country']"))).sendKeys("India");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='city']"))).sendKeys("Mumbai");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card']"))).sendKeys("890");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='month']"))).sendKeys("Jan");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='year']"))).sendKeys("2024");
	    

}
	@Then("click Purchase")
	public void click_purchase() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Reporter.log("Item purchased");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Purchase']"))).click();
	}

	@Then("Pop up confirmation will be displayed and click on OK")
	public void pop_up_confirmation_will_be_displayed_and_click_on_ok() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))).click();
        
	}
}
