package MiracleLetter.Models;

public class OrderTable {
	private int order_id;
	private int customer_id;
	private double order_price;
	private String date_of_purchase;

	
	public OrderTable(int order_id, int customer_id, double order_price, String date_of_purchase) {
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.order_price = order_price;
		this.date_of_purchase = date_of_purchase;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public double getOrder_price() {
		return order_price;
	}

	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}

	public String getDate_of_purchase() {
		return date_of_purchase;
	}

	public void setDate_of_purchase(String date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}
}
