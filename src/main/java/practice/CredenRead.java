package practice;

import java.io.File;
import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;


public class CredenRead {

	public static Creden getCredentials() throws StreamReadException, DatabindException, IOException   {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\LoginCredentials.json"), Creden.class);
    }
}
