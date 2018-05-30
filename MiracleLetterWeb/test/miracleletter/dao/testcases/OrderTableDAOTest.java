package miracleletter.dao.testcases;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import miracleletter.dao.OrderTableDAO;
import miracleletter.models.OrderTable;

public class OrderTableDAOTest {
	
	private OrderTableDAO otDAO;
	private OrderTable order;
	private List<OrderTable> orderList;
	private OrderTable orderToPlace;
	private OrderTable orderToDelete;
	
	@Before
	public void testPrep() throws SQLException {
		otDAO = new OrderTableDAO();
		
		order = new OrderTable();
		order.setOrder_id(2);
		order.setCustomer_id(2);
		order.setOrder_price(19.06);
		order.setDate_of_purchase("2018/05/30 11:00:45");
		
		orderList = new ArrayList<OrderTable>();
		orderList.add(order);
		
		
		orderToPlace = new OrderTable();
		orderToPlace.setCustomer_id(1);
		orderToPlace.setOrder_price(19.26);
		orderToPlace.setDate_of_purchase("2018/05/28 21:02:44");
		
		
		orderToDelete = new OrderTable();
		orderToDelete.setOrder_id(1);
		orderToDelete.setCustomer_id(1);
		orderToDelete.setOrder_price(8.78);
		orderToDelete.setDate_of_purchase("2018/05/30 11:00:45");
		
	}
	
	
	@Test
	public void getOrderTableByIdTest() throws SQLException {
		assertThat(otDAO.getOrderTableById(2), equalTo(order));
	}
	
	@Test
	public void getAllOrdersByCustomerIdTest() throws SQLException {
		assertThat(otDAO.getAllOrdersByCustomerId(2), equalTo(orderList));
	}
	
	@Test
	public void PlaceOrderTest() throws SQLException {
		assertThat(otDAO.PlaceOrder(orderToPlace), equalTo(1));
	}
	
//	@Test
//	public void CancelOrderTest() throws SQLException {
//		assertThat(otDAO.CancelOrder(orderToDelete), equalTo(1));
//	}
}
