package map;

import java.io.File;
import java.io.IOException;
import map.PageLocators;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DeserializationFeature;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {

	public static PageLocators readJsonAsObject() throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
        // Parse JSON into the PageLocators class
        return objectMapper.readValue(new File("C:\\Users\\91934\\NewCucumber\\JsonDem\\OR\\LoginLocators.json"), PageLocators.class);
	}
}
