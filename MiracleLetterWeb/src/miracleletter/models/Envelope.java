package miracleletter.models;

public class Envelope {
	private int envelope_id;
	private String envelope_type;
	private String envelope_color;
	private double envelope_price;
	
	
	public Envelope() {
		
	}
	
	public Envelope(int envelope_id, String envelope_type, String envelope_color,
			double envelope_price) {
		this.envelope_id = envelope_id;
		this.envelope_type = envelope_type;
		this.envelope_color = envelope_color;
		this.envelope_price = envelope_price;
	}

	public int getEnvelope_id() {
		return envelope_id;
	}

	public void setEnvelope_id(int envelope_id) {
		this.envelope_id = envelope_id;
	}

	public String getEnvelope_type() {
		return envelope_type;
	}

	public void setEnvelope_type(String envelope_type) {
		this.envelope_type = envelope_type;
	}

	public String getEnvelope_color() {
		return envelope_color;
	}

	public void setEnvelope_color(String envelope_color) {
		this.envelope_color = envelope_color;
	}

	public double getEnvelope_price() {
		return envelope_price;
	}

	public void setEnvelope_price(double envelope_price) {
		this.envelope_price = envelope_price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Envelope other = (Envelope) obj;
		if (envelope_color == null) {
			if (other.envelope_color != null)
				return false;
		} else if (!envelope_color.equals(other.envelope_color))
			return false;
		if (envelope_id != other.envelope_id)
			return false;
		if (Double.doubleToLongBits(envelope_price) != Double.doubleToLongBits(other.envelope_price))
			return false;
		if (envelope_type == null) {
			if (other.envelope_type != null)
				return false;
		} else if (!envelope_type.equals(other.envelope_type))
			return false;
		return true;
	}
	
	
	
	
}
