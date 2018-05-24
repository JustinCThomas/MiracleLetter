package miracleletter.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import miracleletter.models.OrderTable;
import corejava.systeminterfaces.OrderTableDAOI;
import utils.OracleQueries;

public class OrderTableDAO implements OrderTableDAOI {
	public OrderTable getOrderTableById(Integer id) throws SQLException {
		OrderTable order = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ORDERBYID);
			stmt.setInt(1, id);
			result = stmt.executeQuery();
			
			if (result.next()) {
				order = new OrderTable(id, result.getInt(2),
						result.getDouble(3), result.getString(4));
				System.out.println("Order has been created.");
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
		
		return order;
	}
	
	@Override
	public List<OrderTable> getAllOrdersByCustomerId(Integer id) throws SQLException {
		List<OrderTable> orders = new ArrayList<OrderTable>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ALLORDERSBYCUSTOMERID);
			stmt.setInt(1, id);
			result = stmt.executeQuery();
			
			while (result.next()) {
				orders.add(new OrderTable(result.getInt(1), result.getInt(2),
						result.getDouble(3), result.getString(4)));
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
		
		return orders;
	}
	
	public Integer PlaceOrder(OrderTable order) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.PLACEORDER);
			stmt.setInt(1, order.getCustomer_id());
			stmt.setDouble(2, order.getOrder_price());
			result = stmt.executeUpdate();
			
			if (result != 0) {
				System.out.println("Order was successfully placed.");
			} else {
				System.out.println("Error: The order was not placed.");
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
	
	public Integer CancelOrder(OrderTable order) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.DELETEORDER);
			stmt.setInt(1, order.getOrder_id());
			result = stmt.executeUpdate();
			if (result != 0) {
				System.out.println("Order was successfully deleted from the database.");
			} else {
				System.out.println("Error: The order was not successfully deleted.");
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
