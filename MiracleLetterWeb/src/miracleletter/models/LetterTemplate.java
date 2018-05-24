package miracleletter.models;

public class LetterTemplate {
	private int letter_template_id;
	private String letter_template_name;
	private String letter_template_description;
	private double letter_template_base_price;
	
	
	public LetterTemplate() {
		
	}
	
	public LetterTemplate(int letter_template_id, String letter_template_name, String letter_template_description,
			double letter_template_base_price) {
		this.letter_template_id = letter_template_id;
		this.letter_template_name = letter_template_name;
		this.letter_template_description = letter_template_description;
		this.letter_template_base_price = letter_template_base_price;
	}

	public int getLetter_template_id() {
		return letter_template_id;
	}

	public void setLetter_template_id(int letter_template_id) {
		this.letter_template_id = letter_template_id;
	}

	public String getLetter_template_name() {
		return letter_template_name;
	}

	public void setLetter_template_name(String letter_template_name) {
		this.letter_template_name = letter_template_name;
	}

	public String getLetter_template_description() {
		return letter_template_description;
	}

	public void setLetter_template_description(String letter_template_description) {
		this.letter_template_description = letter_template_description;
	}

	public double getLetter_template_base_price() {
		return letter_template_base_price;
	}

	public void setLetter_template_base_price(double letter_template_base_price) {
		this.letter_template_base_price = letter_template_base_price;
	}
}
