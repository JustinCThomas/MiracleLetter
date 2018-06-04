package miracleletter.dao.testcases;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import miracleletter.dao.OrderItemTableDAO;
import miracleletter.models.OrderItemTable;

public class OrderItemTableDAOTest {
	
	private OrderItemTableDAO oitDAO;
	private OrderItemTable orderItem;
	private List<OrderItemTable> orderItemList; 
	private OrderItemTable orderItemToAdd;
	
	@Before
	public void testPrep() {
		oitDAO = new OrderItemTableDAO();
		
		
		orderItem = new OrderItemTable();
		
		
		orderItemList = new ArrayList<OrderItemTable>();
		
		
		orderItemToAdd = new OrderItemTable();
		
		
	}
	
	@Test
	public void getOrderItemByOrderItemIdTest() throws SQLException {
		assertThat(oitDAO.getOrderItemByOrderItemId(1), equalTo(orderItem));
	}
	
	@Test
	public void getOrderItemsByOrderIdTest() throws SQLException {
		assertThat(oitDAO.getOrderItemsByOrderId(2), equalTo(orderItemList));
	}
	
	@Test
	public void addOrderItemTest() throws SQLException {
		assertThat(oitDAO.addOrderItem(orderItemToAdd), equalTo(1));
	}
	
}
