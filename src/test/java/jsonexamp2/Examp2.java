package jsonexamp2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Examp2 {

	@JsonProperty("Login_Page")
	private LoginPage Login_Page;

	public LoginPage getLogin_Page() {
		return Login_Page;
	}

	public void setLogin_Page(LoginPage login_Page) {
		Login_Page = login_Page;
	}
}
