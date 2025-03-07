package jsonexamp3;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.type.CollectionType;
import io.cucumber.cucumberexpressions.TypeReference;
import jsonexamp2.Examp2;

public class Data3 {

	public static Examp3 getData() throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objectMapper=new ObjectMapper();
		return objectMapper.readValue(new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\examp3.json"), Examp3.class);
	}
}
