package miracleletter.dao.testcases;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import miracleletter.dao.EnvelopeDAO;
import miracleletter.models.Envelope;

public class EnvelopeDAOTest {

	private EnvelopeDAO eDAO;
	private Envelope envelope;
	
	@Before
	public void testPrep() {
		eDAO = new EnvelopeDAO();
		envelope = new Envelope();
		envelope.setEnvelope_id(1);
		envelope.setEnvelope_type("Regular");
		envelope.setEnvelope_color("White");
		envelope.setEnvelope_price(1.29);
	}
	
	@Test
	public void getEnvelopeByIdTest() throws SQLException {
		assertThat(eDAO.getEnvelopeById(1), equalTo(envelope));
	}
}
