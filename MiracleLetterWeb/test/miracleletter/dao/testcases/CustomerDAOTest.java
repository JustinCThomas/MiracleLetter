package miracleletter.dao.testcases;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import miracleletter.dao.CustomerDAO;
import miracleletter.models.Customer;

public class CustomerDAOTest {

	private CustomerDAO cDAO;
	private Customer customer;
	private Customer customer2;
	
	@Before
	public void testPrep() {
		cDAO = new CustomerDAO();
		customer = new Customer();	
		customer.setCustomer_id(4);
		customer.setEmail_address("tim@gmail.com");
		customer.setPassword("fiveYard");
		
		
		customer2 = new Customer();
		customer2.setEmail_address("unknown@gmail.com");
		customer2.setPassword("foodcombo");
	}
	
	@Test
	public void validateCustomerTest() {
		assertThat(cDAO.validateCustomer(customer.getPassword(), "fiveYard"), equalTo(true));
	}
	
	@Test
	public void getCustomerByEmailTest() throws SQLException {
		assertThat(cDAO.getCustomerByEmail("tim@gmail.com").getPassword(), equalTo(customer.getPassword()));
	}
	
//	Comment and uncomment as necessary for register and delete
	
//	@Test
//	public void registerCustomerTest() throws SQLException {
//		assertThat(cDAO.registerCustomer(customer2), equalTo(1));
//	}
//	
//	@Test
//	public void deleteCustomerTest() throws SQLException {
//		assertThat(cDAO.deleteCustomer(customer2), equalTo(1));
//	}
//	
	@Test
	public void changeCustomerPasswordTest() throws SQLException {
		assertThat(cDAO.changeCustomerPassword(cDAO.getCustomerByEmail("jim@yahoo.com"), Long.toString( Math.round(Math.random() * 100000000)) ), equalTo(1));
	}
}
