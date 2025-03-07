package practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException  {
//		WebDriver driver= new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Credentials loginpage = Read.getRead();
		String email=loginpage.getLogin_Page().getEmail();
		String password=loginpage.getLogin_Page().getPassword();
		
		System.out.println(email);
		System.out.println(password);
//		driver.findElement(By.name("email")).sendKeys(email);
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//     
	}

}
