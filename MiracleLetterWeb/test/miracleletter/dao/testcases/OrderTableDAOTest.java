package miracleletter.dao.testcases;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import miracleletter.dao.OrderTableDAO;
import miracleletter.models.OrderTable;

public class OrderTableDAOTest {
	
	private OrderTableDAO otDAO;
	private OrderTable order;
	
	@Before
	public void testPrep() {
		otDAO = new OrderTableDAO();
		order = new OrderTable();
		order.setOrder_id(2);
		order.setCustomer_id(3);
		order.setOrder_price(19.06);
		order.setDate_of_purchase("29-MAY-18");
	}
	
	
	@Test
	public void getOrderTableByIdTest() throws SQLException {
		assertThat(otDAO.getOrderTableById(2).getOrder_price(), equalTo(order.getOrder_price()));
	}
	
//	@Test
//	public void getAllOrdersByCustomerIdTest() throws SQLException {
//		
//	}
//	
//	@Test
//	public void PlaceOrderTest() throws SQLException {
//		
//	}
//	
//	@Test
//	public void CancelOrderTest() throws SQLException {
//		
//	}
}
