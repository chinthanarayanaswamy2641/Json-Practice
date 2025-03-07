package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import register.Readdd;
import register.RegisterData;


public class Register {

	WebDriver driver;
	RegisterData data;
	
	
	@Given("user navigates to register page;")
	public void user_navigates_to_register_page() {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("user enters the firstname in the register field")
	public void user_enters_the_firstname_in_the_register_field() throws StreamReadException, DatabindException, IOException {
		 data = Readdd.getReadData();
	   driver.findElement(By.id("input-firstname")).sendKeys(data.getRegister_Page().getFirstName());
	}

	@And("user enters the lastname in the register field")
	public void user_enters_the_lastname_in_the_register_field()  {
		
	    driver.findElement(By.name("lastname")).sendKeys(data.getRegister_Page().getLastName());
	}

	@And("user enters the email in the register field")
	public void user_enters_the_email_in_the_register_field() {
	    driver.findElement(By.name("email")).sendKeys(data.getRegister_Page().getEmail());
	}

	@And("user enters the telephone in the register field")
	public void user_enters_the_telephone_in_the_register_field() {
	    driver.findElement(By.name("telephone")).sendKeys(data.getRegister_Page().getTelePhone());
	}

	@And("user enters the password in the regiser field")
	public void user_enters_the_password_in_the_regiser_field() {
	   driver.findElement(By.name("password")).sendKeys(data.getRegister_Page().getPassword());
	}

	@And("user enters the confirm password field register field")
	public void user_enters_the_confirm_password_field_register_field() {
	    driver.findElement(By.name("confirm")).sendKeys(data.getRegister_Page().getConfirmPassword());
	}

	@And("user click on privacy policy in the register field")
	public void user_click_on_privacy_policy_in_the_register_field() {
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@And("user click on submit button in the register field")
	public void user_click_on_submit_button_in_the_register_field() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should get account creation")
	public void user_should_get_account_creation() {
		driver.findElement(By.xpath("//div[@id='content']//h1")).isDisplayed();
	}



}
