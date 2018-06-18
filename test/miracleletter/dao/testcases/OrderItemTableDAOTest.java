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
	private OrderItemTable orderItem2;
	private OrderItemTable orderItem3;
	private List<OrderItemTable> orderItemList; 
	private OrderItemTable orderItemToAdd;
	
	@Before
	public void testPrep() {
		oitDAO = new OrderItemTableDAO();
		
		
		orderItem = new OrderItemTable();
		orderItem.setOrder_item_id(4);
		orderItem.setOrder_id(3);
		orderItem.setLetter_template_id(1);
		orderItem.setEnvelope_id(3);
		orderItem.setPrice_of_item(9.48);
		orderItem.setAddress_of_recipient("273 Hunts Point");
		
		
		orderItem2 = new OrderItemTable();
		orderItem2.setOrder_item_id(2);
		orderItem2.setOrder_id(2);
		orderItem2.setLetter_template_id(1);
		orderItem2.setEnvelope_id(4);
		orderItem2.setPrice_of_item(9.78);
		orderItem2.setAddress_of_recipient("1400 Windmill Path");
		
		orderItem3 = new OrderItemTable();
		orderItem3.setOrder_item_id(3);
		orderItem3.setOrder_id(2);
		orderItem3.setLetter_template_id(3);
		orderItem3.setEnvelope_id(6);
		orderItem3.setPrice_of_item(9.28);
		orderItem3.setAddress_of_recipient("1620 Fulton Street");
		
		orderItemList = new ArrayList<OrderItemTable>();
		orderItemList.add(orderItem2);
		orderItemList.add(orderItem3);
		
		orderItemToAdd = new OrderItemTable();
		orderItemToAdd.setOrder_id(5);
		orderItemToAdd.setLetter_template_id(2);
		orderItemToAdd.setEnvelope_id(4);
		orderItemToAdd.setPrice_of_item(10.28);
		orderItemToAdd.setAddress_of_recipient("1544 Windmill Path");
		
	}
	
	@Test
	public void getOrderItemByOrderItemIdTest() throws SQLException {
		assertThat(oitDAO.getOrderItemByOrderItemId(4), equalTo(orderItem));
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
