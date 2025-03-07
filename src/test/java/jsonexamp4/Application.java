package jsonexamp4;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Application {

	 @JsonProperty("Login_Page")
	    private LoginPage loginPage;

	    @JsonProperty("user_details")
	    private UserDetails userDetails;

	    // Getters and Setters
	    public LoginPage getLoginPage() {
	        return loginPage;
	    }

	    public void setLoginPage(LoginPage loginPage) {
	        this.loginPage = loginPage;
	    }

	    public UserDetails getUserDetails() {
	        return userDetails;
	    }

	    public void setUserDetails(UserDetails userDetails) {
	        this.userDetails = userDetails;
	    }
	
//	@JsonProperty("Login_Page")
//	private LoginPage Login_Page;
//	
//	@JsonProperty("user_details")
//	private UserDetails user_details;
//	
//	public UserDetails getUser_details() {
//		return user_details;
//	}
//	public void setUser_details(UserDetails user_details) {
//		this.user_details = user_details;
//	}
//	public LoginPage getLogin_Page() {
//		return Login_Page;
//	}
//	public void setLogin_Page(LoginPage login_Page) {
//		this.Login_Page = login_Page;
//	}
//	
	
	

	

	

	
	
	
	
	
	
}
