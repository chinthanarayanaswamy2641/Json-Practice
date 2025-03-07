package utils;

import java.io.File;
import java.io.IOException;

import utils.Credentials;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class CredentialsReader {

	 public static Credentials getCredentials() throws StreamReadException, DatabindException, IOException   {
	        ObjectMapper objectMapper = new ObjectMapper();
	        return objectMapper.readValue(new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\LoginCredentials.json"), Credentials.class);
	    }
}
//ObjectMapper is a class from the Jackson library used for converting between Java objects and JSON.
//objectMapper.readValue(): This method reads and parses the JSON file and converts it into an object of the specified class (Credentials).