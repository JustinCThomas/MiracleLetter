package miracleletter.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import miracleletter.models.OrderItemTable;
import corejava.systeminterfaces.OrderItemTableDAOI;
import utils.OracleQueries;

public class OrderItemTableDAO implements OrderItemTableDAOI {

	public OrderItemTable getOrderItemByOrderItemId(Integer id) throws SQLException {
		OrderItemTable orderItem = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ORDERITEMBYORDERITEMID);
			stmt.setInt(1, id);
			result = stmt.executeQuery();
			
			if (result.next()) {
				orderItem = new OrderItemTable(result.getInt(1), result.getInt(2), 
						result.getInt(3), result.getInt(4), result.getDouble(5), 
						result.getString(6));
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
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
		
		return orderItem;
	}

	
	public List<OrderItemTable> getOrderItemsByOrderId(Integer id) throws SQLException {
		List<OrderItemTable> orderItems = new ArrayList<OrderItemTable>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ORDERITEMSBYORDERID);
			stmt.setInt(1, id);
			result = stmt.executeQuery();
			
			while (result.next()) {
				orderItems.add(new OrderItemTable(result.getInt(1), result.getInt(2), 
						result.getInt(3), result.getInt(4), result.getDouble(5), 
						result.getString(6)));
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
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
		
		return orderItems;
	}

	
	public Integer addOrderItem(OrderItemTable orderItem) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ADDORDERITEM);
			stmt.setInt(1, orderItem.getOrder_id());
			stmt.setInt(2, orderItem.getLetter_template_id());
			stmt.setInt(3, orderItem.getEnvelope_id());
			stmt.setDouble(4, orderItem.getPrice_of_item());
			stmt.setString(5, orderItem.getAddress_of_recipient());
			result = stmt.executeUpdate();
			
			if (result != 0) {
				System.out.println("Order Item was added to database.");
			} else {
				System.out.println("Error: Order Item was not added.");
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
