package corejava.systeminterfaces;

import java.sql.SQLException;
import java.util.List;

import miracleletter.models.OrderItemTable;

public interface OrderItemTableDAOI {
	public OrderItemTable getOrderItemByOrderItemId(Integer id) throws SQLException;
	
	public List<OrderItemTable> getOrderItemsByOrderId(Integer id) throws SQLException;
	
	public Integer addOrderItem(OrderItemTable orderItem) throws SQLException;
}
