package jsonexamp2;

import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;

public class Demo2 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		Examp2 data = Data2.getData();
		String email = data.getLogin_Page().getEmail();
        System.out.println(email);
        String password = data.getLogin_Page().getPassword();
        System.out.println(password);
	}

}
