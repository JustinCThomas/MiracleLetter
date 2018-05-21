package CoreJava.systemInterfaces;

import java.sql.SQLException;
import java.util.List;

import MiracleLetter.Models.OrderTable;

public interface OrderTableDAOI {
	public OrderTable getOrderTableById(Integer id) throws SQLException;
	
	public List<OrderTable> getAllOrdersByCustomerId(Integer id) throws SQLException;
	
	public Integer PlaceOrder(OrderTable order) throws SQLException;
	
	public Integer CancelOrder(OrderTable order) throws SQLException;
}
