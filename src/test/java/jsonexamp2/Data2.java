package jsonexamp2;

import java.io.File;
import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class Data2 {

	public static Examp2 getData() throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper=new ObjectMapper();
		return objectMapper.readValue(new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\examp2.json"), Examp2.class);
	}
}
