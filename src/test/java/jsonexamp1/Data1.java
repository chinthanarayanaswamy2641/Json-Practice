package jsonexamp1;

import java.io.File;
import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class Data1 {

	public static Examp1 getData() throws IOException, DatabindException, IOException {
		ObjectMapper objectMapper=new ObjectMapper();
		return objectMapper.readValue(new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\examp1.json"), Examp1.class);
	}
}
