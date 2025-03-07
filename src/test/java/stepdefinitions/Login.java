package stepdefinitions;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jayway.jsonpath.JsonPath;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Credentials;
import utils.CredentialsReader;




public class Login {
	WebDriver driver=null;
	Credentials credentials=null;
	

	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() {
		 driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
	}

	@When("User enters valid emial into email field")
	public void user_enters_valid_emial_into_email_field() throws StreamReadException, DatabindException, IOException  {
		  credentials =CredentialsReader.getCredentials();
		
	
	  driver.findElement(By.name("email")).sendKeys(credentials.getEmail());
	}

	@When("User enters valid password into the password field")
	public void user_enters_valid_password_into_the_password_field() {
		driver.findElement(By.name("password")).sendKeys(credentials.getPassword());
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	@Then("User should get logged")
	public void user_should_get_logged() {
	   driver.findElement(By.linkText("Register for an affiliate account")).isDisplayed();
	}
}

