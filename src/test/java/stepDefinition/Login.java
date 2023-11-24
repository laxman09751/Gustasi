package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	
	 WebDriver driver;
	
	@Given("Users enter the login to the application using URL")
	public void users_enter_the_login_to_the_application_using_url() throws InterruptedException {
		driver= DriverFactory.getDriver();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'menu__btn d-none')]//a[1]")).click();
		
	}
	@When("User enter the mobile number with {string}")
	public void user_enter_the_mobile_number_with(String string) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(string);
	}
	@And("User enter the password with {string}")
	public void user_enter_the_password_with(String string) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(string);
	}
	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@class='btn red-aquare-btn']")).click();
		Thread.sleep(3000);
	}
	@Then("User logged into the gustasi webpage")
	public void user_logged_into_the_gustasi_webpage() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//b[text()='LAKSHMAN K ']")).isDisplayed());
	}
	@Then("User unable to login with invalid details")
	public void User_unable_to_login_with_invalid_details() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@class='iziToast-message slideIn']")).getText());
		Thread.sleep(3000);
	}
	@Then("User unable to logged into the gustasi webpage")
	public void User_unable_to_logged_into_the_gustasi_webpage() throws InterruptedException {
		Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//p[@class='iziToast-message slideIn']")).getText());
	Thread.sleep(3000);
	}
}
