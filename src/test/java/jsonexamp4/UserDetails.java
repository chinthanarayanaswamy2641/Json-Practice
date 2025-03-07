package jsonexamp4;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class UserDetails {
	
	@JsonProperty("first_name")
	 private String firstName;
	 @JsonProperty("last_name")
	    private String lastName;
	    private Address address;

	    // Getters and Setters
	    
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	   
	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }
//	private Address address;
//	
//	private String first_name;
//	private String last_name; 
//	
//	@JsonProperty("first_name")
//	public String getFirst_name() {
//		return first_name;
//	}
//	public void setFirst_name(String first_name) {
//		this.first_name = first_name;
//	}
//	@JsonProperty("last_name")
//	public String getLast_name() {
//		return last_name;
//	}
//	public void setLast_name(String last_name) {
//		this.last_name = last_name;
//	}
//	
	
}
