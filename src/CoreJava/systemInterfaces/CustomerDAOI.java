package CoreJava.systemInterfaces;

import java.sql.SQLException;

import MiracleLetter.Models.Customer;

public interface CustomerDAOI {
	public boolean validateCustomer(String passwordFromDB, String inputPassword);
	
	public Customer getCustomerByEmail(String email) throws SQLException;
	
	public Integer registerCustomer(Customer customer) throws SQLException;
	
	public Integer deleteCustomer(Customer customer) throws SQLException;
	
	public Integer changeCustomerPassword(Customer customer) throws SQLException;
}
