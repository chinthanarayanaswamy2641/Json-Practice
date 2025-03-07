package map;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		PageLocators locators = JsonReader.readJsonAsObject();
System.out.println(locators);
		String myAccountMenu=locators.getHome_Page().get("MyAccount_Menu");
		System.out.println(myAccountMenu);
	}

}
