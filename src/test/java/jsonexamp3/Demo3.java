package jsonexamp3;

import java.io.IOException;
import java.util.List;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;

public class Demo3 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		Examp3 data = Data3.getData();
//		List<Users>users=data.getUsers();
//		for(Users user:users) {
//			String email = user.getEmail();
//			System.out.println(email);
//			String password = user.getPassword();
//			System.out.println(password);
//		}
		
System.out.println(data.getUsers().get(0).getEmail());
System.out.println(data.getUsers().get(0).getPassword());
System.out.println("---------------------------------");
System.out.println(data.getUsers().get(1).getEmail());
System.out.println(data.getUsers().get(1).getPassword());
	}

}
