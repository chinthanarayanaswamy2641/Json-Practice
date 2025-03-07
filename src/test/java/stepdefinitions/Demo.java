package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jayway.jsonpath.JsonPath;

public class Demo {

	static WebDriver driver=null;
	public static void main(String[] args) throws IOException {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		File jsonFile = new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\LoginLocators.json");
		Object myAccount_Menu = JsonPath.read(jsonFile,"$.Home_Page.MyAccount_Menu");
		Object register_MenuOption = JsonPath.read(jsonFile,"$.Home_Page.Register_MenuOption");
		Object login_MenuOption = JsonPath.read(jsonFile,"$.Home_Page.Login_MenuOption");
		Object email_TextBox = JsonPath.read(jsonFile,"$.Login_Page.Email_TextBox");
		Object password_TextBox = JsonPath.read(jsonFile,"$.Login_Page.Password_TextBox");
		Object loggin_Button = JsonPath.read(jsonFile,"$."+"Login_Page.Login_Button");
		Object registerAffiliate_Link = JsonPath.read(jsonFile,"$."+"Account_Page.RegisterAffiliate_Link");
		
		
		
		System.out.println(myAccount_Menu);
		System.out.println(register_MenuOption);
		System.out.println(login_MenuOption);
		System.out.println(email_TextBox);
		System.out.println(password_TextBox);
		System.out.println(loggin_Button);
		System.out.println(registerAffiliate_Link);
		
		
		
		
		
		
		objectToElement(myAccount_Menu).click();
		objectToElement(login_MenuOption).click();
		objectToElement(email_TextBox).sendKeys("cks@gmail.com");
		objectToElement(password_TextBox).sendKeys("cks@123");
		objectToElement(loggin_Button).click();
		if(objectToElement(registerAffiliate_Link).isDisplayed()) {
          System.out.println("Login Successfull - User is able to login");			
			
		}else {
			
			System.out.println("Login Failed - User is unable to login");
		}
		
		
	}
	public static WebElement objectToElement(Object object) {
		WebElement element=null;
		String locatorTypeAndValue=object.toString();
		String[] locatorArray= locatorTypeAndValue.split(";");
		String locatorType=locatorArray[0];
		String locatorValue=locatorArray[1];
		if(locatorType.equalsIgnoreCase("ID")) {
			 element=driver.findElement(By.id(locatorValue));
		}else if(locatorType.equalsIgnoreCase("NAME")) {
			 element=driver.findElement(By.name(locatorValue));
		}else if(locatorType.equalsIgnoreCase("LINK")) {
			 element=driver.findElement(By.linkText(locatorValue));
		}else if(locatorType.equalsIgnoreCase("XPATH")) {
			 element=driver.findElement(By.xpath(locatorValue));
		}
		return element;
	}

}
