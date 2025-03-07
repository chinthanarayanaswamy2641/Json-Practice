package jsonexamp4;

import java.io.File;
import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class Demo4 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		Examp4 data = Data4.getData();
		String email = data.getApplication().getLoginPage().getEmail();
		System.out.println(email);
		String password = data.getApplication().getLoginPage().getPassword();
		System.out.println(password);
		String firstname = data.getApplication().getUserDetails().getFirstName();
		System.out.println(firstname);
		String lastname = data.getApplication().getUserDetails().getLastName();
		System.out.println(lastname);
		String street=data.getApplication().getUserDetails().getAddress().getStreet();
		System.out.println(street);
		String city=data.getApplication().getUserDetails().getAddress().getCity();
		System.out.println(city);
		String zip = data.getApplication().getUserDetails().getAddress().getZip();
		System.out.println(zip);
	}

}
