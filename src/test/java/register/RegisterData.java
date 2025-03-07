package register;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterData {
	
	@JsonProperty("Register_Page")
	private RegisterPage Register_Page;
	
	@JsonProperty("Login_Page")
	private LoginPage Login_Page;
	
	@JsonProperty("Search_Page")
	private SearchPage Search_Page;

	public RegisterPage getRegister_Page() {
		return Register_Page;
	}

	public void setRegister_Page(RegisterPage register_Page) {
		Register_Page = register_Page;
	}

	
}
