package miracleletter.models;

public class OrderItemTable {
	private int order_item_id;
	private int order_id;
	private int letter_template_id;
	private int envelope_id;
	private double price_of_item;
	private String address_of_recipient;
	
	
	public OrderItemTable() {
		
	}
	
	public OrderItemTable(int order_item_id, int order_id, int letter_template_id, int envelope_id, double price_of_item,
			String address_of_recipient) {
		this.order_item_id = order_item_id;
		this.order_id = order_id;
		this.letter_template_id = letter_template_id;
		this.envelope_id = envelope_id;
		this.price_of_item = price_of_item;
		this.address_of_recipient = address_of_recipient;
	}

	public int getOrder_item_id() {
		return order_item_id;
	}

	public void setOrder_item_id(int order_item_id) {
		this.order_item_id = order_item_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getLetter_template_id() {
		return letter_template_id;
	}

	public void setLetter_template_id(int letter_template_id) {
		this.letter_template_id = letter_template_id;
	}

	public int getEnvelope_id() {
		return envelope_id;
	}

	public void setEnvelope_id(int envelope_id) {
		this.envelope_id = envelope_id;
	}

	public double getPrice_of_item() {
		return price_of_item;
	}

	public void setPrice_of_item(double price_of_item) {
		this.price_of_item = price_of_item;
	}

	public String getAddress_of_recipient() {
		return address_of_recipient;
	}

	public void setAddress_of_recipient(String address_of_recipient) {
		this.address_of_recipient = address_of_recipient;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemTable other = (OrderItemTable) obj;
		if (address_of_recipient == null) {
			if (other.address_of_recipient != null)
				return false;
		} else if (!address_of_recipient.equals(other.address_of_recipient))
			return false;
		if (envelope_id != other.envelope_id)
			return false;
		if (letter_template_id != other.letter_template_id)
			return false;
		if (order_id != other.order_id)
			return false;
		if (order_item_id != other.order_item_id)
			return false;
		if (Double.doubleToLongBits(price_of_item) != Double.doubleToLongBits(other.price_of_item))
			return false;
		return true;
	}	
	
}
