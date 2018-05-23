package MiracleLetter.Models;

public class Customer {
	private int customer_id;
	private String email_address;
	private String password;
	
	
	public Customer(int customer_id, String email_address, String password) {
		this.customer_id = customer_id;
		this.email_address = email_address;
		this.password = password;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
