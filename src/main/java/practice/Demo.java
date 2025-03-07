package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;

public class Demo {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		WebDriver driver= new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			Creden c = CredenRead.getCredentials();
			System.out.println(c.getEmail());
			System.out.println(c.getPassword());
			driver.findElement(By.name("email")).sendKeys(c.getEmail());
			driver.findElement(By.name("password")).sendKeys(c.getPassword());
			driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
