package MiracleLetter.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import MiracleLetter.Models.Customer;
import utils.OracleQueries;

public class CustomerDAO {
	public boolean validateCustomer(String passwordFromDB, String inputPassword) {
		return passwordFromDB.equals(inputPassword);
	}
	
	public Customer getCustomerByEmail(String email) throws SQLException {
		Customer customer = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.CUSTOMERBYEMAIL);
			result = stmt.executeQuery();
			
			if (result.next()) {
				customer = new Customer(result.getInt(1), 
						result.getString(2), result.getString(3));
				System.out.println("Customer has been created.");
			}
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		
		return customer;
	}
	
	public Integer registerCustomer(Customer customer) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.REGISTERCUSTOMER);
			result = stmt.executeUpdate();
			
			if (result != 0) {
				System.out.println("Customer was successfully registered.");
			} else {
				System.out.println("Registration was unsuccessful.");
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		
		return result;
	}
	
	public Integer deleteCustomer(Customer customer) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.DELETECUSTOMERBYEMAIL);
			result = stmt.executeUpdate();
			if (result != 0) {
				System.out.println("Customer was successfully deleted from the database.");
			} else {
				System.out.println("Error: Customer was not successfully deleted.");
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		
		return result;
		
	}
}
