package utils;

public class OracleQueries {
	public final static String CUSTOMERBYEMAIL = "SELECT * FROM customer "
			+ "WHERE email_address = ?";
	
	public final static String REGISTERCUSTOMER = "INSERT INTO customer "
			+ "(email_address, password) "
			+ "VALUES (?, ?)";
	
	public final static String DELETECUSTOMERBYEMAIL = "DELETE FROM customer "
			+ "WHERE email_address = ?";
}
