package corejava.systeminterfaces;

import java.sql.SQLException;

import miracleletter.models.Envelope;

public interface EnvelopeDAOI {
	public Envelope getEnvelopeById(int id) throws SQLException;
}
