package utils;

public class OracleQueries {
//	public final static String ALLCUSTOMERS = "SELECT * FROM customer ";
	
	public final static String CUSTOMERBYEMAIL = "SELECT * FROM customer "
			+ "WHERE email_address = ?";
	
	public final static String REGISTERCUSTOMER = "INSERT INTO customer "
			+ "(email_address, password) "
			+ "VALUES (?, ?)";
	
	public final static String UPDATECUSTOMERPASSWORD = "UPDATE customer "
			+ "SET password = ? "
			+ "WHERE email_address = ?";
	
	public final static String DELETECUSTOMERBYEMAIL = "DELETE FROM customer "
			+ "WHERE email_address = ?";
	
	public final static String LETTERTEMPLATEBYNAME = "SELECT * FROM letter_template "
			+ "WHERE letter_template_name = ?";
	
	public final static String ENVELOPEBYID = "SELECT * FROM envelope "
			+ "WHERE envelope_id = ?";
	
	public final static String ORDERBYID = "SELECT * FROM order_table "
			+ "WHERE order_id = ?";
	
	public final static String ALLORDERSBYCUSTOMERID = "SELECT * FROM order_table "
			+ "WHERE customer_id = ? "
			+ "ORDER BY date_of_purchase DESC, order_id ASC";
	
	public final static String PLACEORDER = "INSERT INTO order_table "
			+ "(customer_id, order_price, date_of_purchase) "
			+ "VALUES (?, ?, TO_TIMESTAMP(?, 'yyyy/mm/dd hh24:mi:ss.ff'))";
	
	public final static String DELETEORDER = "DELETE FROM order_table "
			+ "WHERE order_id = ?";
	
	public final static String ORDERITEMBYORDERITEMID = "SELECT * FROM order_item_table "
			+ "WHERE order_item_id = ?";
	
	public final static String ORDERITEMSBYORDERID = "SELECT * FROM order_item_table "
			+ "WHERE order_id = ?";
	
	public final static String ADDORDERITEM = "INSERT INTO order_item_table "
			+ "(order_id, letter_template_id, envelope_id, price_of_item, address_of_recipient "
			+ "VALUES (?, ?, ?, ?, ?)";
	
	
}
