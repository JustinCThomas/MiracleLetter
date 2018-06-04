package miracleletter.models;

public class OrderTable {
	private int order_id;
	private int customer_id;
	private double order_price;
	private String date_of_purchase;

	
	public OrderTable() {
		
	}
	
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
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customer_id;
		result = prime * result + ((date_of_purchase == null) ? 0 : date_of_purchase.hashCode());
		result = prime * result + order_id;
		long temp;
		temp = Double.doubleToLongBits(order_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderTable other = (OrderTable) obj;
		if (customer_id != other.customer_id)
			return false;
		if (date_of_purchase == null) {
			if (other.date_of_purchase != null)
				return false;
		} else if (!date_of_purchase.equals(other.date_of_purchase))
			return false;
		if (order_id != other.order_id)
			return false;
		if (Double.doubleToLongBits(order_price) != Double.doubleToLongBits(other.order_price))
			return false;
		return true;
	}
	
	
}
