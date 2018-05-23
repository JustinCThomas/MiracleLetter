package CoreJava.systemInterfaces;

import java.sql.SQLException;

import MiracleLetter.Models.Envelope;

public interface EnvelopeDAOI {
	public Envelope getEnvelopeById(int id) throws SQLException;
}
