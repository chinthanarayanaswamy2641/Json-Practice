package practice3;

import java.io.File;
import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import practice2.Credentials;

public class Read {

	public static Data getData() throws IOException, DatabindException, IOException {
	ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.readValue(new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\LoginLocators.json"), Data.class);
}
}
