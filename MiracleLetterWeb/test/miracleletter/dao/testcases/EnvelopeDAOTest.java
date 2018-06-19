package miracleletter.dao.testcases;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import miracleletter.dao.EnvelopeDAO;
import miracleletter.models.Envelope;

public class EnvelopeDAOTest {

	private EnvelopeDAO eDAO;
	private Envelope envelope;
	private Envelope envelope2;
	private Envelope envelope3;
	private Envelope envelope4;
	private Envelope envelope5;
	private Envelope envelope6;
	private List<Envelope> envelopes;
	
	@Before
	public void testPrep() {
		eDAO = new EnvelopeDAO();
		
		envelope = new Envelope();
		envelope.setEnvelope_id(1);
		envelope.setEnvelope_type("Regular");
		envelope.setEnvelope_color("White");
		envelope.setEnvelope_price(1.29);
		
		envelope2 = new Envelope();
		envelope2.setEnvelope_id(2);
		envelope2.setEnvelope_type("Window");
		envelope2.setEnvelope_color("White");
		envelope2.setEnvelope_price(1.49);
		
		envelope3 = new Envelope();
		envelope3.setEnvelope_id(3);
		envelope3.setEnvelope_type("Regular");
		envelope3.setEnvelope_color("Blue");
		envelope3.setEnvelope_price(1.49);
		
		envelope4 = new Envelope();
		envelope4.setEnvelope_id(4);
		envelope4.setEnvelope_type("Window");
		envelope4.setEnvelope_color("Blue");
		envelope4.setEnvelope_price(1.79);
		
		envelope5 = new Envelope();
		envelope5.setEnvelope_id(5);
		envelope5.setEnvelope_type("Regular");
		envelope5.setEnvelope_color("Red");
		envelope5.setEnvelope_price(1.49);
		
		envelope6 = new Envelope();
		envelope6.setEnvelope_id(6);
		envelope6.setEnvelope_type("Window");
		envelope6.setEnvelope_color("Red");
		envelope6.setEnvelope_price(1.79);
		
		envelopes = new ArrayList<Envelope>();
		
		envelopes.add(envelope);
		envelopes.add(envelope2);
		envelopes.add(envelope3);
		envelopes.add(envelope4);
		envelopes.add(envelope5);
		envelopes.add(envelope6);
		
	}
	
	@Test
	public void getAllEnvelopesTest() throws SQLException {
		assertThat(eDAO.getAllEnvelopes(), equalTo(envelopes));
	}
	
	@Test
	public void getEnvelopeByIdTest() throws SQLException {
		assertThat(eDAO.getEnvelopeById(1), equalTo(envelope));
	}
}
