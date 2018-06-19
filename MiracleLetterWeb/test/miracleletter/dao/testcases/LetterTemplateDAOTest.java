package miracleletter.dao.testcases;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import miracleletter.dao.LetterTemplateDAO;
import miracleletter.models.LetterTemplate;

public class LetterTemplateDAOTest {
	
	private LetterTemplateDAO lDAO;
	private LetterTemplate letter;
	private LetterTemplate letter2;
	private LetterTemplate letter3;
	private List<LetterTemplate> letters;
	
	@Before
	public void testPrep() {
		lDAO = new LetterTemplateDAO();
		
		letter = new LetterTemplate();
		letter.setLetter_template_id(1);
		letter.setLetter_template_name("ocean");
		letter.setLetter_template_description("For those who want to add depth to their letters.");
		letter.setLetter_template_base_price(7.99);
		
		letter2 = new LetterTemplate();
		letter2.setLetter_template_id(2);
		letter2.setLetter_template_name("sky");
		letter2.setLetter_template_description("Let your creativity soar. The sky's the limit!");
		letter2.setLetter_template_base_price(8.49);
		
		letter3 = new LetterTemplate();
		letter3.setLetter_template_id(3);
		letter3.setLetter_template_name("fruit basket");
		letter3.setLetter_template_description("If you need some flavor, this is the letter for you.");
		letter3.setLetter_template_base_price(7.49);
		
		
		letters = new ArrayList<LetterTemplate>();
		letters.add(letter);
		letters.add(letter2);
		letters.add(letter3);
	}
	
	@Test
	public void getAllLetterTemplates() throws SQLException {
		assertThat(lDAO.getAllLetterTemplates(), equalTo(letters));
	}
	
	@Test
	public void getLetterTemplateByNameTest() throws SQLException {
		assertThat(lDAO.getLetterTemplateByName("sky"), equalTo(letter2));
	}
}
