package jsonexamp6;

import java.io.File;
import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class Data6 {

	public static Examp6 getData() throws IOException, DatabindException, IOException {
		ObjectMapper objectMapper=new ObjectMapper();
		return objectMapper.readValue(new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\examp6.json"), Examp6.class);
	}
}
