package practice3;

import java.util.Map;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	@JsonProperty("Home_Page")
	private Map<String, String> Home_Page;
	@JsonProperty("Login_Page")
	private Map<String, String> Login_Page;
	@JsonProperty("Account_Page")
	private Map<String, String> Account_Page;
	
	public Map<String, String> getHome_Page() {
		return Home_Page;
	}
	public void setHome_Page(Map<String, String> home_Page) {
		Home_Page = home_Page;
	}
	public Map<String, String> getLogin_Page() {
		return Login_Page;
	}
	public void setLogin_Page(Map<String, String> login_Page) {
		Login_Page = login_Page;
	}
	public Map<String, String> getAccount_Page() {
		return Account_Page;
	}
	public void setAccount_Page(Map<String, String> account_Page) {
		Account_Page = account_Page;
	}
	
	
}
