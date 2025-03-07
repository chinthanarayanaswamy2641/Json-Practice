package jsonexamp1;

import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;

public class Demo1 {

	public static void main(String[] args) throws DatabindException, IOException {
		Examp1 data = Data1.getData();
		String username=data.getUsername();
		String password = data.getPassword();
		System.out.println(username);
		System.out.println(password);
	}

}
