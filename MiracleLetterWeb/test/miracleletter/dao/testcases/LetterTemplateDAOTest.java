package miracleletter.dao.testcases;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import miracleletter.dao.LetterTemplateDAO;
import miracleletter.models.LetterTemplate;

public class LetterTemplateDAOTest {
	
	private LetterTemplateDAO lDAO;
	private LetterTemplate letter;
	
	@Before
	public void testPrep() {
		lDAO = new LetterTemplateDAO();
		letter = new LetterTemplate();
		letter.setLetter_template_id(2);
		letter.setLetter_template_name("sky");
		letter.setLetter_template_description("Let your creativity soar. The sky's the limit!");
		letter.setLetter_template_base_price(8.49);
	}
	
	@Test
	public void getLetterTemplateByNameTest() throws SQLException {
		assertThat(lDAO.getLetterTemplateByName("sky").getLetter_template_description(), 
				equalTo(letter.getLetter_template_description()));
	}
}
